package com.stylefeng.guns.rest.modular.film.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.stylefeng.guns.rest.GunsFilmApplication;
import com.stylefeng.guns.rest.common.persistence.dao.FilmSearchDetailMapper;
import com.stylefeng.guns.rest.common.persistence.model.*;
import com.stylefeng.guns.rest.modular.film.service.IMtimeActorTService;
import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmActorTService;
import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmInfoTService;
import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmTService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = GunsFilmApplication.class)
public class FilmSearchDetailServiceImplTest {
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

    DataVO dataVO=new DataVO();
    InnerDataVO innerDataVO=new InnerDataVO();

    InfoVO info04=new InfoVO();
    ActorsVO actorsVO=new ActorsVO();
    DirectorVO director = new DirectorVO();
    List<InnerActorsVO> actors=new ArrayList<>();


    @Test
    public void mytest(){
        //wrapper是java的一个封装实体类
        EntityWrapper<MtimeFilmInfoT> filmInfoTWrapper = new EntityWrapper<>();
        //将实体对象中属性film_id赋值为2，通过这个为查找条件，为调用对应service做准备
        filmInfoTWrapper.eq("film_id",2);
        //调用对应的service方法，查找到整条元祖信息，封装入javabean中
        MtimeFilmInfoT mtimeFilmInfoT = filmInfoTService.selectOne(filmInfoTWrapper);
        //插入info4
        String biography = mtimeFilmInfoT.getBiography();
        info04.setBiography(biography);

        //wrapper核心操作就是两头操作，头输入bean查询参数条件，身选择service的sql方法语句，尾bean得到查询结果
        //头查询参数不同，结果也可能不同，比如查询参数为1的所有条件，必然是list
        //身选择sql增删改查语句种类
        //尾巴情况就查询结果一条元祖，那就是一个bean，如果多条就是一个bean数组list
        EntityWrapper<MtimeActorT> actorTWrapper = new EntityWrapper<>();
        actorTWrapper.eq("UUID",  mtimeFilmInfoT.getDirectorId());
        MtimeActorT mtimeActorT = actorTService.selectOne(actorTWrapper);
        director.setDirectorName(mtimeActorT.getActorImg());
        director.setImgAddress(mtimeActorT.getActorName());
        actorsVO.setDirector(director);
        /*imgAddress : ‘actors/02136.jpg’,--ft
        directorName : ‘李易峰’,--fit
        roleName : ‘郑开司’—fat,at*/
        int filmId=2;
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
        //System.out.println(actorsVO);
    }
}