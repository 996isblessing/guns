package com.stylefeng.guns.rest.common.persistence.model.filmcondition;

import java.io.Serializable;

public class CatVo implements Serializable {

    String catId;
    String catName;
    boolean isActive = true;

    @Override
    public String toString() {
        return "CatVo{" +
                "catId='" + catId + '\'' +
                ", catName='" + catName + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
