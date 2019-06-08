package com.stylefeng.guns.rest.modular.cinema.service.impl;





import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stylefeng.guns.rest.cinema.CinemaService;
import com.stylefeng.guns.rest.common.persistence.dao.*;
import com.stylefeng.guns.rest.common.persistence.model.*;
import com.stylefeng.guns.rest.common.persistence.model.generator.*;
import com.stylefeng.guns.rest.common.persistence.model.inputparam.CinemaQueryVO;
import com.stylefeng.guns.rest.common.persistence.model.outputparam.*;
import com.stylefeng.guns.rest.common.persistence.model.result.ExceptionResult;
import com.stylefeng.guns.rest.common.persistence.model.result.GetCinemasResult;
import com.stylefeng.guns.rest.common.persistence.model.result.GetConditionResult;
import com.stylefeng.guns.rest.common.persistence.model.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(interfaceClass = CinemaService.class)
@Component
public class CinemaServiceImpl implements CinemaService {
    @Autowired(required = false)
    CinemaMapper cinemaMapper;
    @Autowired(required = false)
    BrandDictMapper brandDictMapper;
    @Autowired(required = false)
    AreaDictMapper areaDictMapper;
    @Autowired(required = false)
    HallDictMapper hallDictMapper;
    @Autowired(required = false)
    FieldMapper fieldMapper;
    @Autowired(required = false)
    CinemaInfoMapper cinemaInfoMapper;
    @Autowired(required = false)
    FilmInfoMapper filmInfoMapper;
    @Autowired(required = false)
    HallFilmInfoMapper hallFilmInfoMapper;
    @Autowired
    HallInfoMapper hallInfoMapper;

    @Override
    public Result getCinemas(CinemaQueryVO cinemaQueryVO) {
        PageHelper.startPage(cinemaQueryVO.getNowPage(), cinemaQueryVO.getPageSize());
        CinemaExample cinemaExample = new CinemaExample();
        CinemaExample.Criteria criteria = cinemaExample.createCriteria();
        if (cinemaQueryVO.getBrandId() != 99) {
            criteria.andBrandIdEqualTo(cinemaQueryVO.getBrandId());
        }
        if (cinemaQueryVO.getDistrictId() != 99) {
            criteria.andAreaIdEqualTo(cinemaQueryVO.getDistrictId());
        }
        if (cinemaQueryVO.getHallType() != 99) {
            criteria.andHallIdsLike("%" + cinemaQueryVO.getHallType() + "#%");
        }
        List<Cinema> cinemas = null;
        List<CinemaVO> list = new ArrayList<>();
        GetCinemasResult cinemasResult = null;
        try {
            cinemas = cinemaMapper.selectByExample(cinemaExample);
            for (Cinema cinema : cinemas) {
                CinemaVO cinemaVO = new CinemaVO(cinema.getUuid(), cinema.getCinemaName(), cinema.getCinemaAddress(), Double.parseDouble(cinema.getMinimumPrice().toString()));
                list.add(cinemaVO);
            }
            PageInfo<CinemaVO> pageInfo = new PageInfo<>(list);
            cinemasResult = new GetCinemasResult(0, pageInfo.getPageNum(), pageInfo.getPageSize(), list);
        } catch (Exception e) {
            return new ExceptionResult(1, "影院信息查询失败");
        }
        return cinemasResult;
    }

