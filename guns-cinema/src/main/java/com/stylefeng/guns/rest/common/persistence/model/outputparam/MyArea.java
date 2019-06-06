package com.stylefeng.guns.rest.common.persistence.model.outputparam;

public class MyArea {
    int areaId;
    String areaName;
    boolean isActive;

    public MyArea() {
    }

    public MyArea(int areaId, String areaName, boolean isActive) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.isActive = isActive;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
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
