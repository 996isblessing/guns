package com.stylefeng.guns.rest.common.persistence.model.result;

public class ExceptionResult extends Result {
    String msg;

    public ExceptionResult() {
    }

    public ExceptionResult(int status, String msg) {
        super(status);
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ExceptionResult{" +
                "msg='" + msg + '\'' +
                "status=" + status +
                '}';
    }
}
