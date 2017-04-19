package com.fengze.spring.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016-12-05.
 */
@Slf4j
public class UserDoTest extends BaseSpringTest {
//    ApplicationContext context;
//    AnnotationConfigApplicationContext annotationContext;

    @Autowired
    private UserDo userDo;

    @Before
    public void setUp() throws Exception {

//        context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        annotationContext = new AnnotationConfigApplicationContext();
//        annotationContext.scan("com.fengze.spring");
//        annotationContext.refresh();
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void getUserName() throws Exception {

//        UserDo userDo = annotationContext.getBean("userDo", UserDo.class);

        log.info("userDo 用户名 : {}", userDo.getUserName());

    }
}