package com.stylefeng.guns.rest.common.persistence.model.outputparam;

public class MyBrand {
    int brandId;
    String brandName;
    boolean isActive;

    public MyBrand() {
    }

    public MyBrand(int brandId, String brandName, boolean isActive) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.isActive = isActive;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
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
