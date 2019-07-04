package com.stackroute.junit3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckSevenConsecutiveNumbersTest {

    CheckSevenConsecutiveNumbers ConsecutiveNumbers;

    @Before
    public void setUp(){
        ConsecutiveNumbers=new CheckSevenConsecutiveNumbers();
    }

    @Test
    public void givenIntegerArrayReturnsItIsConsecutive(){
        String result=ConsecutiveNumbers.checkConsecutive(new int[]{21,22,23,24},3);
        assertEquals(" 21,22,23,24, are consecutive",result);
    }

    @Test

    public void givenIntegerArrayReturnsItIsNotConsecutive(){
        String result=ConsecutiveNumbers.checkConsecutive(new int[]{51,51,52,54,55},4);
        assertEquals(" 51,51,52,54,55 are not consecutive",result);
    }

    @After
    public void tearDown(){
        ConsecutiveNumbers=null;
    }

}