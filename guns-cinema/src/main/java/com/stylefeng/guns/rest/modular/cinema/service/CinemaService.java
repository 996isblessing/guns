package com.stylefeng.guns.rest.modular.cinema.service;


import com.stylefeng.guns.rest.common.persistence.model.ResponseVo;
import com.stylefeng.guns.rest.common.persistence.model.inputparam.CinemaQueryVO;
import com.stylefeng.guns.rest.common.persistence.model.result.Result;

public interface CinemaService  {
    Result getCinemas(CinemaQueryVO cinemaQueryVO);

    Result getCondition(Integer brandId, Integer hallType, Integer areaId);

    ResponseVo getFields(int cinemaId);


}
