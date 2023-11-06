package com.practice.Methods;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        table(a);
    }

    private static void table(int a) {
        for(int i=1;i<=10;i++) {
            System.out.println(a + "*" + i + "=" + a*i);
        }
    }

}
