package com.practice.JavaTraining;
import java.util.*;

public class GreaterVariables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a,b,c,d");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int res1 = a+b;
        int res2 = c+d;
        if(res1>res2){
            System.out.println("Higher value variables are:" + " " + "a" + "," + "b");
        }
        else if(res1<res2){
            System.out.println("Higher value variables are:" + " " + "c" + "," + "d");
        }
        else{
            System.out.println("Higher value variables are:" + " " + "a" + "," + "b" + "," + "c" + "," + "d");
        }
    }
}
