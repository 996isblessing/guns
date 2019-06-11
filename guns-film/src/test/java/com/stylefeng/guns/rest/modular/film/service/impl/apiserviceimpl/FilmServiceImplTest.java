package com.stylefeng.guns.rest.modular.film.service.impl.apiserviceimpl;

import com.stylefeng.guns.rest.GunsFilmApplication;
import com.stylefeng.guns.rest.common.persistence.model.MtimeCatDictT;
import com.stylefeng.guns.rest.common.persistence.model.MtimeSourceDictT;
import com.stylefeng.guns.rest.common.persistence.model.MtimeYearDictT;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.CatVoW;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.FilmConditionVoW;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.SourceVoW;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.YearVoW;
import com.stylefeng.guns.rest.modular.film.service.*;
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
        FilmConditionVoW filmConditionVoW = new FilmConditionVoW();

        List<MtimeCatDictT> catListT = catService.selectList(null);
        ArrayList<CatVoW> catVoWS = new ArrayList<>();
        for (MtimeCatDictT t : catListT) {
            CatVoW catVoW = new CatVoW();
            catVoW.setCatId(t.getUuid().toString());
            catVoW.setCatName(t.getShowName());
            catVoWS.add(catVoW);
        }

        //
        List<MtimeSourceDictT> sourceList = sourceService.selectList(null);
        ArrayList<SourceVoW> sourceVoWS = new ArrayList<>();
        for (MtimeSourceDictT t : sourceList) {
            SourceVoW sourceVoW = new SourceVoW();
            sourceVoW.setSourceId(t.getUuid().toString());
            sourceVoW.setSourceName(t.getShowName());
            sourceVoWS.add(sourceVoW);
        }

        //
        List<MtimeYearDictT> yearList = yearService.selectList(null);
        ArrayList<YearVoW> yearVoWS = new ArrayList<>();
        for (MtimeYearDictT t : yearList) {
            YearVoW yearVoW = new YearVoW();
            yearVoW.setYearId(t.getUuid().toString());
            yearVoW.setYearName(t.getShowName());
            yearVoWS.add(yearVoW);
        }
        filmConditionVoW.setCatInfo(catVoWS);
        filmConditionVoW.setSourceInfo(sourceVoWS);
        filmConditionVoW.setYearInfo(yearVoWS);
        System.out.println(filmConditionVoW);

    }

}