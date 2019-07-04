package com.stackroute.junit3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionsTest {
    Exceptions exceptionobj;
    @Before
    public void setup()
    {
        exceptionobj=new Exceptions();
    }
    @Test
    public void givenNullStringReturnsNullPointerException()
    {
        String result=exceptionobj.checkExceptions(" ");
        assertEquals("nullPointerException",result);
    }
    @Test
    public void givenIntegerReturnsIndexOutOfBoundException()
    {
        String result=exceptionobj.checkTheExceptions("11 ");
        assertEquals("index out of bound",result);
    }
    @Test
    public void givenNegativeIntegerReturnsNegativeArrayIndex()
    {
        String result=exceptionobj.checkTheExceptions("-2 ");
        assertEquals("negative array size exception",result);
    }
    @Test
    public void givenPositiveIntegerReturnsValidInput()
    {
        String result=exceptionobj.checkTheExceptions("2 ");
        assertEquals("valid input",result);
    }
    @After
    public void tearDown()
    {
        exceptionobj=null;
    }



}