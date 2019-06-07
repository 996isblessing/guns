package com.stylefeng.guns.rest.modular.cinema.model;

import java.util.List;

public class Data {
    Object cinemaInfo;
    List<?> filmList;

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
