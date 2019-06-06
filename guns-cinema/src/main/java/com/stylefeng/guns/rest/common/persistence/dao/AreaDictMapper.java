package com.stylefeng.guns.rest.common.persistence.dao;


import com.stylefeng.guns.rest.common.persistence.model.generator.AreaDict;
import com.stylefeng.guns.rest.common.persistence.model.generator.AreaDictExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaDictMapper {
    long countByExample(AreaDictExample example);

    int deleteByExample(AreaDictExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(AreaDict record);

    int insertSelective(AreaDict record);

    List<AreaDict> selectByExample(AreaDictExample example);

    AreaDict selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") AreaDict record, @Param("example") AreaDictExample example);

    int updateByExample(@Param("record") AreaDict record, @Param("example") AreaDictExample example);

    int updateByPrimaryKeySelective(AreaDict record);

    int updateByPrimaryKey(AreaDict record);
}