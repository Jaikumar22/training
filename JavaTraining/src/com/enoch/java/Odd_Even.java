package com.enoch.java;

public class Odd_Even {
    public static void main(String[] args){
        System.out.println("List of even numbers: ");
        displayOddNumbers(100, 200);
    }
    
    
    
    
    private static void displayOddNumbers(int number, int end){
        if(number>end) { return; } 
        if(number%2==0) { 
        	System.out.println(number);
        }
         displayOddNumbers(number + 1,end);
    }
}
