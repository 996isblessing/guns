package com.stylefeng.guns.rest.modular.film.service.impl.apiserviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.stylefeng.guns.rest.common.persistence.model.MtimeFilmT;
import com.stylefeng.guns.rest.film.FilmService;
import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmTService;
import com.stylefeng.guns.rest.modular.film.service.impl.MtimeFilmTServiceImpl;
import com.stylefeng.guns.rest.persistence.filmmodel.index.IndexResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Service(interfaceClass = FilmService.class)
@Component
public class FilmServiceImpl implements FilmService {
    @Autowired
    IMtimeFilmTService filmTService;

    @Override
    public IndexResult queryIndexMsg() {
        int i = filmTService.selectCount(null);





        return null;
    }
}
