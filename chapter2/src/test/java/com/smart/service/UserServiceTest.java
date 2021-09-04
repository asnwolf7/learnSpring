package com.smart.service;

import com.smart.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

@ContextConfiguration(locations = "classpath*:/smart-context.xml")
public class UserServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserService userService;

//    @BeforeClass(dependsOnMethods={"springTestContextPrepareTestInstance"})
//    public void setup(){
//        System.out.println("初始化");
//        assertNotNull(userService);
//    }

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
