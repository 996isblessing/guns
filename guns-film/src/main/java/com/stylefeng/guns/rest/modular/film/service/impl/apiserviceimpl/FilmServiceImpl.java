package com.stylefeng.guns.rest.modular.film.service.impl.apiserviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.stylefeng.guns.rest.common.persistence.model.*;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.CatVoW;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.FilmConditionVoW;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.SourceVoW;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.YearVoW;
import com.stylefeng.guns.rest.common.persistence.model.index.*;
import com.stylefeng.guns.rest.common.persistence.model.index.FilmInfoW;
import com.stylefeng.guns.rest.film.FilmService;
import com.stylefeng.guns.rest.modular.film.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Service(interfaceClass = FilmService.class)
@Component
public class FilmServiceImpl implements FilmService {
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

    @Override
    public IndexResultW queryIndexMsg() {
        IndexResultW indexResultW = new IndexResultW();
        FilmTemplateW hotFilmTemplateW = new FilmTemplateW();
        FilmTemplateW soonFilmTemplateW = new FilmTemplateW();
        //banner
        List<BannerW> bannerWS = new ArrayList<>();
        List<MtimeBannerT> bannerList = bannerService.selectList(null);
        for (MtimeBannerT t : bannerList) {
            BannerW bannerW = new BannerW();
            bannerW.setBannerId(t.getUuid().toString());
            bannerW.setBannerAddress(t.getBannerAddress());
            bannerW.setBannerUrl(t.getBannerUrl());
            bannerWS.add(bannerW);
        }

        //hotFilm已验证
        ArrayList<FilmInfoW> filmInfoWList = new ArrayList<>();
        EntityWrapper<MtimeFilmT> hotFilmcountWrapper = new EntityWrapper<>();
        hotFilmcountWrapper.eq("film_status", 1);
        int hotFilmNum = filmTService.selectCount(hotFilmcountWrapper);
        EntityWrapper<MtimeFilmT> entityWrapper = new EntityWrapper<>();
        entityWrapper.eq("film_status", 1);
        List<MtimeFilmT> hotFilm = filmTService.selectList(entityWrapper);
        for (MtimeFilmT t : hotFilm) {
            EntityWrapper<MtimeFilmInfoT> infoTEntityWrapper = new EntityWrapper<>();
            FilmInfoW hotFilmInfoW = new FilmInfoW();
            Integer uuid = t.getUuid();
            infoTEntityWrapper.eq("UUID", uuid);
            MtimeFilmInfoT filmInfoT = filmInfoTService.selectOne(infoTEntityWrapper);
            hotFilmInfoW.setFilmId(filmInfoT.getFilmId());
            hotFilmInfoW.setFilmType(t.getFilmType());
            hotFilmInfoW.setImgAddress(t.getImgAddress());
            hotFilmInfoW.setFilmName(t.getFilmName());
            hotFilmInfoW.setFilmScore(t.getFilmScore());
            filmInfoWList.add(hotFilmInfoW);
        }
        //赋值
        hotFilmTemplateW.setFilmNum(hotFilmNum);
        hotFilmTemplateW.setFilmInfoW(filmInfoWList);


        //soonFilms已验证
        List<FilmInfoW> soonFilmList = new ArrayList<FilmInfoW>();
        EntityWrapper<MtimeFilmT> soonFilmcountWrapper = new EntityWrapper<>();
        soonFilmcountWrapper.eq("film_status", 2);
        int soonFilmNum = filmTService.selectCount(soonFilmcountWrapper);
        EntityWrapper<MtimeFilmT> soonFilmWrapper = new EntityWrapper<>();
        soonFilmWrapper.eq("film_status", 2);
        List<MtimeFilmT> soonFilm = filmTService.selectList(soonFilmWrapper);
        for (MtimeFilmT t : soonFilm) {
            EntityWrapper<MtimeFilmInfoT> infoTEntityWrapper1 = new EntityWrapper<>();
            FilmInfoW singlesoonFilm = new FilmInfoW();
            Integer uuid = t.getUuid();
            infoTEntityWrapper1.eq("film_id", uuid);
            MtimeFilmInfoT filmInfoT = filmInfoTService.selectOne(infoTEntityWrapper1);
            singlesoonFilm.setFilmId(filmInfoT.getFilmId());
            singlesoonFilm.setFilmType(t.getFilmType());
            singlesoonFilm.setImgAddress(t.getImgAddress());
            singlesoonFilm.setFilmName(t.getFilmName());
            singlesoonFilm.setExpectNum(t.getFilmPresalenum());
            singlesoonFilm.setShowTime(t.getFilmTime());
            soonFilmList.add(singlesoonFilm);
        }
        //soon赋值
        soonFilmTemplateW.setFilmNum(soonFilmNum);
        soonFilmTemplateW.setFilmInfoW(soonFilmList);


        //票房排行榜 film_box_office boxRanking 已验证
        ArrayList<FilmInfoW> filmInfoWList3 = new ArrayList<>();
        EntityWrapper<MtimeFilmT> entityWrapper3 = new EntityWrapper<>();
        entityWrapper3.orderBy("film_box_office", false);
        List<MtimeFilmT> mtimeFilmTS = filmTService.selectList(entityWrapper3);

        for (MtimeFilmT t : mtimeFilmTS) {
            EntityWrapper<MtimeFilmInfoT> infoTEntityWrapper3 = new EntityWrapper<>();
            FilmInfoW expectRankingInfo = new FilmInfoW();
            Integer uuid = t.getUuid();
            infoTEntityWrapper3.eq("film_id", uuid);
            MtimeFilmInfoT filmInfoT = filmInfoTService.selectOne(infoTEntityWrapper3);
            expectRankingInfo.setFilmId(filmInfoT.getFilmId());
            expectRankingInfo.setImgAddress(t.getImgAddress());
            expectRankingInfo.setFilmName(t.getFilmName());
            expectRankingInfo.setBoxNum(t.getFilmBoxOffice());
            filmInfoWList3.add(expectRankingInfo);
        }

        //最受欢迎 expectRanking 按评分来查
        /*ArrayList<MtimeFilmT> expectRanking = new ArrayList<>();
        EntityWrapper<MtimeFilmT> filmWrapper4 = new EntityWrapper<>();
        filmWrapper4.orderBy("film_score", false);
        List<MtimeFilmT> list4 = filmTService.selectList(filmWrapper4);
        EntityWrapper<MtimeFilmInfoT> filminfoWrapper4 = new EntityWrapper<>();

        for (MtimeFilmT t : list4) {
            FilmInfoW singleExpectRanking = new FilmInfoW();
            Integer uuid = t.getUuid();
            filminfoWrapper4.eq("film_id", uuid);
            MtimeFilmInfoT filmInfo = filmInfoTService.selectOne(filminfoWrapper4);

            singleExpectRanking.setFilmId(filmInfo.getFilmId());
            singleExpectRanking.setImgAddress(t.getImgAddress());
            singleExpectRanking.setFilmName(t.getFilmName());
        }
       */

        //top100 top100电影列表
        ArrayList<FilmInfoW> top100 = new ArrayList<>();
        EntityWrapper<MtimeFilmT> entityWrapper5 = new EntityWrapper<>();
        entityWrapper5.orderBy("film_score", false);
        List<MtimeFilmT> top100List = filmTService.selectList(entityWrapper5);
        for (MtimeFilmT t : top100List) {
            EntityWrapper<MtimeFilmInfoT> filmInfoWrapper5 = new EntityWrapper<>();
            FilmInfoW singletop100 = new FilmInfoW();
            Integer uuid = t.getUuid();
            filmInfoWrapper5.eq("film_id", uuid);
            MtimeFilmInfoT filmInfo = filmInfoTService.selectOne(filmInfoWrapper5);

            singletop100.setFilmId(filmInfo.getFilmId());
            singletop100.setImgAddress(t.getImgAddress());
            singletop100.setFilmName(t.getFilmName());
            singletop100.setScore(t.getFilmScore());
            top100.add(singletop100);
        }

        indexResultW.setBannerWS(bannerWS);
        indexResultW.setHotFilms(hotFilmTemplateW);
        indexResultW.setSoonFilms(soonFilmTemplateW);
        indexResultW.setBoxRanking(filmInfoWList3);
        indexResultW.setTop100(top100);


        return indexResultW;

    }

    @Override
    public FilmConditionVoW getFilmCondition() {
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
        return filmConditionVoW;
    }

    @Override
    public String myTest() {
        return "hello";
    }
}
