package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class FilmFields implements Serializable {
    String fieldId;
    String beginTime;
    String endTime;
    String language;
    String hallName;
    int price;

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FilmFields{" +
                "fieldId=" + fieldId +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", language='" + language + '\'' +
                ", hallName='" + hallName + '\'' +
                ", price=" + price +
                '}';
    }
}
