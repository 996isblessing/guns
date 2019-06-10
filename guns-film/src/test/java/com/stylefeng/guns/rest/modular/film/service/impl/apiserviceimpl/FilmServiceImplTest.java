package com.stylefeng.guns.rest.modular.film.service.impl.apiserviceimpl;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.stylefeng.guns.rest.GunsFilmApplication;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeFilmTMapper;
import com.stylefeng.guns.rest.common.persistence.model.MtimeBannerT;
import com.stylefeng.guns.rest.common.persistence.model.MtimeCatDictT;
import com.stylefeng.guns.rest.common.persistence.model.MtimeFilmInfoT;
import com.stylefeng.guns.rest.common.persistence.model.MtimeFilmT;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.CatVo;
import com.stylefeng.guns.rest.common.persistence.model.index.*;
import com.stylefeng.guns.rest.modular.film.service.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GunsFilmApplication.class)
public class FilmServiceImplTest {

    @Autowired
    IMtimeBannerTService bannerService;
    @Autowired
    IMtimeFilmTService filmTService;

    @Autowired
    IMtimeFilmInfoTService filmInfoTService;

    @Autowired
    IMtimeCatDictTService catService;

    @Autowired
    IMtimeSourceDictTService sourceService;

    @Autowired
    IMtimeYearDictTService yearService;

    @Test
    public void mytest() {
        List<MtimeCatDictT> catListT = catService.selectList(null);
        ArrayList<CatVo> catVos = new ArrayList<>();
        for (MtimeCatDictT t : catListT) {
            CatVo catVo = new CatVo();
            catVo.setCatId(t.getUuid().toString());
            catVo.setCatName(t.getShowName());
            catVos.add(catVo);
        }
        System.out.println(catVos);
    }

}