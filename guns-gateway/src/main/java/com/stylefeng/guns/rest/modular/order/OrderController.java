package com.stylefeng.guns.rest.modular.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.order.model.Order;
import com.stylefeng.guns.rest.order.model.OrderInfo;
import com.stylefeng.guns.rest.order.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Reference(check = false)
    OrderService orderService;

    @RequestMapping("/buyTickets")
    @ResponseBody
    public OrderInfo buyTickets(Integer fieldId, Integer[] soldSeats, String seatsName){
        Order order = orderService.buyTickets(fieldId, soldSeats, seatsName);
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setData(order);
        return orderInfo;
    }
}
