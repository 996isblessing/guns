package com.stylefeng.guns.rest.order.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    String orderId;
    String filmName;
    String fieldTime;
    String cinemaName;
    String seatsName;
    Double orderPrice;
    Date orderTimestamp;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFieldTime() {
        return fieldTime;
    }

    public void setFieldTime(String fieldTime) {
        this.fieldTime = fieldTime;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getSeatsName() {
        return seatsName;
    }

    public void setSeatsName(String seatsName) {
        this.seatsName = seatsName;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Date orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", filmName='" + filmName + '\'' +
                ", fieldTime='" + fieldTime + '\'' +
                ", cinemaName='" + cinemaName + '\'' +
                ", seatsName='" + seatsName + '\'' +
                ", orderPrice=" + orderPrice +
                ", orderTimestamp=" + orderTimestamp +
                '}';
    }
}
