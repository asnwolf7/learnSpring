package com.smart.service;

import com.smart.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/smart-context.xml")
public class UserServiceJunitTest {

    @Autowired
    private UserService userService;


    @Test
    public void hasMatchUser(){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/smart-context.xml");
//        userService = (UserService)ctx.getBean("userService");


        boolean b1 = userService.hasMatchUsers("admin", "123456");
        boolean b2 = userService.hasMatchUsers("admin", "1111");
        assertTrue(b1);
        assertTrue(!b2);
    }

    @Test
    public void findUserByUserName(){
        User user = userService.findUserByUserName("admin");
        assertEquals(user.getUserName(), "admin");
    }
}
