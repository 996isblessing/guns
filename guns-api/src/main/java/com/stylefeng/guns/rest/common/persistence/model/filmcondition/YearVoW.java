package com.stylefeng.guns.rest.common.persistence.model.filmcondition;

import java.io.Serializable;

public class YearVoW implements Serializable {
    String yearId;
    String yearName;
    boolean isActive = true;

    @Override
    public String toString() {
        return "YearVoW{" +
                "yearId='" + yearId + '\'' +
                ", yearName='" + yearName + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
