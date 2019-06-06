package com.stylefeng.guns.rest.modular.film.service.impl.apiserviceimpl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.stylefeng.guns.rest.GunsFilmApplication;
import com.stylefeng.guns.rest.common.persistence.model.MtimeFilmT;
import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmTService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GunsFilmApplication.class)
public class FilmServiceImplTest {

    @Autowired
    IMtimeFilmTService filmTService;

    @Test
    public void mytest() {
        int i = filmTService.selectCount(null);
        EntityWrapper<MtimeFilmT> entityWrapper = new EntityWrapper<>();
        Wrapper<MtimeFilmT> wrapper = entityWrapper.setSqlSelect("UUID", "film_name", "film_type", "img_address", "film_score").eq("film_status", 1);
        List<MtimeFilmT> mtimeFilmTS = filmTService.selectList(wrapper);
        for (MtimeFilmT filmT : mtimeFilmTS) {
            System.out.println(filmT);
        }
    }

}