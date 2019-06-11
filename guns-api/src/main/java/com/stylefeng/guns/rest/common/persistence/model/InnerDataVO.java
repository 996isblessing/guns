package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class InnerDataVO  implements Serializable {
    int filmId ;
    String filmName;
    String filmEnName;
    String imgAddress;
    String score;
    String scoreNum ;
    String totalBox ;
    String info01 ;
    String info02 ;
    String info03 ;

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

    public String getFilmEnName() {
        return filmEnName;
    }

    public void setFilmEnName(String filmEnName) {
        this.filmEnName = filmEnName;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getScoreNum() {
        return scoreNum;
    }

    public void setScoreNum(String scoreNum) {
        this.scoreNum = scoreNum;
    }

    public String getTotalBox() {
        return totalBox;
    }

    public void setTotalBox(String totalBox) {
        this.totalBox = totalBox;
    }

    public String getInfo01() {
        return info01;
    }

    public void setInfo01(String info01) {
        this.info01 = info01;
    }

    public String getInfo02() {
        return info02;
    }

    public void setInfo02(String info02) {
        this.info02 = info02;
    }

    public String getInfo03() {
        return info03;
    }

    public void setInfo03(String info03) {
        this.info03 = info03;
    }

    @Override
    public String toString() {
        return "InnerDataVO{" +
                "filmId=" + filmId +
                ", filmName='" + filmName + '\'' +
                ", filmEnName='" + filmEnName + '\'' +
                ", imgAddress='" + imgAddress + '\'' +
                ", score='" + score + '\'' +
                ", scoreNum='" + scoreNum + '\'' +
                ", totalBox='" + totalBox + '\'' +
                ", info01='" + info01 + '\'' +
                ", info02='" + info02 + '\'' +
                ", info03='" + info03 + '\'' +
                '}';
    }
}
