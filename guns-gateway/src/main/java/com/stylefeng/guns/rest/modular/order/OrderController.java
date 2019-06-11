package com.stylefeng.guns.rest.modular.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.config.properties.JwtProperties;
import com.stylefeng.guns.rest.exception.MyGunsException;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.order.model.Order;
import com.stylefeng.guns.rest.order.model.OrderI;
import com.stylefeng.guns.rest.order.model.OrderIInfo;
import com.stylefeng.guns.rest.order.model.OrderInfo;
import com.stylefeng.guns.rest.order.service.OrderService;
import com.stylefeng.guns.rest.persistence.model.MtimeUserT;
import com.stylefeng.guns.rest.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Reference(check = false)
    OrderService orderService;
    @Reference(check = false)
    UserService userService;
    //Token操作的工具
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    //用于获得请求头
    @Autowired
    private JwtProperties jwtProperties;

    @RequestMapping("/buyTickets")
    @ResponseBody
    public OrderInfo buyTickets(Integer fieldId, Integer[] soldSeats, String seatsName,HttpServletRequest request){
        //获取请求头
        String requestHeader = request.getHeader(jwtProperties.getHeader());
        if (requestHeader == null){
            throw new MyGunsException("查询失败，用户尚未登陆");

        }
        //获取token
        String authToken = requestHeader.substring(7);
        //从token中获取username
        String username = jwtTokenUtil.getUsernameFromToken(authToken);
        MtimeUserT userInfo = userService.getUserInfo(username);
        Integer uuid = userInfo.getUuid();
        Order order = orderService.buyTickets(fieldId, soldSeats, seatsName,uuid);
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setData(order);
        return orderInfo;
    }

    @RequestMapping("/getOrderInfo")
    @ResponseBody
    public OrderIInfo getOrderInfo(HttpServletRequest request){
        //获取请求头
        String requestHeader = request.getHeader(jwtProperties.getHeader());
        if (requestHeader == null){
            throw new MyGunsException("查询失败，用户尚未登陆");

        }
        //获取token
        String authToken = requestHeader.substring(7);
        //从token中获取username
        String username = jwtTokenUtil.getUsernameFromToken(authToken);
        MtimeUserT userInfo = userService.getUserInfo(username);
        Integer uuid = userInfo.getUuid();
        List<OrderI> orderInfo = orderService.getOrderInfo(uuid);
        OrderIInfo orderIInfo = new OrderIInfo();
        orderIInfo.setData(orderInfo);
        return orderIInfo;
    }



}
