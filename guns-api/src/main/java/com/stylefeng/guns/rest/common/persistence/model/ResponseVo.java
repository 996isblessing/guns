package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class ResponseVo implements Serializable {
    int status;
    String imgPre;
    Data data;

    public Data getData() {
        return data;
    }

        public void setData(Data data) {
        this.data = data;
    }

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
}
