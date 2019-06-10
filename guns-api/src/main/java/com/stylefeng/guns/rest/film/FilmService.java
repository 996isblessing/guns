package com.stylefeng.guns.rest.film;


import com.stylefeng.guns.rest.common.persistence.model.filmcondition.FilmConditionVo;
import com.stylefeng.guns.rest.common.persistence.model.index.IndexResult;

public interface FilmService {
   public IndexResult queryIndexMsg();
   public FilmConditionVo getFilmCondition();
   public String myTest();
}
