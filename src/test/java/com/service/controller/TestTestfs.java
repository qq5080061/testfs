package com.service.controller;

import com.service.model.Person;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestTestfs {

    TestfsImpl testfsImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        testfsImpl = BeanUtils.getBean("testfsImpl");
    }



    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: testfsImpl.add(Integer a, Integer b)
        Integer returnValue = testfsImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: testfsImpl.sayHei(String name)
        String returnValue = testfsImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: testfsImpl.sayHello(String name)
        String returnValue = testfsImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHi(){

        String expactReturnValue = "hi,Tom,welcome to ServiceStage."; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: testfsImpl.sayHi(String name)
        String returnValue = testfsImpl.sayHi("Tom");

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: testfsImpl.saySomething(String prefix, Person user)
        String returnValue = testfsImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }

}



