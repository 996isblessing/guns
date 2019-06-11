package com.stylefeng.guns.rest.common.persistence;

import com.stylefeng.guns.rest.common.persistence.model.DataVO;

import java.io.Serializable;

public class FilmSearchDetailVO  implements Serializable {
    int status;
    String imgPre;
    DataVO data;

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

    public DataVO getData() {
        return data;
    }

    public void setData(DataVO data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FilmSearchDetailVO{" +
                "status=" + status +
                ", imgPre='" + imgPre + '\'' +
                ", data=" + data +
                '}';
    }
}
