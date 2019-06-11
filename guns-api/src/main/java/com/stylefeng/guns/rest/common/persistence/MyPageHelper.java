package com.stylefeng.guns.rest.common.persistence;

import com.stylefeng.guns.rest.common.persistence.model.FilmSearchVO;


import java.io.Serializable;
import java.util.List;

public class MyPageHelper implements Serializable {
    int status;
    String imgPre;
    int nowPage;
    int totalPage;
    List<FilmSearchVO> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImgPre() {
        return imgPre;
    }

    public void setImgPre(String imgPre) {
        this.imgPre = imgPre;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<FilmSearchVO> getData() {
        return data;
    }

    public void setData(List<FilmSearchVO> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyPageHelper{" +
                "status=" + status +
                ", imgPre='" + imgPre + '\'' +
                ", nowPage=" + nowPage +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }
}
