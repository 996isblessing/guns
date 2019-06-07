package com.stylefeng.guns.rest.modular.cinema.model;

import java.io.Serializable;

public class Result implements Serializable {
    private static final long serialVersionUID = 3041169189545172192L;
    int status;

    public Result() {
    }

    public Result(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                '}';
    }
}
