package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {
    Object cinemaInfo;
    List<?> filmList;
    Object filmInfo;
    Object hallInfo;

    public Data() {
    }

    public Data(Object cinemaInfo, List<?> filmList, Object filmInfo, Object hallInfo) {
        this.cinemaInfo = cinemaInfo;
        this.filmList = filmList;
        this.filmInfo = filmInfo;
        this.hallInfo = hallInfo;
    }

    public Object getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(Object filmInfo) {
        this.filmInfo = filmInfo;
    }

    public Object getHallInfo() {
        return hallInfo;
    }

    public void setHallInfo(Object hallInfo) {
        this.hallInfo = hallInfo;
    }

    public Object getCinemaInfo() {
        return cinemaInfo;
    }

    public void setCinemaInfo(Object cinemaInfo) {
        this.cinemaInfo = cinemaInfo;
    }

    public List getFilmList() {
        return filmList;
    }

    public void setFilmList(List filmList) {
        this.filmList = filmList;
    }
}
