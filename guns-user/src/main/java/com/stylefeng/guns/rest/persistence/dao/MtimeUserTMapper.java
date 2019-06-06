package com.stylefeng.guns.rest.persistence.dao;

import com.stylefeng.guns.rest.persistence.model.MtimeUserT;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.rest.user.result.StatusResultVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2019-06-04
 */
public interface MtimeUserTMapper extends BaseMapper<MtimeUserT> {

    boolean userRegister(MtimeUserT user);

    MtimeUserT selectByName(String username);
}
