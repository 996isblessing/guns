package com.stylefeng.guns.rest.modular.film.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.stylefeng.guns.rest.common.persistence.dao.FilmSearchDetailMapper;
import com.stylefeng.guns.rest.common.persistence.model.*;
import com.stylefeng.guns.rest.modular.film.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class FilmSearchDetailServiceImpl implements FilmSearchDetailService {
    //guns最大的意义，就是封装了mapper的一套实现功能，调用即可，不用自己写了
    //在serviceimpl用guns之后 不再自己写mapper和mapper.xml调用生成的已有的service方法
    // 他们封装好了一套组建，实现从数据库查找一系列数据的操作
    //直接在他们基础上调用，进行数据拼接VO，可保证至少mapper除了不写之外，不会出问题
    @Autowired(required = false)
    FilmSearchDetailMapper filmSearchDetailMapper;
    @Autowired(required =false)
    IMtimeFilmInfoTService filmInfoTService;
    @Autowired(required =false)
    IMtimeActorTService actorTService;
    @Autowired(required =false)
    IMtimeFilmTService filmTService;
    @Autowired(required =false)
    IMtimeFilmActorTService filmActorTService;
    @Autowired(required =false)
    IMtimeCatDictTService catDictTService;
    @Autowired(required =false)
    IMtimeSourceDictTService sourceDictTService;

    DataVO dataVO=new DataVO();

    InfoVO info04=new InfoVO();
    ActorsVO actorsVO=new ActorsVO();
    DirectorVO director = new DirectorVO();
    List<InnerActorsVO> actors=new ArrayList<>();
    InnerActorsVO innerActorsVO=new InnerActorsVO();

    ImgVO imgVO=new ImgVO();

    @Override
    public DataVO queryDataByFilmId(int filmId) {
        //wrapper是java的一个封装实体类
        EntityWrapper<MtimeFilmInfoT> filmInfoTWrapper = new EntityWrapper<>();
        //将实体对象中属性film_id赋值为2，通过这个为查找条件，为调用对应service做准备
        filmInfoTWrapper.eq("film_id",2);
        //调用对应的service方法，查找到整条元祖信息，封装入javabean中
        MtimeFilmInfoT mtimeFilmInfoT = filmInfoTService.selectOne(filmInfoTWrapper);
        //插入info4
        String biography = mtimeFilmInfoT.getBiography();
        info04.setBiography(biography);

//        wrapper核心操作就是两头操作，头输入bean查询参数条件，身选择service的sql方法语句，尾bean得到查询结果
//        头查询参数不同，结果也可能不同，比如查询参数为1的所有条件，必然是list
//        身选择sql增删改查语句种类
//        尾巴情况就查询结果一条元祖，那就是一个bean，如果多条就是一个bean数组list
        EntityWrapper<MtimeActorT> actorTWrapper = new EntityWrapper<>();
        actorTWrapper.eq("UUID",  mtimeFilmInfoT.getDirectorId());
        MtimeActorT mtimeActorT = actorTService.selectOne(actorTWrapper);
        director.setDirectorName(mtimeActorT.getActorImg());
        director.setImgAddress(mtimeActorT.getActorName());
        actorsVO.setDirector(director);
        /*imgAddress : ‘actors/02136.jpg’,--ft
        directorName : ‘李易峰’,--fit
        roleName : ‘郑开司’—fat,at*/
        EntityWrapper<MtimeFilmActorT> actorTWrapper1 = new EntityWrapper<>();
        actorTWrapper1.eq("film_id",filmId);
        List<MtimeFilmActorT> filmActorTList = filmActorTService.selectList(actorTWrapper1);
        //System.out.println("list::::::::"+filmActorTList.toString());
        for(MtimeFilmActorT actorT:filmActorTList){
            //每次都是一个新的innerActorsVO对象，所以都得新建，之前放在全局变量，导致四个一样的了
            InnerActorsVO innerActorsVO=new InnerActorsVO();
            //获取imgAddress
            EntityWrapper<MtimeFilmT> filmTWrapper = new EntityWrapper<>();
            filmTWrapper.eq("UUID",filmId);
            MtimeFilmT filmT = filmTService.selectOne(filmTWrapper);
            innerActorsVO.setImgAddress(filmT.getImgAddress());
            //获取 roleName和directorName
            innerActorsVO.setRoleName(actorT.getRoleName());
            EntityWrapper<MtimeActorT> actorTWrapper2 = new EntityWrapper<>();
            actorTWrapper2.eq("UUID", actorT.getActorId());
            MtimeActorT mtimeActorT2 = actorTService.selectOne(actorTWrapper2);
            innerActorsVO.setDirectorName(mtimeActorT2.getActorName());
            //将innerActorsVO封装进actorsVO中的actors
            actors.add(innerActorsVO);
            // System.out.println("---------------------actors-----------------"+actors);
        }
        //将actors封装进actorsVO中
        actorsVO.setActors(actors);
        info04.setActors(actorsVO);
        dataVO.setInfo04(info04);
   /*     imgVO: {
            mainImg : ‘fims/123123.png’,fit
            img01 : ‘fims/12312.jpg’fit
            img02 : ‘films/16345.png’,fit
            img03 : ‘films/12938.jpg’,fit
            img04 : ‘films/21365.jpg’fit
        },*/
        EntityWrapper<MtimeFilmInfoT> filmInfoTWrapper2 = new EntityWrapper<>();
        filmInfoTWrapper2.eq("film_id",filmId);
        MtimeFilmInfoT actorT = filmInfoTService.selectOne(filmInfoTWrapper2);
        //对数组的处理，封装imgVO
        imgVO.setMainImg( actorT.getFilmImgs());
        imgVO.setImg01( actorT.getFilmImgs());
        imgVO.setImg03( actorT.getFilmImgs());
        imgVO.setImg02( actorT.getFilmImgs());
        dataVO.setImgVO(imgVO);
        //封装filmId
        dataVO.setFilmId(filmId);
        //封装data其他变量
      /*  int filmId;1
        String filmName;
        String filmEnName;1
        String imgAddress;1
        String score;1
        String scoreNum;1
        String totalBox;
        info01 : ‘动作，悬疑，冒险’,--ft
        info02 : ‘中国大陆，美国 / 132分钟’,--ft
        info03 : ‘2018-06-29大陆上映’,--ft
        String info01;
        String info02;
        String info03;
        InfoVO  info04;1
        ImgVO imgVO;1*/
        dataVO.setFilmEnName(mtimeFilmInfoT.getFilmEnName());
        EntityWrapper<MtimeFilmT> mtimeFilmTEntityWrapper = new EntityWrapper<>();
        mtimeFilmTEntityWrapper.eq("UUID",filmId);
        MtimeFilmT mtimeFilmT = filmTService.selectOne(mtimeFilmTEntityWrapper);
        dataVO.setFilmName(mtimeFilmT.getFilmName());
        dataVO.setImgAddress(mtimeFilmT.getImgAddress());
        dataVO.setScore(mtimeFilmT.getFilmScore());
        dataVO.setScoreNum(mtimeFilmInfoT.getFilmScoreNum().toString());
        dataVO.setTotalBox(mtimeFilmT.getFilmBoxOffice().toString());
        EntityWrapper<MtimeCatDictT> catDictTEntityWrapper = new EntityWrapper<>();
        int filmType = mtimeFilmT.getFilmType();
        catDictTEntityWrapper.eq("UUID", filmType);
        //空指针异常，因为数据库film_type根本不对默认0
        MtimeCatDictT mtimeCatDictT = catDictTService.selectOne(catDictTEntityWrapper);
        dataVO.setInfo01(mtimeCatDictT.getShowName());
       EntityWrapper<MtimeSourceDictT> mtimeSourceDictTEntityWrapper = new EntityWrapper<>();
       mtimeSourceDictTEntityWrapper.eq("UUID",mtimeFilmT.getFilmSource());
       MtimeSourceDictT mtimeSourceDictT = sourceDictTService.selectOne(mtimeSourceDictTEntityWrapper);
       dataVO.setInfo02(mtimeSourceDictT.getShowName());
       dataVO.setInfo03(mtimeFilmT.getFilmTime().toString());
        return dataVO;
    }

    @Override
    public DataVO queryDataByFilmName(String filmName) {
        //通过filmName找到filmId，调用写好的查询
        EntityWrapper<MtimeFilmT> mtimeFilmTEntityWrapper = new EntityWrapper<>();
        mtimeFilmTEntityWrapper.eq("film_name",filmName);
        MtimeFilmT mtimeFilmT = filmTService.selectOne(mtimeFilmTEntityWrapper);
        Integer filmId = mtimeFilmT.getUuid();
        return queryDataByFilmId(filmId);
    }
}
