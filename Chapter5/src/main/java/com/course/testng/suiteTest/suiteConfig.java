package com.course.testng.suiteTest;


import org.testng.annotations.*;

public class suiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuit");
    }
    @BeforeTest
    public void suiteBeforeTest(){
        System.out.println("suiteBeforeTest");
    }
    @Test
    public void suiteTest(){
        System.out.println("suiteTest");
    }
    @AfterTest
    public void suiteAfterTest(){
        System.out.println("suiteAfterTest");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuit");
    }
}
