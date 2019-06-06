package com.stylefeng.guns.rest.common.persistence.model;

import java.util.List;

public class FilmInfo {
    int filmId;
    String filmName;
    String filmLength;
    String filmType;
    String filmCats;
    String actors;
    String imgAddress;
    List <?> filmFields;

    @Override
    public String toString() {
        return "FilmInfo{" +
                "filmId=" + filmId +
                ", filmName='" + filmName + '\'' +
                ", filmLength='" + filmLength + '\'' +
                ", filmType='" + filmType + '\'' +
                ", filmCats='" + filmCats + '\'' +
                ", actors='" + actors + '\'' +
                ", imgAddress='" + imgAddress + '\'' +
                ", filmFields=" + filmFields +
                '}';
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public String getFilmCats() {
        return filmCats;
    }

    public void setFilmCats(String filmCats) {
        this.filmCats = filmCats;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

    public List<?> getFilmFields() {
        return filmFields;
    }

    public void setFilmFields(List<?> filmFields) {
        this.filmFields = filmFields;
    }
}
