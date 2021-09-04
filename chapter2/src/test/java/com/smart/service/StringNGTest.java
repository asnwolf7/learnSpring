package com.smart.service;


import org.springframework.util.StringUtils;
import org.testng.annotations.Test;

public class StringNGTest {

    @Test
    public void isEmpty(){
        assert StringUtils.isEmpty(null);
        assert StringUtils.isEmpty("");
    }

    @Test
    public void trim(){
        assert "foo".equalsIgnoreCase(StringUtils.trimAllWhitespace("   foo    "));
    }
}
