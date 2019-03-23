package com.itheima.test;

import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("accountService");
        accountService.findAll();
    }
}
