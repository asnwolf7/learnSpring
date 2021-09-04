package com.smart.service;

import com.smart.web.LoginCommand;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {

    public static LoginCommand initByDefaultConst() throws Throwable {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.smart.web.LoginCommand");

        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        LoginCommand loginCommand = (LoginCommand) cons.newInstance();

        Method setUserName = clazz.getMethod("setUserName", String.class);
        setUserName.invoke(loginCommand, "admin");
        Method setPassword = clazz.getMethod("setPassword", String.class);
        setPassword.invoke(loginCommand, "123456");

        return loginCommand;
    }

    public static void main(String[] args) throws Throwable {
        LoginCommand loginCommand= initByDefaultConst();
        System.out.println(loginCommand);
    }
}
