package com.fengze.spring.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by ASUS on 2017/4/18.
 */
@Aspect
@Component
public class MyInterceptor {

//    @Pointcut("execution(* com.fengze.spring.service.impl.UserServiceImpl.*(..))")
//    private void anyMethod(){}//定义一个切入点

//    @Before("anyMethod() && args(name)")
//    public void doAccessCheck(String name){
//        System.out.println(name);
//        System.out.println("前置通知");
//    }

    @Before(value = "execution(* com.fengze.spring.service.impl..*.*(..))")
    public void doAccessCheck(){
        System.out.println("前置通知");
    }

    @AfterReturning(value = "execution(* com.fengze.spring.service.impl..*.*(..))")
    public void doAfter(){
        System.out.println("后置通知");
    }

    @After(value = "execution(* com.fengze.spring.service.impl..*.*(..))")
    public void after(){
        System.out.println("最终通知");
    }

    @AfterThrowing(value = "execution(* com.fengze.spring.service.impl..*.*(..))")
    public void doAfterThrow(){
        System.out.println("例外通知");
    }

    @Around(value = "execution(* com.fengze.spring.service.impl..*.*(..))")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("进入环绕通知");
        Object object = pjp.proceed();//执行该方法
        System.out.println(object.toString());
        System.out.println("退出方法");
        return object;
    }
}
