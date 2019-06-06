package com.stylefeng.guns.rest.modular.auth.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthRequest;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthResponse;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.modular.auth.validator.IReqValidator;
import com.stylefeng.guns.rest.modular.exception.ServerException;
import com.stylefeng.guns.rest.modular.exception.UserException;
import com.stylefeng.guns.rest.user.result.AuthResultVo;
import com.stylefeng.guns.rest.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * 请求验证的
 *
 * @author fengshuonan
 * @Date 2017/8/24 14:22
 */
@RestController
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Reference
    UserService userService;

    @Resource(name = "simpleValidator")
    private IReqValidator reqValidator;

    @RequestMapping(value = "${jwt.auth-path}")
    public AuthResultVo createAuthenticationToken(AuthRequest authRequest) {
        boolean validate = userService.auth(authRequest.getUserName(), authRequest.getPassword());
        AuthResultVo authResultVo = new AuthResultVo();
        try {
            if (validate) {
                final String randomKey = jwtTokenUtil.getRandomKey();
                final String token = jwtTokenUtil.generateToken(authRequest.getUserName(), randomKey);
                ResponseEntity<AuthResponse> ok = ResponseEntity.ok(new AuthResponse(token, randomKey));
                authResultVo.setStatus(0);
                authResultVo.getData().setRandomKey(randomKey);
                authResultVo.getData().setToken(token);
                return authResultVo;
            } else {
                throw new UserException("用户名密码错误");
//                throw new GunsException(BizExceptionEnum.AUTH_REQUEST_ERROR);
//                throw new UserException(1,"用户名或密码错误");
//                MyException e = new MyException();
//                e.setMsg("用户名或密码错误");
//                e.setStatus(1);
//                throw e;
//                authResultVo.setStatus(1);
//                authResultVo.setMsg("用户名或密码错误");
//                StatusResultVo statusResultVo = new StatusResultVo();
//                return authResultVo;
            }
        } catch (UserException e){
            throw new UserException("用户名或密码错误");
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServerException();
        }
    }
}
