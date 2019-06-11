package com.stylefeng.guns.rest.common.persistence.model.generator;

public class HallFilmInfo {

    private Integer filmId;

    private String filmName;

    private String filmLength;

    private String filmCats;

    private String filmLanguage;

    private String imgAddress;


    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName == null ? null : filmName.trim();
    }

    public String getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength == null ? null : filmLength.trim();
    }

    public String getFilmCats() {
        return filmCats;
    }

    public void setFilmCats(String filmCats) {
        this.filmCats = filmCats == null ? null : filmCats.trim();
    }

    public String getFilmLanguage() {
        return filmLanguage;
    }

    public void setFilmLanguage(String filmLanguage) {
        this.filmLanguage = filmLanguage == null ? null : filmLanguage.trim();
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress == null ? null : imgAddress.trim();
    }
}