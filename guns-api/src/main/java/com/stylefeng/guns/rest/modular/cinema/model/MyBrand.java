package com.stylefeng.guns.rest.modular.cinema.model;

import java.io.Serializable;

public class MyBrand implements Serializable {
    private static final long serialVersionUID = -9022115235366840381L;
    String brandId;
    String brandName;
    boolean isActive;

    public MyBrand() {
    }

    public MyBrand(String brandId, String brandName, boolean isActive) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.isActive = isActive;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "MyBrand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
