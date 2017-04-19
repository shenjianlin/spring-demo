package com.fengze.spring.common;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by ASUS on 2017/4/18.
 * <p/>
 * 1 execution (* com.fengze.spring.service.impl..*.*(..))
 * 2 execution ： 表示执行
 * 3 第一个*号 : 表示返回值类型， *可以是任意类型
 * 4 com.wangku.spring.service.impl : 代表扫描的包
 * 5 .. : 代表其底下的子包也进行拦截
 * 6 第二个*号 : 代表对哪个类进行拦截，*代表所有类
 * 7 第三个*号 : 代表方法  *代表任意方法
 * 8 (..) : 代表方法的参数有无都可以
 */
public class UserAop {

    public void doBefore() {
        System.out.println("========执行前置通知==========");
    }


    public void doAferReturning() {
        System.out.println("=========执行最终通知================");
    }

    public void doAfter() {
        System.out.println("========执行后置通知==========");
    }

    public void doAferThrowing() {
        System.out.println("=============执行意外通知================");
    }

    //环绕通知
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("=========进入判断方法===========");
        Object result = pjp.proceed();
        System.out.printf("result:" + result.toString());
        System.out.println("==========进入退出方法==========");
        return result;
    }
}