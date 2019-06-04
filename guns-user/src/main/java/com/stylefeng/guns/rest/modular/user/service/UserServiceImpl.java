package com.stylefeng.guns.rest.modular.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.modular.user.mapper.MyUserMapper;
import com.stylefeng.guns.rest.user.User;
import com.stylefeng.guns.rest.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    MyUserMapper userMapper;

    @Override
    public void mytest() {
        System.out.println("dubbo success");
    }

    @Override
    public int mytest1() {
        return 12345;
    }

    @Override
    public User getUserInfo(String username) {
        User user = userMapper.SelectgetUserInfo(username);
        return user;
    }

    @Override
    public int updateUserInfo(User user) {
        return userMapper.UpdateUserInfo(user);
    }
}
