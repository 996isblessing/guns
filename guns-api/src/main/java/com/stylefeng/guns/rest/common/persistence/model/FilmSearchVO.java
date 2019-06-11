package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class FilmSearchVO implements Serializable {
    String filmId;
    int  filmType;
    String imgAddress;
    String filmName;
    String filmScore;
    int filmStatus;
    //filmCats;
    int filmSource;
    int filmDate;




    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public int getFilmType() {
        return filmType;
    }

    public void setFilmType(int filmType) {
        this.filmType = filmType;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmScore() {
        return filmScore;
    }

    public void setFilmScore(String filmScore) {
        this.filmScore = filmScore;
    }

    public int getFilmStatus() {
        return filmStatus;
    }

    public void setFilmStatus(int filmStatus) {
        this.filmStatus = filmStatus;
    }

    public int getFilmSource() {
        return filmSource;
    }

    public void setFilmSource(int filmSource) {
        this.filmSource = filmSource;
    }

    public int getFilmDate() {
        return filmDate;
    }

    public void setFilmDate(int filmDate) {
        this.filmDate = filmDate;
    }

    @Override
    public String toString() {
        return "FilmSearchVO{" +
                "filmId='" + filmId + '\'' +
                ", filmType=" + filmType +
                ", imgAddress='" + imgAddress + '\'' +
                ", filmName='" + filmName + '\'' +
                ", filmScore='" + filmScore + '\'' +
                ", filmStatus=" + filmStatus +
                ", filmSource=" + filmSource +
                ", filmDate=" + filmDate +
                '}';
    }
}
