package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject0qjh {

        Project0qjhDelegate project0qjhDelegate = new Project0qjhDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project0qjhDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}