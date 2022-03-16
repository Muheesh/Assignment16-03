package com.harman.assignment;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,root;
        System.out.println("Enter the number");
        a = input.nextInt();
        root = java.lang.Math.sqrt(a);
        System.out.println(root);

    }
}
