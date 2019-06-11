package com.stylefeng.guns.rest.modular.film.service;




import com.stylefeng.guns.rest.common.persistence.model.FilmSearchVO;
import com.stylefeng.guns.rest.common.persistence.model.FilmSearchRequestVO;


import java.util.List;


public interface FilmSearchService {
    List<FilmSearchVO> queryFilmSearchContentT(FilmSearchRequestVO filmSearchRequestVO);
    int queryFilmSearchContentTCount(FilmSearchRequestVO filmSearchRequestVO);
}
