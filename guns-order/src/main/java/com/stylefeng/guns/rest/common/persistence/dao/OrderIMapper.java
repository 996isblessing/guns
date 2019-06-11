package com.stylefeng.guns.rest.common.persistence.dao;

import com.stylefeng.guns.rest.order.model.OrderI;

import java.util.List;

public interface OrderIMapper {
    public List<OrderI> getOrderInfo(Integer userID);
}
