package com.stylefeng.guns.rest.common.persistence.model.index;

import java.io.Serializable;
import java.util.List;

/**
 * 对应各类电影信息
 */
public class FilmTemplateW implements Serializable {
    Integer filmNum;
    List<FilmInfoW> filmInfoW;

    public Integer getFilmNum() {
        return filmNum;
    }

    public void setFilmNum(Integer filmNum) {
        this.filmNum = filmNum;
    }

    public List<FilmInfoW> getFilmInfoW() {
        return filmInfoW;
    }

    public void setFilmInfoW(List<FilmInfoW> filmInfoW) {
        this.filmInfoW = filmInfoW;
    }

    @Override
    public String toString() {
        return "FilmTemplateW{" +
                "filmNum=" + filmNum +
                ", filmInfoW=" + filmInfoW +
                '}';
    }
}
