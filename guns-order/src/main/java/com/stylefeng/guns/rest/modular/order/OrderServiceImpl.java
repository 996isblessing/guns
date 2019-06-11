package com.stylefeng.guns.rest.modular.order;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.common.persistence.dao.CinemaMapper;
import com.stylefeng.guns.rest.common.persistence.dao.FieldMapper;
import com.stylefeng.guns.rest.common.persistence.dao.FilmInfoMapper;
import com.stylefeng.guns.rest.common.persistence.dao.OrderTMapper;
import com.stylefeng.guns.rest.common.persistence.model.FilmInfo;
import com.stylefeng.guns.rest.common.persistence.model.generator.Cinema;
import com.stylefeng.guns.rest.common.persistence.model.generator.Field;
import com.stylefeng.guns.rest.order.model.Order;
import com.stylefeng.guns.rest.order.model.OrderT;
import com.stylefeng.guns.rest.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
@Component
public class OrderServiceImpl  implements OrderService {

    @Autowired(required = false)
    FieldMapper fieldMapper;

    @Autowired(required = false)
    OrderTMapper orderTMapper;

    @Autowired(required = false)
    FilmInfoMapper filmInfoMapper;

    @Autowired(required = false)
    CinemaMapper cinemaMapper;

    //生成訂單
    @Override
    public Order buyTickets(Integer fieldId, Integer[] soldSeats, String seatsName) {
        System.out.println(fieldId+" "+ Arrays.toString(soldSeats)+" "+seatsName);
        Field field = fieldMapper.selectByPrimaryKey(fieldId);
        String uuid=Integer.toString(new Date().toString().hashCode());
        OrderT orderT = new OrderT();
        orderT.setFieldId(fieldId);
        orderT.setUuid(uuid);
        orderT.setSeatsIds(Arrays.toString(soldSeats));
        orderT.setCinemaId(field.getCinemaId());
        orderT.setSeatsName("4124");
        orderT.setFilmId(field.getFilmId());
        orderT.setFilmPrice(field.getPrice()+0.0);
        orderT.setOrderPrice(soldSeats.length*field.getPrice()+0.0);
        orderT.setOrderStatus(0);
        orderT.setOrderUser(3);
        orderT.setOrderTime(new Date());
        System.out.println(orderT);
        orderTMapper.insertNewOrder(orderT);
        Order order = new Order();
        order.setOrderId(uuid);
        Cinema cinema = cinemaMapper.selectByPrimaryKey(orderT.getCinemaId());
        order.setCinemaName(cinema.getCinemaName());
        order.setFieldTime(field.getHallName());
        List<FilmInfo> filmInfos = filmInfoMapper.selectFilmInfo(orderT.getCinemaId());
        order.setFilmName(filmInfos.get(0).getFilmName());
        order.setOrderPrice(soldSeats.length*field.getPrice()+0.0);
        order.setOrderTimestamp(new Date());
        order.setSeatsName("421");
        return order;
    }
}
