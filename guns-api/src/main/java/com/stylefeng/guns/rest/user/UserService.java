package com.stylefeng.guns.rest.user;

import com.stylefeng.guns.rest.persistence.model.MtimeUserT;
import com.stylefeng.guns.rest.user.result.StatusResultVo;

public interface UserService {
    //自己瞎鸡儿写的测试
    public void mytest();
    public int mytest1();
    //获取用户信息的接口
    public MtimeUserT getUserInfo(String username);

    //用户名检查
    StatusResultVo checkName(String username);

    StatusResultVo userRegister(MtimeUserT user);

    boolean auth(String username, String password);
}
