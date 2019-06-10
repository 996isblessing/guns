package com.stylefeng.guns.rest.common.persistence.model.index;

import java.io.Serializable;

public class IndexPageInfoW implements Serializable {
    int status;
    String imgPre;
    IndexResultW data;

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

    public IndexResultW getData() {
        return data;
    }

    public void setData(IndexResultW data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "IndexPageInfoW{" +
                "status=" + status +
                ", imgPre='" + imgPre + '\'' +
                ", data=" + data +
                '}';
    }
}
