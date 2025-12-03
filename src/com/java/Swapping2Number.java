package com.java;

public class Swapping2Number {
    public static void main(String[] args) {
        int a = 10, b =20;
        System.out.println("Before Swapping the number:"+a+" , "+b);

//        int c=a;
//        a=b;
//        b=c;

//        System.out.println("after Swapping the number:"+a+" ," + " "+b);

        System.out.println("----2nd logic using +&- without 3rd variable ");


        a=a+b;//10+20=30
        b=a-b;//10-20=10
        a=a-b;//30-10=20
        System.out.println("after Swapping the number:"+a+" ," + " "+b);
    }
}
