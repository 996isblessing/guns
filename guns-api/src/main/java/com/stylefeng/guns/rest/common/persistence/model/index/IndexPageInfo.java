package com.stylefeng.guns.rest.common.persistence.model.index;

import java.io.Serializable;

public class IndexPageInfo  implements Serializable {
    int status;
    String imgPre;
    IndexResult data;

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

    public IndexResult getData() {
        return data;
    }

    public void setData(IndexResult data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "IndexPageInfo{" +
                "status=" + status +
                ", imgPre='" + imgPre + '\'' +
                ", data=" + data +
                '}';
    }
}
