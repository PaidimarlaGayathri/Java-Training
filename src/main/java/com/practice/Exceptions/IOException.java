package com.practice.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOException {
    public static void main(String[] args){
        try {
            File myobj = new File("InputFile");
            Scanner read = new Scanner(myobj);
            while (read.hasNextLine()){
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}
