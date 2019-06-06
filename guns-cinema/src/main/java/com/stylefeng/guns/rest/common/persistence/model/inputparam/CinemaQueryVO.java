package com.stylefeng.guns.rest.common.persistence.model.inputparam;

public class CinemaQueryVO {
/*    brandId	影院编号	否,默认为99，全部
    hallType	影厅类型	否,默认为99，全部
    districtId	行政区编号	否,默认为99，全部
    pageSize	每页条数	否,默认为12条
    nowPage	当前页数	否,默认为第1页*/
    Integer brandId=99;
    Integer hallType=99;
    Integer districtId=99;
    Integer pageSize=12;
    Integer nowPage=1;

    public CinemaQueryVO() {
    }

    public CinemaQueryVO(Integer brandId, Integer hallType, Integer districtId, Integer pageSize, Integer nowPage) {
        this.brandId = brandId;
        this.hallType = hallType;
        this.districtId = districtId;
        this.pageSize = pageSize;
        this.nowPage = nowPage;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getHallType() {
        return hallType;
    }

    public void setHallType(Integer hallType) {
        this.hallType = hallType;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
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
                ", hallType=" + hallType +
                ", districtId=" + districtId +
                ", pageSize=" + pageSize +
                ", nowPage=" + nowPage +
                '}';
    }
}
