package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class FilmSearchRequestVO implements Serializable {
    int showType=1;
    int sortId=1;
    int catId=99;
    int sourceId=99;
    int yearId=99;
    int nowPage=1;
    int pageSize=18;

    public int getShowType() {
        return showType;
    }

    public void setShowType(int showType) {
        this.showType = showType;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "FilmSearchRequestVO{" +
                "showType=" + showType +
                ", sortId=" + sortId +
                ", catId=" + catId +
                ", sourceId=" + sourceId +
                ", yearId=" + yearId +
                ", nowPage=" + nowPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
