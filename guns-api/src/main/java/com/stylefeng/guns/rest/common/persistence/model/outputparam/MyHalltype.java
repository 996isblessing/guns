package com.stylefeng.guns.rest.common.persistence.model.outputparam;

import java.io.Serializable;

public class MyHalltype implements Serializable {
    String halltypeId;
    String halltypeName;
    boolean isActive;

    public MyHalltype() {
    }

    public MyHalltype(String halltypeId, String halltypeName, boolean isActive) {
        this.halltypeId = halltypeId;
        this.halltypeName = halltypeName;
        this.isActive = isActive;
    }

    public String getHalltypeId() {
        return halltypeId;
    }

    public void setHalltypeId(String halltypeId) {
        this.halltypeId = halltypeId;
    }

    public String getHalltypeName() {
        return halltypeName;
    }

    public void setHalltypeName(String halltypeName) {
        this.halltypeName = halltypeName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "MyHalltype{" +
                "halltypeId=" + halltypeId +
                ", halltypeName='" + halltypeName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
