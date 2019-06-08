package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class HallInfo implements Serializable {
    String hallFieldId;
    String hallName;
    int price;
    String seatFile;
    String soldSeats = "1,2,3,5,12" ;

    public String getHallFieldId() {
        return hallFieldId;
    }

    public void setHallFieldId(String hallFieldId) {
        this.hallFieldId = hallFieldId;
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

    public String getSoldSeats() {
        return soldSeats;
    }

    public void setSoldSeats(String soldSeats) {
        this.soldSeats = soldSeats;
    }

    @Override
    public String toString() {
        return "HallInfo{" +
                "hallFieldId=" + hallFieldId +
                ", hallName='" + hallName + '\'' +
                ", price=" + price +
                ", seatFile='" + seatFile + '\'' +
                ", soldSeats='" + soldSeats + '\'' +
                '}';
    }
}
