package com.stylefeng.guns.rest.common.aop;

import com.stylefeng.guns.core.aop.BaseControllerExceptionHandler;
import com.stylefeng.guns.core.base.tips.ErrorTip;
import com.stylefeng.guns.rest.common.exception.BizExceptionEnum;
<<<<<<< HEAD
import com.stylefeng.guns.rest.modular.exception.ServerException;
import com.stylefeng.guns.rest.modular.exception.UserException;
import com.stylefeng.guns.rest.user.result.StatusResultVo;
=======
import com.stylefeng.guns.rest.exception.MyGunsException;
import com.stylefeng.guns.rest.user.Info;
>>>>>>> f328408b7322707022ca6c7cdeddfdbb3ad8e458
import io.jsonwebtoken.JwtException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 全局的的异常拦截器（拦截所有的控制器）（带有@RequestMapping注解的方法上都会拦截）
 *
 * @author fengshuonan
 * @date 2016年11月12日 下午3:19:56
 */
@ControllerAdvice
public class GlobalExceptionHandler extends BaseControllerExceptionHandler {

    private Logger log = LoggerFactory.getLogger(this.getClass());

<<<<<<< HEAD
    //用户名密码错误异常
    @ExceptionHandler(value = UserException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public StatusResultVo handlerMyException(UserException e) {
        StatusResultVo resultVo = new StatusResultVo();
        resultVo.setStatus(1);
        resultVo.setMsg("用户名或密码错误");
        return resultVo;
    }

    //服务器异常
    @ExceptionHandler(value = ServerException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public StatusResultVo handlerMyException( ServerException e) {
        StatusResultVo resultVo = new StatusResultVo();
        resultVo.setStatus(999);
        resultVo.setMsg("系统出现异常，请联系管理员");
        return resultVo;
    }

=======

    @ExceptionHandler(MyGunsException.class)
    @ResponseBody
    public Info myGunsExceptionHandler(MyGunsException e){
        Info info = new Info();
        info.setStatus(1);
        info.setMsg(e.getMessage());
        e.printStackTrace();
        return info;
    }
>>>>>>> f328408b7322707022ca6c7cdeddfdbb3ad8e458
    /**
     * 拦截jwt相关异常
     */
    @ExceptionHandler(JwtException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorTip jwtException(JwtException e) {
        return new ErrorTip(BizExceptionEnum.TOKEN_ERROR.getCode(), BizExceptionEnum.TOKEN_ERROR.getMessage());
    }
}
