package com.harman.assignment;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer a,b,sum,diff,avg;
        System.out.println("Enter two number greater than 10000");
        a = input.nextInt();
        b = input.nextInt();
        if (a>10000){
            if(b>10000){
                sum = a+b;
                System.out.println("the sum is:"+sum);
                diff = a-b;
                System.out.println("their difference is :"+diff);
                avg = sum/2;
                System.out.println("their average is :"+avg);
            }
        }else{
            System.out.println("Invalid numbers");

        }
    }
}
