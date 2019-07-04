package com.stackroute.junit;

import java.util.Scanner;

public class AdditionOfTwoMatrix {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of rows");
        int r = input.nextInt();
        System.out.print("enter the number of columns");
        int c = input.nextInt();

        AdditionOfTwoMatrix obj = new AdditionOfTwoMatrix();
        obj.additionOfMatrix(r, c);


        public void additionOfMatrix(){
            int a[][] = new int[r][c];
            int b[][] = new int[r][c];

            int s[][] = new int[r][c];


            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    s[i][j] = a[i][j] + b[i][j];
                    System.out.print(s[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}