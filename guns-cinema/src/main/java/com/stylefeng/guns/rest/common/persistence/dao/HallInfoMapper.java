package com.stylefeng.guns.rest.common.persistence.dao;

import com.stylefeng.guns.rest.common.persistence.model.HallInfo;

public interface HallInfoMapper {
    HallInfo selectByFieldid(Integer fieldId);

}
