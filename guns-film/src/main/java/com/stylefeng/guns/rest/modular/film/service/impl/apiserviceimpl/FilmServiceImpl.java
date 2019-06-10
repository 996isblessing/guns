package com.stylefeng.guns.rest.modular.film.service.impl.apiserviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.stylefeng.guns.rest.common.persistence.model.*;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.CatVo;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.FilmConditionVo;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.SourceVo;
import com.stylefeng.guns.rest.common.persistence.model.filmcondition.YearVo;
import com.stylefeng.guns.rest.common.persistence.model.index.*;
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
    public IndexResult queryIndexMsg() {
        IndexResult indexResult = new IndexResult();
        FilmTemplate hotFilmTemplate = new FilmTemplate();
        FilmTemplate soonFilmTemplate = new FilmTemplate();
        //banner
        List<Banner> banners = new ArrayList<>();
        List<MtimeBannerT> bannerList = bannerService.selectList(null);
        for (MtimeBannerT t : bannerList) {
            Banner banner = new Banner();
            banner.setBannerId(t.getUuid().toString());
            banner.setBannerAddress(t.getBannerAddress());
            banner.setBannerUrl(t.getBannerUrl());
            banners.add(banner);
        }

        //hotFilm已验证
        ArrayList<FilmInfo> filmInfoList = new ArrayList<>();
        EntityWrapper<MtimeFilmT> hotFilmcountWrapper = new EntityWrapper<>();
        hotFilmcountWrapper.eq("film_status", 1);
        int hotFilmNum = filmTService.selectCount(hotFilmcountWrapper);
        EntityWrapper<MtimeFilmT> entityWrapper = new EntityWrapper<>();
        entityWrapper.eq("film_status", 1);
        List<MtimeFilmT> hotFilm = filmTService.selectList(entityWrapper);
        for (MtimeFilmT t : hotFilm) {
            EntityWrapper<MtimeFilmInfoT> infoTEntityWrapper = new EntityWrapper<>();
            FilmInfo hotFilmInfo = new FilmInfo();
            Integer uuid = t.getUuid();
            infoTEntityWrapper.eq("UUID", uuid);
            MtimeFilmInfoT filmInfoT = filmInfoTService.selectOne(infoTEntityWrapper);
            hotFilmInfo.setFilmId(filmInfoT.getFilmId());
            hotFilmInfo.setFilmType(t.getFilmType());
            hotFilmInfo.setImgAddress(t.getImgAddress());
            hotFilmInfo.setFilmName(t.getFilmName());
            hotFilmInfo.setFilmScore(t.getFilmScore());
            filmInfoList.add(hotFilmInfo);
        }
        //赋值
        hotFilmTemplate.setFilmNum(hotFilmNum);
        hotFilmTemplate.setFilmInfo(filmInfoList);


        //soonFilms已验证
        List<FilmInfo> soonFilmList = new ArrayList<FilmInfo>();
        EntityWrapper<MtimeFilmT> soonFilmcountWrapper = new EntityWrapper<>();
        soonFilmcountWrapper.eq("film_status", 2);
        int soonFilmNum = filmTService.selectCount(soonFilmcountWrapper);
        EntityWrapper<MtimeFilmT> soonFilmWrapper = new EntityWrapper<>();
        soonFilmWrapper.eq("film_status", 2);
        List<MtimeFilmT> soonFilm = filmTService.selectList(soonFilmWrapper);
        for (MtimeFilmT t : soonFilm) {
            EntityWrapper<MtimeFilmInfoT> infoTEntityWrapper1 = new EntityWrapper<>();
            FilmInfo singlesoonFilm = new FilmInfo();
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
        soonFilmTemplate.setFilmNum(soonFilmNum);
        soonFilmTemplate.setFilmInfo(soonFilmList);


        //票房排行榜 film_box_office boxRanking 已验证
        ArrayList<FilmInfo> filmInfoList3 = new ArrayList<>();
        EntityWrapper<MtimeFilmT> entityWrapper3 = new EntityWrapper<>();
        entityWrapper3.orderBy("film_box_office", false);
        List<MtimeFilmT> mtimeFilmTS = filmTService.selectList(entityWrapper3);

        for (MtimeFilmT t : mtimeFilmTS) {
            EntityWrapper<MtimeFilmInfoT> infoTEntityWrapper3 = new EntityWrapper<>();
            FilmInfo expectRankingInfo = new FilmInfo();
            Integer uuid = t.getUuid();
            infoTEntityWrapper3.eq("film_id", uuid);
            MtimeFilmInfoT filmInfoT = filmInfoTService.selectOne(infoTEntityWrapper3);
            expectRankingInfo.setFilmId(filmInfoT.getFilmId());
            expectRankingInfo.setImgAddress(t.getImgAddress());
            expectRankingInfo.setFilmName(t.getFilmName());
            expectRankingInfo.setBoxNum(t.getFilmBoxOffice());
            filmInfoList3.add(expectRankingInfo);
        }

        //最受欢迎 expectRanking 按评分来查
        /*ArrayList<MtimeFilmT> expectRanking = new ArrayList<>();
        EntityWrapper<MtimeFilmT> filmWrapper4 = new EntityWrapper<>();
        filmWrapper4.orderBy("film_score", false);
        List<MtimeFilmT> list4 = filmTService.selectList(filmWrapper4);
        EntityWrapper<MtimeFilmInfoT> filminfoWrapper4 = new EntityWrapper<>();

        for (MtimeFilmT t : list4) {
            FilmInfo singleExpectRanking = new FilmInfo();
            Integer uuid = t.getUuid();
            filminfoWrapper4.eq("film_id", uuid);
            MtimeFilmInfoT filmInfo = filmInfoTService.selectOne(filminfoWrapper4);

            singleExpectRanking.setFilmId(filmInfo.getFilmId());
            singleExpectRanking.setImgAddress(t.getImgAddress());
            singleExpectRanking.setFilmName(t.getFilmName());
        }
       */

        //top100 top100电影列表
        ArrayList<FilmInfo> top100 = new ArrayList<>();
        EntityWrapper<MtimeFilmT> entityWrapper5 = new EntityWrapper<>();
        entityWrapper5.orderBy("film_score", false);
        List<MtimeFilmT> top100List = filmTService.selectList(entityWrapper5);
        for (MtimeFilmT t : top100List) {
            EntityWrapper<MtimeFilmInfoT> filmInfoWrapper5 = new EntityWrapper<>();
            FilmInfo singletop100 = new FilmInfo();
            Integer uuid = t.getUuid();
            filmInfoWrapper5.eq("film_id", uuid);
            MtimeFilmInfoT filmInfo = filmInfoTService.selectOne(filmInfoWrapper5);

            singletop100.setFilmId(filmInfo.getFilmId());
            singletop100.setImgAddress(t.getImgAddress());
            singletop100.setFilmName(t.getFilmName());
            singletop100.setScore(t.getFilmScore());
            top100.add(singletop100);
        }

        indexResult.setBanners(banners);
        indexResult.setHotFilms(hotFilmTemplate);
        indexResult.setSoonFilms(soonFilmTemplate);
        indexResult.setBoxRanking(filmInfoList3);
        indexResult.setTop100(top100);


        return indexResult;

    }

    @Override
    public FilmConditionVo getFilmCondition() {
        FilmConditionVo filmConditionVo = new FilmConditionVo();

        List<MtimeCatDictT> catListT = catService.selectList(null);
        ArrayList<CatVo> catVos = new ArrayList<>();
        for (MtimeCatDictT t : catListT) {
            CatVo catVo = new CatVo();
            catVo.setCatId(t.getUuid().toString());
            catVo.setCatName(t.getShowName());
            catVos.add(catVo);
        }

        //
        List<MtimeSourceDictT> sourceList = sourceService.selectList(null);
        ArrayList<SourceVo> sourceVos = new ArrayList<>();
        for (MtimeSourceDictT t : sourceList) {
            SourceVo sourceVo = new SourceVo();
            sourceVo.setSourceId(t.getUuid().toString());
            sourceVo.setSourceName(t.getShowName());
            sourceVos.add(sourceVo);
        }

        //
        List<MtimeYearDictT> yearList = yearService.selectList(null);
        ArrayList<YearVo> yearVos = new ArrayList<>();
        for (MtimeYearDictT t : yearList) {
            YearVo yearVo = new YearVo();
            yearVo.setYearId(t.getUuid().toString());
            yearVo.setYearName(t.getShowName());
            yearVos.add(yearVo);
        }
        filmConditionVo.setCatInfo(catVos);
        filmConditionVo.setSourceInfo(sourceVos);
        filmConditionVo.setYearInfo(yearVos);

        return filmConditionVo;
    }

    @Override
    public String myTest() {
        return "hello";
    }
}
