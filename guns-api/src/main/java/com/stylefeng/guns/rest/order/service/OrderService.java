package com.stylefeng.guns.rest.order.service;

import com.stylefeng.guns.rest.order.model.Order;

public interface OrderService {
    public Order buyTickets(Integer fieldId,Integer[] soldSeats,String seatsName);
}
