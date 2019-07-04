package com.stackroute.junit3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDateTest {
    FirstAndLastDate firstandLastdateobj;

    @Before
    public void setup() {
        System.out.println("Before");
        firstandLastdateobj = new FirstAndLastDate();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        firstandLastdateobj = null;
    }


    @AfterClass
    public static void tearDownAfterClass() {

        System.out.println("AfterClass");
    }

    @Test
    public void givenNotingShouldReturnLastAndFirstDateOfWeek() {
        String result =firstandLastdateobj.FirstAndLastOfWeek();
        assertEquals("Mon 01/07/2019\n" + "Sun 07/07/2019",result);
    }


}