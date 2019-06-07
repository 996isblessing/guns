package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.config.properties.JwtProperties;
import com.stylefeng.guns.rest.exception.MyGunsException;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.persistence.model.MtimeUserT;
import com.stylefeng.guns.rest.user.Info;
import com.stylefeng.guns.rest.user.UserInfo;
import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.result.StatusResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference(check = false)
    UserService userService;

    //Token操作的工具
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    //用于获得请求头
    @Autowired
    private JwtProperties jwtProperties;

    @RequestMapping("/test")
    @ResponseBody
    public String mytest(){
        userService.mytest();
        return Integer.toString(userService.mytest1());
    }

    //登出操作
    @ResponseBody
    @GetMapping("/logout")
    public Info logout(HttpServletRequest request) {
        //获取请求头
        String requestHeader = request.getHeader(jwtProperties.getHeader());
        if (requestHeader == null){
            throw new MyGunsException("退出失败，用户尚未登陆");
        }
        //获取token
        String authToken = requestHeader.substring(7);
        //redis删除token
        Jedis jedis = new Jedis();
        jedis.del(authToken);
        jedis.close();
        Info info = new Info();
        return info;
    }

    //查询用户信息
    @ResponseBody
    @GetMapping("/getUserInfo")
    public UserInfo getUserInfo(HttpServletRequest request) {
        //获取请求头
        String requestHeader = request.getHeader(jwtProperties.getHeader());
        if (requestHeader == null){
            throw new MyGunsException("查询失败，用户尚未登陆");

        }
        //获取token
        String authToken = requestHeader.substring(7);
        //从token中获取username
        String username = jwtTokenUtil.getUsernameFromToken(authToken);
        MtimeUserT user =userService.getUserInfo(username);
        UserInfo userInfo = new UserInfo();
        userInfo.setData(user);
        return userInfo;
    }

    //更新用户信息
    @ResponseBody
    @PostMapping("/updateUserInfo")
    public UserInfo updateUserInfo(MtimeUserT user){
        if (userService.updateUserInfo(user)!=1){
            throw new MyGunsException("更新失败");
        };
        //通过uuid更新
        MtimeUserT user1 = userService.getUserInfo(user.getUsername());
        UserInfo userInfo = new UserInfo();
        userInfo.setData(user1);
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
