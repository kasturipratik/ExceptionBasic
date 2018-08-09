package com.company;


public class BasicException {
    public static void main(String[] args) {
        int a = 10,b = 0;
        try{
            int c = a / b;//exception
            System.out.println("The division is :"+c);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Program ends successfully...");
    }
}