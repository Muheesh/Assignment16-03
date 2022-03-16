package com.harman.assignment;

import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year of birth");
        Integer yr;
        yr = input.nextInt();
        String a;
        a = (yr%4==0&&yr%100!=0)?"It is a leap year":"It is not a leap year";
        System.out.println(a);

    }
}
