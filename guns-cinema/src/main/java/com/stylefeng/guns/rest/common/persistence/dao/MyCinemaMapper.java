package com.stylefeng.guns.rest.common.persistence.dao;

import com.stylefeng.guns.rest.modular.cinema.model.CinemaData;
import org.apache.ibatis.annotations.Param;

public interface MyCinemaMapper {
    CinemaData getFieldInfo(@Param("cinemaId") int cinemaId, @Param("fieldId") int fieldId);
}
