package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class DirectorVO  implements Serializable {
    String imgAddress;
    String directorName;


    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    @Override
    public String toString() {
        return "DirectorVO{" +
                "imgAddress='" + imgAddress + '\'' +
                ", directorName='" + directorName + '\'' +
                '}';
    }
}
