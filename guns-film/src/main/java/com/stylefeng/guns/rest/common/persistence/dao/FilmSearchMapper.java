package com.stylefeng.guns.rest.common.persistence.dao;

import com.stylefeng.guns.rest.common.persistence.model.FilmSearchVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//@Component在启动程序配了扫描包
public interface FilmSearchMapper {
    //按条件查询
    List<FilmSearchVO> queryFilmSearchContentT(@Param("filmStatus") int filmStatus, @Param("sort") String sort, @Param("catId") int catId, @Param("sourceId") int sourceId, @Param("yearId") int yearId, @Param("offset") int offset, @Param("pageSize") int pageSize);
    //查询总数统计
    int queryFilmSearchContentTCount(@Param("filmStatus") int filmStatus,@Param("catId") int catId, @Param("sourceId") int sourceId,@Param("yearId") int yearId);
}
