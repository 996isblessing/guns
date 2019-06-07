package com.stylefeng.guns.rest.modular.cinema.myinterface;


import com.stylefeng.guns.rest.modular.cinema.model.CinemaQueryVO;
import com.stylefeng.guns.rest.modular.cinema.model.CinemaResult;
import com.stylefeng.guns.rest.modular.cinema.model.ResponseVo;
import com.stylefeng.guns.rest.modular.cinema.model.Result;

public interface CinemaService {
    CinemaResult getFieldInfo(int cinemaId, int fieldId);

    Result getCinemas(CinemaQueryVO cinemaQueryVO);

    Result getCondition(Integer brandId, Integer hallType, Integer areaId);
}
