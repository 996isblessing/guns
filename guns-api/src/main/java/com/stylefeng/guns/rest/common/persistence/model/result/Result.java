package com.stylefeng.guns.rest.common.persistence.model.result;

import java.io.Serializable;

public class Result implements Serializable {
    protected int status;


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
