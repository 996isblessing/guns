package com.stylefeng.guns.rest.user;

public class UserInfo {
    int status = 0;
    User data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}
