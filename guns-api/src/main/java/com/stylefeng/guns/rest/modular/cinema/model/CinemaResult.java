package com.stylefeng.guns.rest.modular.cinema.model;

import java.io.Serializable;

public class CinemaResult extends Result implements Serializable {
    private static final long serialVersionUID = 8365704090759390853L;
    String imgPre;
    Object data;

    public CinemaResult() {
    }

    public CinemaResult(int status, String imgPre, Object data) {
        super(status);
        this.imgPre = imgPre;
        this.data = data;
    }

    public String getImgPre() {
        return imgPre;
    }

    public void setImgPre(String imgPre) {
        this.imgPre = imgPre;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CinemaResult{" +
                "imgPre='" + imgPre + '\'' +
                ", data=" + data +
                ", status=" + status +
                '}';
    }
}
