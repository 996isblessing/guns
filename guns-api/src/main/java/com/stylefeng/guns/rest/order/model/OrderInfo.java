package com.stylefeng.guns.rest.order.model;

public class OrderInfo {
    int status = 0;
    String msg = "";
    Order data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Order getData() {
        return data;
    }

    public void setData(Order data) {
        this.data = data;
    }
}
