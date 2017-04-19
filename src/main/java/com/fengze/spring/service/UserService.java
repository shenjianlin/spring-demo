package com.fengze.spring.service;

import com.fengze.spring.domain.UserDo;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ASUS on 2017/4/18.
 */
public interface UserService {

public UserDo findUserById(UserDo userDo) throws Exception;

public Boolean addUser(UserDo userDo);

public UserDo login(String userName, String password) throws Exception;
        }

