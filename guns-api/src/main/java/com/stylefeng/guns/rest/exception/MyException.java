package com.stylefeng.guns.rest.exception;


/**
 * @Author: 弟中弟
 * @Date: 2019/6/6 0006 上午 9:53
 */
public class MyException extends RuntimeException {
    private String msg;
    private int status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
