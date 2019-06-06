package com.stylefeng.guns.rest.common.persistence.dao;


import com.stylefeng.guns.rest.common.persistence.model.CinemaInfo;

public interface CinemaInfoMapper {

    CinemaInfo selectById(int cinemaId);
}
