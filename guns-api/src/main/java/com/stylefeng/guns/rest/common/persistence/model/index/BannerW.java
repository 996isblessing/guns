package com.stylefeng.guns.rest.common.persistence.model.index;

import java.io.Serializable;

public class BannerW implements Serializable {
    String bannerId;
    String bannerAddress;
    String bannerUrl;

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerAddress() {
        return bannerAddress;
    }

    public void setBannerAddress(String bannerAddress) {
        this.bannerAddress = bannerAddress;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    @Override
    public String toString() {
        return "BannerW{" +
                "bannerId='" + bannerId + '\'' +
                ", bannerAddress='" + bannerAddress + '\'' +
                ", bannerUrl='" + bannerUrl + '\'' +
                '}';
    }
}
