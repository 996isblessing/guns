package com.stylefeng.guns.rest.user.result;

import java.io.Serializable;

/**
 * @Author: 弟中弟
 * @Date: 2019/6/5 0005 上午 9:33
 */
public class StatusResultVo implements Serializable {
    int status;
    String msg;

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
}
