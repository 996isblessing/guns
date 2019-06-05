package com.stylefeng.guns.rest.modular.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.persistence.dao.MtimeUserTMapper;
import com.stylefeng.guns.rest.persistence.model.MtimeUserT;

import com.stylefeng.guns.rest.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Service
@Component
public class UserServiceImpl implements UserService {
   // @Autowired(required = false)
  //  MyUserMapper userMapper;

    @Autowired(required = false)
    MtimeUserTMapper userTMapper;

    @Override
    public void mytest() {
        System.out.println("dubbo success");
    }

    @Override
    public int mytest1() {
        return 12345;
    }

    @Override
    public MtimeUserT getUserInfo(String username) {
        Map<String,Object> map = new HashMap();
        map.put("user_name",username);
        MtimeUserT userT =userTMapper.selectByMap(map).get(0);
        return  userT;
    }


}
