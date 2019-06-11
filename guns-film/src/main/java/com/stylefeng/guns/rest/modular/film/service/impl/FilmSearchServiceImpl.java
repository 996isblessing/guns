package com.stylefeng.guns.rest.modular.film.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.common.persistence.dao.FilmSearchMapper;


import com.stylefeng.guns.rest.common.persistence.model.FilmSearchVO;
import com.stylefeng.guns.rest.common.persistence.model.FilmSearchRequestVO;
import com.stylefeng.guns.rest.modular.film.service.FilmSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@Service(interfaceClass = FilmSearchService.class)
public class FilmSearchServiceImpl implements FilmSearchService {
    @Autowired(required = false)
    FilmSearchMapper filmSearchMapper;



    @Override
    public List<FilmSearchVO> queryFilmSearchContentT(FilmSearchRequestVO filmSearchRequestVO) {
        int showType=filmSearchRequestVO.getShowType();
        int sortId=filmSearchRequestVO.getSortId();
        int catId=filmSearchRequestVO.getCatId();
        int sourceId=filmSearchRequestVO.getSourceId();
        int yearId=filmSearchRequestVO.getYearId();
        int offset=(filmSearchRequestVO.getNowPage()-1)*filmSearchRequestVO.getPageSize();
        int pageSize=filmSearchRequestVO.getPageSize();
        String sort="desc";
        int filmStatus=showType;
        if (sortId==1){
            sort="filmStatus";}
        else if(sortId==2){
            sort="filmTime";
        }else{
            sort="filmScore";
        }
        List<FilmSearchVO> list = filmSearchMapper.queryFilmSearchContentT(filmStatus, sort, catId, sourceId, yearId, offset, pageSize);
        return list;
    }

    @Override
    public int queryFilmSearchContentTCount(FilmSearchRequestVO filmSearchRequestVO) {
        int showType=filmSearchRequestVO.getShowType();
        int sortId=filmSearchRequestVO.getSortId();
        int catId=filmSearchRequestVO.getCatId();
        int sourceId=filmSearchRequestVO.getSourceId();
        int yearId=filmSearchRequestVO.getYearId();
        String sort="desc";
        int filmStatus=showType;
        if (sortId==1){
            sort="filmStatus";}
        else if(sortId==2){
            sort="filmTime";
        }else if(sortId==3){
            sort="filmScore";
        }
        int i = filmSearchMapper.queryFilmSearchContentTCount(filmStatus,catId,sourceId,yearId);
        return i;
    }
}
