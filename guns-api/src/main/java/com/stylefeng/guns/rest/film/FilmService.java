package com.stylefeng.guns.rest.film;


import com.stylefeng.guns.rest.common.persistence.model.filmcondition.FilmConditionVoW;
import com.stylefeng.guns.rest.common.persistence.model.index.IndexResultW;

public interface FilmService {
   public IndexResultW queryIndexMsg();
   public FilmConditionVoW getFilmCondition();
   public String myTest();
}
