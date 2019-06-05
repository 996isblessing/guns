package com.stylefeng.guns.rest.user;

import com.stylefeng.guns.rest.persistence.model.MtimeUserT;

public class UserInfo {
    int status = 0;
    MtimeUserT data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public MtimeUserT getData() {
        return data;
    }

    public void setData(MtimeUserT data) {
        this.data = data;
    }
}
