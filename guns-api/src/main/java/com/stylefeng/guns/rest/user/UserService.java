package com.stylefeng.guns.rest.user;

import com.stylefeng.guns.rest.persistence.model.MtimeUserT;

public interface UserService {
    //自己瞎鸡儿写的测试
    public void mytest();
    public int mytest1();
    //获取用户信息的接口
    public MtimeUserT getUserInfo(String username);

}
