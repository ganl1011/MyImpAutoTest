package com.course.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoTest01 {
    @BeforeTest
    public void test00(){
        System.out.println("beforeTest");
    }
    @Test
    public void test01(){
        System.out.println("测试方法test");
    }
    @AfterTest
    public void test02(){
        System.out.println("after");
    }
}
