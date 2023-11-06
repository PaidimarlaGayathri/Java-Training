package com.practice.Exceptions;

public class IndexOutOfBoundException {
    public static void main(String[] args) throws Exception{
        try {

            System.out.println("Inside the try block");

            //below code throws divide by zero exception
            int data=25/0;
            System.out.println(data);
        }
        //cannot handle Arithmetic type exception
        //can only accept Null Pointer type exception
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
            throw new Exception(e);
        }

        //executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }

}
