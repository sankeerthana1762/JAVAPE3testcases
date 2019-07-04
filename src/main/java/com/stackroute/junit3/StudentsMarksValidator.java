package com.stackroute.junit3;

public class StudentsMarksValidator {
    public static String validateMarks(int students, int[] marksOfStudents) //checking whether the marks within the range of 1-50
    {
        int sum = 0;
        String output="";
        float average;
        for(int i = 0;i<marksOfStudents.length;i++){
            if(marksOfStudents[i]>=0 && marksOfStudents[i]<=50){
                output = "marks are valid";
            }
            else {
                output = marksOfStudents[i]+" is invalid";
                return  output;
            }
        }
        return output;
    }
}
