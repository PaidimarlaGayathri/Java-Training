package com.practice.JavaTraining;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers");
        int angle1= sc.nextInt();
        int angle2= sc.nextInt();
        int angle3= sc.nextInt();
        int res = angle1+angle2+angle3;
        if(res==180){
                    System.out.println("These 3 angles form a Triangle"); //60,40,80
        }
        else {
            System.out.println("These 3 angles not form a Triangle");
        }
    }
}
