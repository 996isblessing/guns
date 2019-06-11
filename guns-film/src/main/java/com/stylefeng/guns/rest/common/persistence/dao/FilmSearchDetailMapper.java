package com.stylefeng.guns.rest.common.persistence.dao;

import com.stylefeng.guns.rest.common.persistence.model.InnerDataVO;

public interface FilmSearchDetailMapper {
    //按照filmId查询
    String queryBiographyById(int filmId);

    String queryImgAddressById(int filmId);

    String queryDirectorNameById(int filmId);

    int[] queryInnerActorIdById(int filmId);

    String queryDirectorNameByActorId(int i);

    String queryImgAddressByActorId(int i);

    String queryRoleNameByActorId(int i);

    String[] queryImgStringArrayById(int filmId);

    InnerDataVO queryInnerDataVOById(int filmId);

}
