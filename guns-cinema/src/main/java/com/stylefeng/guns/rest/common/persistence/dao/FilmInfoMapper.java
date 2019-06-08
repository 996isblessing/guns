package com.stylefeng.guns.rest.common.persistence.dao;


import com.stylefeng.guns.rest.common.persistence.model.FilmInfo;

import java.util.List;

public interface FilmInfoMapper {
    List<FilmInfo> selectFilmInfo(int cinemaId);

    FilmInfo selectFilmInfoLess(Integer fieldId,Integer cinemaId);

}
