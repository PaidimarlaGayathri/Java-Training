package com.practice.JavaTraining;

import java.util.Scanner;

public class SquaresOfEvenCubesOfOdd {
    public static void main(String[] args){

        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("Squares of even number: "+ i + "=" + i*i);
            }
            else{
                System.out.println("Cube of odd number: "+ i + "=" + i*i*i);
            }
        }

    }
    
}
