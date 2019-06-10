package com.stylefeng.guns.rest.common.persistence.model.index;

import java.io.Serializable;
import java.util.List;

/**
 * 对应各类电影信息
 */
public class FilmTemplate implements Serializable {
    Integer filmNum;
    List<FilmInfo> filmInfo;

    public Integer getFilmNum() {
        return filmNum;
    }

    public void setFilmNum(Integer filmNum) {
        this.filmNum = filmNum;
    }

    public List<FilmInfo> getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(List<FilmInfo> filmInfo) {
        this.filmInfo = filmInfo;
    }

    @Override
    public String toString() {
        return "FilmTemplate{" +
                "filmNum=" + filmNum +
                ", filmInfo=" + filmInfo +
                '}';
    }
}
