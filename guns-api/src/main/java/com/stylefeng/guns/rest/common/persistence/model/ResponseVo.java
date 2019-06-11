package com.stylefeng.guns.rest.common.persistence.model;

import com.stylefeng.guns.rest.common.persistence.model.result.Result;

import java.io.Serializable;

public class ResponseVo extends Result implements Serializable {
    String imgPre;
    Data data;

    public ResponseVo() {
    }

    public ResponseVo(int status, String imgPre, Data data) {
        super(status);
        this.imgPre = imgPre;
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public String getImgPre() {
        return imgPre;
    }

    public void setImgPre(String imgPre) {
        this.imgPre = imgPre;
    }
}
