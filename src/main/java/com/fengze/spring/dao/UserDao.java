package com.fengze.spring.dao;

import com.fengze.spring.domain.UserDo;

/**
 * Created by ASUS on 2017/4/18.
 */
public interface UserDao {

    public UserDo validateUser(UserDo userDo);
}