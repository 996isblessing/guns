package com.stylefeng.guns.rest.common.persistence.model.outputparam;

import java.io.Serializable;

public class MyArea implements Serializable {
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
