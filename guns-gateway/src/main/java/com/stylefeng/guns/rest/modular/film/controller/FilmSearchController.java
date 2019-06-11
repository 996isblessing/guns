package com.stylefeng.guns.rest.modular.film.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.common.persistence.MyPageHelper;

import com.stylefeng.guns.rest.common.persistence.model.FilmSearchVO;
import com.stylefeng.guns.rest.common.persistence.model.FilmSearchRequestVO;
import com.stylefeng.guns.rest.modular.film.service.FilmSearchService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("film")
public class FilmSearchController {

    @Reference
    FilmSearchService filmSearchService;

    FilmSearchVO filmSearchVO;
    //javabean创造实例
    MyPageHelper myPageHelper=new MyPageHelper();
    List<FilmSearchVO> list=new ArrayList<>();
    //FilmSearchVO filmSearchVO=new FilmSearchVO();

    @RequestMapping("/getFilms")
    @ResponseBody
    public MyPageHelper fileSearch(FilmSearchRequestVO filmSearchRequestVO){
        //短的用map存，长的用bean
        //前面两个是大条件，中间三个是小条件，后面的附带条件
        //showType=film_cats
        //sortId=film_status/film_time/film_score
        List<FilmSearchVO> list=filmSearchService.queryFilmSearchContentT(filmSearchRequestVO);
        int total=filmSearchService.queryFilmSearchContentTCount(filmSearchRequestVO);
        int num=filmSearchRequestVO.getPageSize();
        int totalPage=total/num+1;
        myPageHelper.setNowPage(filmSearchRequestVO.getNowPage());
        myPageHelper.setTotalPage(totalPage);
        myPageHelper.setStatus(0);
        myPageHelper.setImgPre("http://img.meetingshop.cn/");
        myPageHelper.setData(list);
        return myPageHelper;
    }
}
