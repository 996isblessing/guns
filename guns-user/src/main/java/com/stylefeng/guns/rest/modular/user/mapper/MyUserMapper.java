package com.stylefeng.guns.rest.modular.user.mapper;

import com.stylefeng.guns.rest.user.User;


public interface MyUserMapper {
    User SelectgetUserInfo(String username);
    int UpdateUserInfo(User user);
    User SelectgetUserInfoByUid(int uuid);
}
