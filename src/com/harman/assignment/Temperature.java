package com.harman.assignment;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a,cel;
        System.out.println("Enter the temperature in Farenheit");
        a = in.nextInt();
        cel = ((a-32)*5)/9;
        System.out.println(cel);

    }
}
