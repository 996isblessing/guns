package com.stylefeng.guns.rest.modular.cinema.model;

import java.io.Serializable;

public class CinemaData implements Serializable {
    private static final long serialVersionUID = 79717759053916775L;
    MyFilmInfo myFilmInfo;
    CinemaInfo cinemaInfo;
    HallInfo hallInfo;

    public CinemaData() {
    }

    public CinemaData(MyFilmInfo myFilmInfo, CinemaInfo cinemaInfo, HallInfo hallInfo) {
        this.myFilmInfo = myFilmInfo;
        this.cinemaInfo = cinemaInfo;
        this.hallInfo = hallInfo;
    }

    public MyFilmInfo getMyFilmInfo() {
        return myFilmInfo;
    }

    public void setMyFilmInfo(MyFilmInfo myFilmInfo) {
        this.myFilmInfo = myFilmInfo;
    }

    public CinemaInfo getCinemaInfo() {
        return cinemaInfo;
    }

    public void setCinemaInfo(CinemaInfo cinemaInfo) {
        this.cinemaInfo = cinemaInfo;
    }

    public HallInfo getHallInfo() {
        return hallInfo;
    }

    public void setHallInfo(HallInfo hallInfo) {
        this.hallInfo = hallInfo;
    }

    @Override
    public String toString() {
        return "CinemaData{" +
                "myFilmInfo=" + myFilmInfo +
                ", cinemaInfo=" + cinemaInfo +
                ", hallInfo=" + hallInfo +
                '}';
    }
}
