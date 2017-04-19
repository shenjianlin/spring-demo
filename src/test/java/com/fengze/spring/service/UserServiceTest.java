package com.fengze.spring.service;

import com.fengze.spring.dao.UserDao;
import com.fengze.spring.dao.impl.UserDaoImpl;
import com.fengze.spring.domain.BaseSpringTest;
import com.fengze.spring.domain.UserDo;
import com.fengze.spring.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016-12-05.
 */
@Slf4j
public class UserServiceTest extends BaseSpringTest {

    @Autowired
    private UserDao userDao;

//    ApplicationContext context;
//    AnnotationConfigApplicationContext annotationContext;

    @Before
    public void setUp() throws Exception {
//        context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

//        annotationContext = new AnnotationConfigApplicationContext();
//        annotationContext.scan("com.fengze.spring");
//        annotationContext.refresh();
    }

    @Test
    public void testValidateUser() throws Exception {
       // UserService service = context.getBean("userServiceImpl",UserService.class);

        UserDo u = new UserDo();
        u.setUserName("member");
        u.setPassword("member123");

        UserDo user = userDao.validateUser(u);
        log.info("user : {} ", user);
    }
}