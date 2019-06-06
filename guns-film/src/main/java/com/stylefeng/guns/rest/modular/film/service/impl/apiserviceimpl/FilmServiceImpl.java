package com.stylefeng.guns.rest.modular.film.service.impl.apiserviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.stylefeng.guns.rest.common.persistence.model.MtimeFilmT;
import com.stylefeng.guns.rest.film.FilmService;
import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmTService;
import com.stylefeng.guns.rest.persistence.filmmodel.index.IndexResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Service(interfaceClass = FilmService.class)
@Component
public class FilmServiceImpl implements FilmService {
    @Autowired
    IMtimeFilmTService filmTService;

    @Override
    public IndexResult queryIndexMsg() {
        int i = filmTService.selectCount(null);
        EntityWrapper<MtimeFilmT> wrapper = new EntityWrapper<>();
        Wrapper<MtimeFilmT> filmTWrapper = wrapper.setSqlSelect("UUID", "film_name", "film_type", "img_address", "film_score");
        List<MtimeFilmT> filmTS = filmTService.selectList(filmTWrapper);


        return null;
    }
}
