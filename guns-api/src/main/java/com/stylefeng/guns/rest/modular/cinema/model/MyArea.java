package com.stylefeng.guns.rest.modular.cinema.model;

import java.io.Serializable;

public class MyArea implements Serializable {
    private static final long serialVersionUID = 8904240136465614369L;
    String areaId;
    String areaName;
    boolean isActive;

    public MyArea() {
    }

    public MyArea(String areaId, String areaName, boolean isActive) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.isActive = isActive;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "MyArea{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
