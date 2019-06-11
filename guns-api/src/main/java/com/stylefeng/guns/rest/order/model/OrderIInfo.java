package com.stylefeng.guns.rest.order.model;

import java.util.List;

public class OrderIInfo {
    int status = 0;
    String msg = "";
    List<OrderI> data;

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

    public List<OrderI> getData() {
        return data;
    }

    public void setData(List<OrderI> data) {
        this.data = data;
    }
}