    @Override
    public Result getCondition(Integer brandId, Integer hallType, Integer areaId) {
       // BrandDictExample brandDictExample = new BrandDictExample();
        BrandDictExample brandDictExample = new BrandDictExample();
        HallDictExample hallDictExample = new HallDictExample();
        AreaDictExample areaDictExample = new AreaDictExample();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        String time = simpleDateFormat.format(date);
        ConditionVO conditionVO = null;
        GetConditionResult getConditionResult = null;
        if (brandId != null && brandId != 99) {
            brandDictExample.createCriteria().andUuidEqualTo(brandId);
        }
        if (hallType != null && hallType != 99) {
            hallDictExample.createCriteria().andUuidEqualTo(hallType);
        }
        if (areaId != null && areaId != 99) {
            areaDictExample.createCriteria().andUuidEqualTo(areaId);
        }
        try {
            List<BrandDict> brandDicts = brandDictMapper.selectByExample(brandDictExample);
            List<MyBrand> brands = new ArrayList<>();
            for (BrandDict brandDict : brandDicts) {
                MyBrand myBrand = new MyBrand(brandDict.getUuid()+"", brandDict.getShowName(), true);
                FieldExample fieldExample = new FieldExample();
                fieldExample.createCriteria().andCinemaIdEqualTo(brandDict.getUuid()).andBeginTimeLessThan(time).andEndTimeGreaterThan(time);
                List<Field> fields = fieldMapper.selectByExample(fieldExample);
                if (fields == null || fields.size() == 0) {
                    myBrand.setActive(false);
                }
                brands.add(myBrand);
            }
            List<HallDict> hallDicts = hallDictMapper.selectByExample(hallDictExample);
            ArrayList<MyHalltype> halltypes = new ArrayList<>();
            for (HallDict hallDict : hallDicts) {
                MyHalltype myHalltype = new MyHalltype(hallDict.getUuid()+"", hallDict.getShowName(), true);
                FieldExample fieldExample = new FieldExample();
                fieldExample.createCriteria().andHallIdEqualTo(hallDict.getUuid()).andBeginTimeLessThan(time).andEndTimeGreaterThan(time);
                List<Field> fields = fieldMapper.selectByExample(fieldExample);
                if (fields == null || fields.size() == 0) {
                    myHalltype.setActive(false);
                }
                halltypes.add(myHalltype);
            }
            List<AreaDict> areaDicts = areaDictMapper.selectByExample(areaDictExample);
            ArrayList<MyArea> myAreas = new ArrayList<>();
            for (AreaDict areaDict : areaDicts) {
                MyArea myArea = new MyArea(areaDict.getUuid()+"", areaDict.getShowName(), true);
                myAreas.add(myArea);
            }
            conditionVO = new ConditionVO(brands, myAreas, halltypes);
            getConditionResult = new GetConditionResult(0, conditionVO);
        } catch (Exception e) {
            return new ExceptionResult(1, "影院信息查询失败");
        }
        return getConditionResult;
    }

    @Override
    public ResponseVo getFields(int cinemaId) {

            Data data = new Data();
            FilmInfo filmInfo = new FilmInfo();
            CinemaInfo cinemaInfo = new CinemaInfo();
            ArrayList<Object> list = new ArrayList<>();
            cinemaInfo = cinemaInfoMapper.selectById(cinemaId);
            List<FilmInfo> filmInfos = filmInfoMapper.selectFilmInfo(cinemaId);
            data.setCinemaInfo(cinemaInfo);
            data.setFilmList(filmInfos);
            ResponseVo responseVo = new ResponseVo();
            if (data != null){
            responseVo.setStatus(0);
            responseVo.setData(data);
            responseVo.setImgPre("http://img.meetingshop.cn/");
            }
            else {
                new ExceptionResult(1, "影院信息查询失败");
            }
            return responseVo;
    }

    @Override
    public ResponseVo getFieldInfo(Integer cinemaId, Integer fieldId) {

        Data data = new Data();
        FilmInfo filmInfo = new FilmInfo();

        CinemaInfo cinemaInfo = new CinemaInfo();
        ArrayList<Object> list = new ArrayList<>();
        cinemaInfo = cinemaInfoMapper.selectById(cinemaId);
        filmInfo = filmInfoMapper.selectFilmInfoLess(fieldId,cinemaId);
        //HallFilmInfo FilmInfo = hallFilmInfoMapper.selectByPrimaryKey(fieldId);

        HallInfo hallInfo = hallInfoMapper.selectByFieldid(fieldId);
        HallDict hallDict = hallDictMapper.selectByPrimaryKey(fieldId);
        System.out.println(hallDict);
        hallInfo.setSeatFile(hallDict.getSeatAddress());
        data.setCinemaInfo(cinemaInfo);
        data.setFilmInfo(filmInfo);
        data.setHallInfo(hallInfo);
        ResponseVo responseVo = new ResponseVo();
        if (data != null){
            responseVo.setStatus(0);
            responseVo.setData(data);
            responseVo.setImgPre("http://img.meetingshop.cn/");
        }
        else {
            new ExceptionResult(1, "影院信息查询失败");
        }
        return responseVo;

    }
}
