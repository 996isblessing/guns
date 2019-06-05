package com.stylefeng.guns.rest.modular.film.controller;


import com.stylefeng.guns.rest.common.persistence.model.MtimeActorT;
import com.stylefeng.guns.rest.modular.film.service.IMtimeActorTService;
import com.stylefeng.guns.rest.modular.film.service.impl.apiserviceimpl.FilmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;

/**
 * <p>
 * 演员表 前端控制器
 * </p>
 *
 * @author stylefeng
 * @since 2019-06-04
 */
@Controller
public class MtimeActorTController {

    @Autowired
    IMtimeActorTService iMtimeActorTService;
    @Autowired
    FilmServiceImpl filmService;

    @RequestMapping("/test")
    @ResponseBody
    public MtimeActorT queryById(int id){
        MtimeActorT actorT = iMtimeActorTService.selectById(id);
        return actorT;
    }

}

