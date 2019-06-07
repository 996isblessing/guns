package com.stylefeng.guns.rest.modular.cinema.model;

import java.io.Serializable;

public class HallInfo implements Serializable {
    private static final long serialVersionUID = -2285658217709269891L;
    int hallField;
    String hallName;
    int price;
    String seatFile;
    int soldSeats;

    public HallInfo() {
    }

    public int getHallField() {
        return hallField;
    }

    public void setHallField(int hallField) {
        this.hallField = hallField;
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

    public String getSeatFile() {
        return seatFile;
    }

    public void setSeatFile(String seatFile) {
        this.seatFile = seatFile;
    }

    public int getSoldSeats() {
        return soldSeats;
    }

    public void setSoldSeats(int soldSeats) {
        this.soldSeats = soldSeats;
    }
}
