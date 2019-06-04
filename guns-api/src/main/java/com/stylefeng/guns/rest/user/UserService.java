package com.stylefeng.guns.rest.user;

public interface UserService {
    //自己瞎鸡儿写的测试
    public void mytest();
    public int mytest1();
    //获取用户信息的接口
    public User getUserInfo(String username);
    //更新用户信息
    public int updateUserInfo(User user);
}
