package com.practice.JavaTraining;

import java.util.Scanner;

public class SquareAndCubes {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            int square = i*i;
            int cube = i*i*i;
            System.out.println("Number: " + i+" Square: "+square+" Cube: "+cube);
        }
    }
}
