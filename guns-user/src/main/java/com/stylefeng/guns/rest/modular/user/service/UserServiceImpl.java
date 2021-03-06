package com.stylefeng.guns.rest.modular.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.stylefeng.guns.rest.modular.utils.SerializeUtil;
import com.stylefeng.guns.rest.persistence.dao.MtimeUserTMapper;
import com.stylefeng.guns.rest.persistence.model.MtimeUserT;

import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.result.StatusResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Component
public class UserServiceImpl implements UserService {
    // @Autowired(required = false)
    //  MyUserMapper userMapper;

    @Autowired(required = false)
    MtimeUserTMapper userTMapper;

    @Override
    public void mytest() {
        System.out.println("dubbo success");
    }

    @Override
    public int mytest1() {
        return 12345;
    }

    @Override
    public MtimeUserT getUserInfo(String username) {
        MtimeUserT userT;
        Jedis jedis = new Jedis();
        byte[] usernamebytes = username.getBytes();
        byte[] user;
        //如果redis中存在username的信息则直接取出并反序列化
        if ((user = jedis.get(usernamebytes)) != null) {
            userT = (MtimeUserT) SerializeUtil.deserialize(user);
        }else {
            Map<String, Object> map = new HashMap();
            map.put("user_name", username);
            userT = userTMapper.selectByMap(map).get(0);
            //以username为键,序列化后的json为value存储进redis
            jedis.setex(username.getBytes(),180000,SerializeUtil.serizlize(userT));
        }
        return userT;
    }

    @Override
    public Integer updateUserInfo(MtimeUserT userT) {
        Integer i = userTMapper.UpdateUserInfo(userT);
        Jedis jedis = new Jedis();
        //更新完后删除原有缓存
        jedis.del(userT.getUsername().getBytes());
        return i;
    }

    @Override
    public StatusResultVo checkName(String username) {
        StatusResultVo resultVo = new StatusResultVo();

        Map<String, Object> map = new HashMap();
        map.put("user_name", username);

        try {
            List<MtimeUserT> mtimeUserTS = userTMapper.selectByMap(map);
            if (mtimeUserTS.size() != 0) {
                resultVo.setStatus(1);
                resultVo.setMsg("用户已存在");
                return resultVo;
            }
            resultVo.setStatus(0);
            resultVo.setMsg("验证成功");
            return resultVo;
        } catch (Exception e) {
            e.printStackTrace();
            resultVo.setStatus(999);
            resultVo.setMsg("系统出现异常，请联系管理员");
            return resultVo;
        }
    }

    @Override
    public StatusResultVo userRegister(MtimeUserT user) {
        StatusResultVo resultVo = this.checkName(user.getUsername());
        if (resultVo.getStatus() == 1) {                //用户名重复
            return resultVo;
        } else if (resultVo.getStatus() == 999) {      //检查用户名异常
            return resultVo;
        }
        try {                                         //检查通过，继续注册
            if (userTMapper.userRegister(user)) {
                resultVo.setStatus(0);
                resultVo.setMsg("注册成功");
                return resultVo;
            }
            resultVo.setStatus(999);
            resultVo.setMsg("系统出现异常，请联系管理员");
            return resultVo;
        } catch (Exception e) {
            e.printStackTrace();
            resultVo.setStatus(999);
            resultVo.setMsg("系统出现异常，请联系管理员");
            return resultVo;
        }

    }

    @Override
    public boolean auth(String username, String password) {
        StatusResultVo resultVo = new StatusResultVo();

        try {
            //查询用户密码
            MtimeUserT user = userTMapper.selectByName(username);
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }


}
