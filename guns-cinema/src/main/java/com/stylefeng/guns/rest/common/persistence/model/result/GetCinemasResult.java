package com.stylefeng.guns.rest.common.persistence.model.result;

public class GetCinemasResult extends Result {
    int nowPage;
    int totalPage;
    Object data;

    public GetCinemasResult(int status, int nowPage, int totalPage, Object data) {
        super(status);
        this.nowPage = nowPage;
        this.totalPage = totalPage;
        this.data = data;
    }

    public GetCinemasResult() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "GetCinemasResult{" +
                "nowPage=" + nowPage +
                ", totalPage=" + totalPage +
                ", data=" + data +
                ", status=" + status +
                '}';
    }
}
