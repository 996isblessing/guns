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

import java.util.ArrayList;
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
    @Autowired(required = false)
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
            criteria.andHallIdsLike("%#" + cinemaQueryVO.getHallType() + "#%");
        }
        List<Cinema> cinemas;
        List<CinemaVO> list = new ArrayList<>();
        GetCinemasResult cinemasResult;
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
        BrandDictExample brandDictExample = new BrandDictExample();
        HallDictExample hallDictExample = new HallDictExample();
        AreaDictExample areaDictExample = new AreaDictExample();
        ConditionVO conditionVO;
        GetConditionResult getConditionResult;
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
                if (brandDict.getUuid() == 99) {
                    MyBrand myBrand = new MyBrand(brandDict.getUuid() + "", brandDict.getShowName(), true);
                    brands.add(myBrand);
                } else {
                    MyBrand myBrand = new MyBrand(brandDict.getUuid() + "", brandDict.getShowName(), false);
                    brands.add(myBrand);
                }
            }
            List<HallDict> hallDicts = hallDictMapper.selectByExample(hallDictExample);
            ArrayList<MyHalltype> halltypes = new ArrayList<>();
            for (HallDict hallDict : hallDicts) {
                if (hallDict.getUuid() == 99) {
                    MyHalltype myHalltype = new MyHalltype(hallDict.getUuid() + "", hallDict.getShowName(), true);
                    halltypes.add(myHalltype);
                } else {
                    MyHalltype myHalltype = new MyHalltype(hallDict.getUuid() + "", hallDict.getShowName(), false);
                    halltypes.add(myHalltype);
                }
            }
            List<AreaDict> areaDicts = areaDictMapper.selectByExample(areaDictExample);
            ArrayList<MyArea> myAreas = new ArrayList<>();
            for (AreaDict areaDict : areaDicts) {
                if (areaDict.getUuid() == 99) {
                    MyArea myArea = new MyArea(areaDict.getUuid() + "", areaDict.getShowName(), true);
                    myAreas.add(myArea);
                } else {
                    MyArea myArea = new MyArea(areaDict.getUuid() + "", areaDict.getShowName(), false);
                    myAreas.add(myArea);
                }
            }
            conditionVO = new ConditionVO(brands, myAreas, halltypes);
            getConditionResult = new GetConditionResult(0, conditionVO);
        } catch (Exception e) {
            return new ExceptionResult(1, "影院信息查询失败");
        }
        return getConditionResult;
    }

    @Override
    public Result getFields(int cinemaId) {
        try {
            CinemaInfo cinemaInfo = cinemaInfoMapper.selectById(cinemaId);
            List<FilmInfo> filmInfos = filmInfoMapper.selectFilmInfo(cinemaId);
            Data data = new Data(cinemaInfo, filmInfos, null, null);
            return new ResponseVo(0, "http://img.meetingshop.cn/", data);
        } catch (Exception e) {
            return new ExceptionResult(1, "影院信息查询失败");
        }
    }

    @Override
    public Result getFieldInfo(Integer cinemaId, Integer fieldId) {
        try {
            FilmInfo filmInfo = filmInfoMapper.selectFilmInfoLess(fieldId, cinemaId);
            CinemaInfo cinemaInfo = cinemaInfoMapper.selectById(cinemaId);
            HallInfo hallInfo = hallInfoMapper.selectByFieldid(fieldId);
            HallDict hallDict = hallDictMapper.selectByPrimaryKey(fieldId);
            hallInfo.setSeatFile(hallDict.getSeatAddress());
            Data data = new Data(cinemaInfo, null, filmInfo, hallInfo);
            return new ResponseVo(0, "http://img.meetingshop.cn/", data);
        } catch (Exception e) {
            return new ExceptionResult(1, "影院信息查询失败");
        }
    }
}
