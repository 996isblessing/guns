package com.stylefeng.guns.rest.modular.film.service;

import com.stylefeng.guns.rest.common.persistence.model.DataVO;

public interface FilmSearchDetailService {
    DataVO queryDataByFilmId(int FilmId);
    DataVO queryDataByFilmName(String filmName);
}
