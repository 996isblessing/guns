package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.persistence.model.MtimeUserT;
import com.stylefeng.guns.rest.user.UserInfo;
import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.result.StatusResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
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
        String username1 = "admin";
        MtimeUserT user =userService.getUserInfo(username);
        UserInfo userInfo = new UserInfo();
        userInfo.setData(user);
        return userInfo;
    }

    //用户名验证
    @RequestMapping("/check")
    @ResponseBody
    public StatusResultVo checkName(String username){
        return userService.checkName(username);
    }

    //用户注册
    @RequestMapping("/register")
    @ResponseBody
    public StatusResultVo userRegister(MtimeUserT user){
        return userService.userRegister(user);
    }


}
