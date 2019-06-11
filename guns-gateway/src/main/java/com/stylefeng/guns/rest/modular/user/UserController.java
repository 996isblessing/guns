package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.persistence.model.MtimeUserT;
import com.stylefeng.guns.rest.user.UserInfo;
import com.stylefeng.guns.rest.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference(check = false)
    UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String mytest(){
        userService.mytest();
        return Integer.toString(userService.mytest1());
    }

    //查询用户信息
    @ResponseBody
    @GetMapping("/getUserInfo")
    public UserInfo getUserInfo(String username) {
        String username1 = "litiansuo";
        MtimeUserT user =userService.getUserInfo(username);
        UserInfo userInfo = new UserInfo();
        userInfo.setData(user);
        return userInfo;
    }



}
