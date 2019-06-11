package com.stylefeng.guns.rest.modular.film.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.common.persistence.FilmSearchDetailVO;
import com.stylefeng.guns.rest.common.persistence.model.DataVO;
import com.stylefeng.guns.rest.modular.film.service.FilmSearchDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("film")
public class FilmSearchDetailController{
    //暂时关闭FilmSearchDetailController接口服务
    @Reference()
    FilmSearchDetailService filmSearchDetailService;

    FilmSearchDetailVO filmSearchDetailVO;
    //javabean创造实例
    FilmSearchDetailVO filmSearchDetailRequestVO=new FilmSearchDetailVO();
    DataVO dataVO=new DataVO();



    @RequestMapping("/films")
    @ResponseBody
    public FilmSearchDetailVO fileSearch(int  searchType,String searchParam){

      /*  List<filmSearchDetailVO> list=filmSearchDetailService.queryfilmSearchDetailContentT(filmSearchDetailRequestVO);
        int total=filmSearchDetailService.queryfilmSearchDetailContentTCount(filmSearchDetailRequestVO);
        int totalPage=total/(filmSearchDetailRequestVO.getPageSize()+1);*/
      //按照编号查找
      if(searchType==0){
          int filmId=Integer.parseInt(searchParam);
          dataVO=filmSearchDetailService.queryDataByFilmId(filmId);
      }//按照名称查找
      else{
          String  filmName=searchParam;
          dataVO=filmSearchDetailService.queryDataByFilmName(filmName);
        }
      //dataVO封装

      filmSearchDetailRequestVO.setData(dataVO);
      filmSearchDetailRequestVO.setImgPre("http://img.meetingshop.cn/");
      filmSearchDetailRequestVO.setStatus(0);
        return filmSearchDetailRequestVO;
    }


}

