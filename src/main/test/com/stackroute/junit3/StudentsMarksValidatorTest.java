package com.stackroute.junit3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsMarksValidatorTest {
    StudentsMarksValidator MarksValidatorobj;
    @Before
    public void setUp() {
        MarksValidatorobj = new StudentsMarksValidator();
    }

    @Test
    public void givenIntegerArrayReturnsValidStudentMarks()
    {
        int students=5;
        int[] marks = {25,35,40,21,42};
        String result = MarksValidatorobj.validateMarks(students,marks);
        assertEquals("marks are valid",result);
    }
    @Test
    public void givenIntegerArrayReturnsStudentMarksAsInvalid()
    {
        int students=6;
        int[] marks = {24,25,52,37,44,22};
        String result = MarksValidatorobj.validateMarks(students,marks);
        assertEquals("52 is invalid",result);
    }
    @After
    public void tearDown(){
        MarksValidatorobj = null;
    }


}