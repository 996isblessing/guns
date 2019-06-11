package com.stylefeng.guns.rest.order.service;

import com.stylefeng.guns.rest.order.model.Order;
import com.stylefeng.guns.rest.order.model.OrderI;

import java.util.List;

public interface OrderService {
    public Order buyTickets(Integer fieldId,Integer[] soldSeats,String seatsName,Integer uuid);
    public List<OrderI> getOrderInfo(Integer uuid);
}
