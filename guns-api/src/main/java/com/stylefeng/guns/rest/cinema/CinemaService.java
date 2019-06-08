package com.stylefeng.guns.rest.cinema;



import com.stylefeng.guns.rest.common.persistence.model.inputparam.CinemaQueryVO;
import com.stylefeng.guns.rest.common.persistence.model.result.Result;

public interface CinemaService  {
    Result getCinemas(CinemaQueryVO cinemaQueryVO);

    Result getCondition(Integer brandId, Integer hallType, Integer areaId);

    Result getFields(int cinemaId);


    Result getFieldInfo(Integer cinemaId, Integer fieldId);

}
