package com.java;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//
//        int num= sc.nextInt();
//        int rev = 0;
//
//        while (num!=0)
//        {
//            rev = rev*10 +num%10;
//            num = num/10;
//        }

        //System.in tells the Scanner to take input from the console (keyboard).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");


        // Read the user input as a String and store it in variable 'num'
        // We use String to handle numbers of any length
        String num = sc.next();

        // Create a StringBuilder object 'sb' initialized with the user input
        // StringBuilder allows us to modify the string (like reversing it)
        StringBuilder sb = new StringBuilder(num);

        // Reverse the string using StringBuilder's reverse() method
        // Convert it back to String and store in variable 'rev'
        String rev = sb.reverse().toString();


        System.out.println("Reverse Number is:"+ rev);


    }
}
