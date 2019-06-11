package com.stylefeng.guns.rest.order.model;

import java.io.Serializable;
import java.util.Date;

public class OrderT implements Serializable {
    String uuid;
    String seatsIds;
    String seatsName;
    Integer cinemaId;
    Integer fieldId;
    Integer filmId;
    Integer orderUser;
    Integer orderStatus;
    Date orderTime;
    Double filmPrice;
    Double orderPrice;

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSeatsIds() {
        return seatsIds;
    }

    public void setSeatsIds(String seatsIds) {
        this.seatsIds = seatsIds;
    }

    public String getSeatsName() {
        return seatsName;
    }

    public void setSeatsName(String seatsName) {
        this.seatsName = seatsName;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(Integer orderUser) {
        this.orderUser = orderUser;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getFilmPrice() {
        return filmPrice;
    }

    public void setFilmPrice(Double filmPrice) {
        this.filmPrice = filmPrice;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "OrderT{" +
                "UUID='" + uuid + '\'' +
                ", seatsIds='" + seatsIds + '\'' +
                ", seatsName='" + seatsName + '\'' +
                ", cinemaId=" + cinemaId +
                ", fieldId=" + fieldId +
                ", filmId=" + filmId +
                ", orderUser=" + orderUser +
                ", orderStatus=" + orderStatus +
                ", filmPrice=" + filmPrice +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
