package com.stylefeng.guns.rest.modular.cinema.model;

import java.io.Serializable;

public class ConditionVO implements Serializable {
    private static final long serialVersionUID = -6520766424472051913L;
    Object brandList;
    Object areaList;
    Object halltypeList;

    public ConditionVO() {
    }

    public ConditionVO(Object brandList, Object areaList, Object halltypeList) {
        this.brandList = brandList;
        this.areaList = areaList;
        this.halltypeList = halltypeList;
    }

    public Object getBrandList() {
        return brandList;
    }

    public void setBrandList(Object brandList) {
        this.brandList = brandList;
    }

    public Object getAreaList() {
        return areaList;
    }

    public void setAreaList(Object areaList) {
        this.areaList = areaList;
    }

    public Object getHalltypeList() {
        return halltypeList;
    }

    public void setHalltypeList(Object halltypeList) {
        this.halltypeList = halltypeList;
    }

    @Override
    public String toString() {
        return "ConditionVO{" +
                "brandList=" + brandList +
                ", areaList=" + areaList +
                ", halltypeList=" + halltypeList +
                '}';
    }
}
