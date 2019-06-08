package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class DataMore implements Serializable {
    Object filmInfo;
    Object hallInfo;
    Object cinemaInfo;

    @Override
    public String toString() {
        return "DataMore{" +
                "filmInfo=" + filmInfo +
                ", hallInfo=" + hallInfo +
                ", cinemaInfo=" + cinemaInfo +
                '}';
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
}
