package com.stylefeng.guns.rest.common.persistence.model.generator;

public class HallDict {
    private Integer uuid;

    private String showName;

    private String seatAddress;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName == null ? null : showName.trim();
    }

    public String getSeatAddress() {
        return seatAddress;
    }

    public void setSeatAddress(String seatAddress) {
        this.seatAddress = seatAddress == null ? null : seatAddress.trim();
    }

    @Override
    public String toString() {
        return "HallDict{" +
                "uuid=" + uuid +
                ", showName='" + showName + '\'' +
                ", seatAddress='" + seatAddress + '\'' +
                '}';
    }
}