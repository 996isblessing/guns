package com.stylefeng.guns.rest.modular.cinema.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.rest.common.persistence.dao.MyCinemaMapper;
import com.stylefeng.guns.rest.common.persistence.model.MtimeAreaDictT;
import com.stylefeng.guns.rest.common.persistence.model.MtimeBrandDictT;
import com.stylefeng.guns.rest.common.persistence.model.MtimeCinemaT;
import com.stylefeng.guns.rest.common.persistence.model.MtimeHallDictT;
import com.stylefeng.guns.rest.modular.cinema.model.*;
import com.stylefeng.guns.rest.modular.cinema.myinterface.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Keniefu
 */
@Service(interfaceClass = CinemaService.class)
@Component
public class CinemaServiceImpl implements CinemaService{

    @Autowired
    MyCinemaMapper myCinemaMapper;
    @Autowired
    IMtimeCinemaTService iMtimeCinemaTService;
    @Autowired
    IMtimeBrandDictTService iMtimeBrandDictTService;
    @Autowired
    IMtimeHallDictTService iMtimeHallDictTService;
    @Autowired
    IMtimeAreaDictTService iMtimeAreaDictTService;

    @Override
    public CinemaResult getFieldInfo(int cinemaId, int fieldId) {
        CinemaData cinemaData = myCinemaMapper.getFieldInfo(cinemaId,fieldId);
        CinemaResult result = new CinemaResult(0, "http://img.meetingshop.cn/", cinemaData);
        return result;
    }

    @Override
    public Result getCinemas(CinemaQueryVO cinemaQueryVO) {
        EntityWrapper<MtimeCinemaT> ew=new EntityWrapper<>();
        if (cinemaQueryVO.getBrandId() != 99) {
            ew.eq("brand_id", cinemaQueryVO.getBrandId());
        }
        if (cinemaQueryVO.getHalltypeId() != 99) {
            ew.like("hall_ids","%#"+ cinemaQueryVO.getHalltypeId() +"#%");
        }
        if (cinemaQueryVO.getAreaId() != 99) {
            ew.eq("area_id", cinemaQueryVO.getAreaId());
        }
        GetCinemasResult cinemasResult = null;
        try {
            Page<MtimeCinemaT> mtimeCinemaTPage = new Page<>(cinemaQueryVO.getNowPage(), cinemaQueryVO.getPageSize());
            Page page = iMtimeCinemaTService.selectPage(mtimeCinemaTPage, ew);
            List<CinemaVO> list = new ArrayList<>();
            List<MtimeCinemaT> records = page.getRecords();
            for (MtimeCinemaT record : records) {
                CinemaVO cinemaVO = new CinemaVO(record.getUuid(), record.getCinemaName(), record.getCinemaAddress(), Double.parseDouble(record.getMinimumPrice().toString()));
                list.add(cinemaVO);
            }
            int size = page.getSize();
            long total = page.getTotal();
            cinemasResult = new GetCinemasResult(0, cinemaQueryVO.getNowPage(), (int) ((total-1)/size)+1, list);
        } catch (Exception e) {
            return new ExceptionResult(1, "影院信息查询失败");
        }
        return cinemasResult;
    }

    @Override
    public Result getCondition(Integer brandId, Integer hallType, Integer areaId) {
        try {
            List<MtimeBrandDictT> mtimeBrandDictTS = iMtimeBrandDictTService.selectList(new EntityWrapper<>());
            List brandList = new ArrayList();
            for (MtimeBrandDictT mtimeBrandDictT : mtimeBrandDictTS) {
                MyBrand myBrand = null;
                if (mtimeBrandDictT.getUuid() != 99) {
                    myBrand = new MyBrand(String.valueOf(mtimeBrandDictT.getUuid()), mtimeBrandDictT.getShowName(), false);
                } else {
                    myBrand = new MyBrand(String.valueOf(mtimeBrandDictT.getUuid()), mtimeBrandDictT.getShowName(), true);
                }
                brandList.add(myBrand);
            }

            List<MtimeAreaDictT> mtimeAreaDictTS = iMtimeAreaDictTService.selectList(new EntityWrapper<>());
            List areaList = new ArrayList();
            for (MtimeAreaDictT mtimeAreaDictT : mtimeAreaDictTS) {
                MyArea myArea = null;
                if (mtimeAreaDictT.getUuid() != 99) {
                    myArea = new MyArea(String.valueOf(mtimeAreaDictT.getUuid()), mtimeAreaDictT.getShowName(), false);
                } else {
                    myArea = new MyArea(String.valueOf(mtimeAreaDictT.getUuid()), mtimeAreaDictT.getShowName(), true);
                }
                areaList.add(myArea);
            }

            List<MtimeHallDictT> mtimeHallDictTS = iMtimeHallDictTService.selectList(new EntityWrapper<>());
            List halltypeList = new ArrayList();
            for (MtimeHallDictT mtimeHallDictT : mtimeHallDictTS) {
                MyHalltype myHalltype = null;
                if (mtimeHallDictT.getUuid() != 99) {
                    myHalltype = new MyHalltype(String.valueOf(mtimeHallDictT.getUuid()), mtimeHallDictT.getShowName(), false);
                } else {
                    myHalltype = new MyHalltype(String.valueOf(mtimeHallDictT.getUuid()), mtimeHallDictT.getShowName(), true);
                }
                halltypeList.add(myHalltype);
            }

            GetConditionResult getConditionResult = new GetConditionResult(0, new ConditionVO(brandList, areaList, halltypeList));
            return getConditionResult;
        } catch (Exception e) {
            e.printStackTrace();
            return new ExceptionResult(1, "影院信息查询失败");
        }
    }


}
