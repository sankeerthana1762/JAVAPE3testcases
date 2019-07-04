package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class RemoveTheVowelsTest {
    RemoveTheVowels obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new RemoveTheVowels();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test
    public void givenAStringShouldRemovevowelsAndReturnString() {
        //Act

        String[] str = {"french"};
        //Assert
        assertEquals("", "frnch", obj.removeVowelFromStrings(str));

    }
    @Test
    public void givenAStringShouldRemovevowelsAndReturnStringArray() {
        //Act

        String[] str = {"Mexico,Westindies"};
        //Assert
        assertEquals("", "Mxc,Wstnds", obj.removeVowelFromStrings(str));

    }

}