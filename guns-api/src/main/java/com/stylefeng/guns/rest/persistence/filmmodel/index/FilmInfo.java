package com.stylefeng.guns.rest.persistence.filmmodel.index;

import java.util.Date;

/**
 * 对应filmInfo
 */
public class FilmInfo {
    Integer filmId;
    Integer filmType;
    String imgAddress;
    String filmName;
    String filmScore;
    Integer expectNum;
    Date showTime;
    Integer boxNum;
    String score;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getFilmType() {
        return filmType;
    }

    public void setFilmType(Integer filmType) {
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

    public Integer getExpectNum() {
        return expectNum;
    }

    public void setExpectNum(Integer expectNum) {
        this.expectNum = expectNum;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public Integer getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(Integer boxNum) {
        this.boxNum = boxNum;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "MyFilmInfo{" +
                "filmId=" + filmId +
                ", filmType=" + filmType +
                ", imgAddress='" + imgAddress + '\'' +
                ", filmName='" + filmName + '\'' +
                ", filmScore='" + filmScore + '\'' +
                ", expectNum=" + expectNum +
                ", showTime=" + showTime +
                ", boxNum=" + boxNum +
                ", score='" + score + '\'' +
                '}';
    }
}
