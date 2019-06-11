package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class InnerActorsVO  implements Serializable {
    String imgAddress;
    String directorName;
    String roleName;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "InnerActorsVO{" +
                "imgAddress='" + imgAddress + '\'' +
                ", directorName='" + directorName + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
