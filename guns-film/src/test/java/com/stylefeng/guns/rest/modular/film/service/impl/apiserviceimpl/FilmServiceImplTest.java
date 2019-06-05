package com.stylefeng.guns.rest.modular.film.service.impl.apiserviceimpl;

import com.stylefeng.guns.rest.GunsFilmApplication;
import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmTService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= GunsFilmApplication.class)
public class FilmServiceImplTest {

    @Autowired
    IMtimeFilmTService filmTService;
    @Test
    public void mytest() {
        int i = filmTService.selectCount(null);

    }

}