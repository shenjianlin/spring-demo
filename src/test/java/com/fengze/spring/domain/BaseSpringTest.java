package com.fengze.spring.domain;

import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016-12-05.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
// 添加注释@Transactional 回滚对数据库操作
//@Transactional(propagation= Propagation.NOT_SUPPORTED)
//@Transactional
public class BaseSpringTest {

}
