package com.fengze.spring.service.impl;

import com.fengze.spring.domain.BaseSpringTest;
import com.fengze.spring.domain.UserDo;
import com.fengze.spring.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Repeat;

import javax.annotation.Resource;

import java.io.Serializable;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016-12-05.
 */
@Slf4j
public class UserServiceImplTest extends BaseSpringTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindUserById() throws Exception {
        UserDo userDo = new UserDo();
        userDo.setUserId(1005);
        UserDo userD1 = userService.findUserById(userDo);
        log.info("UserD1 : {}", userD1);

    }

    @Test
    public void testLogin() throws Exception {
        UserDo userDo = userService.login("member","member123");
        log.info("UserDo : {}", userDo);
    }

    //您可以轻松的多次执行测试用例，而不用自己写 for 循环
//    @Repeat(3)
    @Test
    public void testAddUser() throws Exception {
        UserDo userDo = userService.login("member","member123");

        userDo.setUserId(null);
        userDo.setCellPhone("12345678911");
        userDo.setEmail("zhanglingsi@qq.com");
        userDo.setUserName("zhanglingsi123");

        Boolean bool = userService.addUser(userDo);

        log.info("addUser : {}", bool);
    }
}