package com.stylefeng.guns.rest.modular.cinema.model;

import java.io.Serializable;

public class CinemaQueryVO implements Serializable {
    private static final long serialVersionUID = -3764490836227130511L;
    Integer brandId=99;
    Integer halltypeId =99;
    Integer areaId =99;
    Integer pageSize=12;
    Integer nowPage=1;

    public CinemaQueryVO() {
    }

    public CinemaQueryVO(Integer brandId, Integer hallType, Integer districtId, Integer pageSize, Integer nowPage) {
        this.brandId = brandId;
        this.halltypeId = hallType;
        this.areaId = districtId;
        this.pageSize = pageSize;
        this.nowPage = nowPage;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getHalltypeId() {
        return halltypeId;
    }

    public void setHalltypeId(Integer halltypeId) {
        this.halltypeId = halltypeId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    @Override
    public String toString() {
        return "CinemaQueryVO{" +
                "brandId=" + brandId +
                ", halltypeId=" + halltypeId +
                ", areaId=" + areaId +
                ", pageSize=" + pageSize +
                ", nowPage=" + nowPage +
                '}';
    }
}
