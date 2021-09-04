package com.smart.service;

import com.smart.domain.LoginLog;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ObjectAnalyzerTest {

    @Test
    public void test001(){
        List<Integer> squares = new ArrayList<Integer>();
        for(int i = 1; i < 5; i++){
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }

    @Test
    public void test002(){
        System.out.println(new ObjectAnalyzer().toString(new Thread()));
    }

    @Test
    public void test003(){
        System.out.println(new ObjectAnalyzer().toString(new LoginLog()));
    }
}
