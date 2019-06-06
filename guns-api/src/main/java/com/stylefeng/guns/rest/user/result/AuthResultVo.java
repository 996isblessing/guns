package com.stylefeng.guns.rest.user.result;


/**
 * @Author: 弟中弟
 * @Date: 2019/6/5 0005 下午 10:19
 */
public class AuthResultVo {
    private int status;
    private Data data;

    public AuthResultVo(){
        this.data = new Data();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {
        private String randomKey;
        private String token;

        public String getRandomKey() {
            return randomKey;
        }

        public void setRandomKey(String randomKey) {
            this.randomKey = randomKey;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }



}
