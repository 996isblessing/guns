package com.stylefeng.guns.rest.order.model;

import java.io.Serializable;
import java.util.Date;

public class OrderI implements Serializable {
    String orderId;
    String filmName;
    String fieldTime;
    String cinemaName;
    String seatsName;
    String orderStatus;
    Double orderPrice;

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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "OrderI{" +
                "orderId='" + orderId + '\'' +
                ", filmName='" + filmName + '\'' +
                ", fieldTime='" + fieldTime + '\'' +
                ", cinemaName='" + cinemaName + '\'' +
                ", seatsName='" + seatsName + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
