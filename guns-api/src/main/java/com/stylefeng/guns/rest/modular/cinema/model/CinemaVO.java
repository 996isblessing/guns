package com.stylefeng.guns.rest.modular.cinema.model;

import java.io.Serializable;

public class CinemaVO implements Serializable {

    private static final long serialVersionUID = 2096000875375227709L;
    Integer uuid;
    String cinemaName;
    String address;
    Double minimumPrice;

    public CinemaVO() {
    }

    public CinemaVO(Integer uuid, String cinemaName, String address, Double minimumPrice) {
        this.uuid = uuid;
        this.cinemaName = cinemaName;
        this.address = address;
        this.minimumPrice = minimumPrice;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(Double minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    @Override
    public String toString() {
        return "CinemaVO{" +
                "uuid=" + uuid +
                ", cinemaName='" + cinemaName + '\'' +
                ", address='" + address + '\'' +
                ", minimumPrice=" + minimumPrice +
                '}';
    }
}
