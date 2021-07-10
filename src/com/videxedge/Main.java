package com.videxedge;

import java.util.Scanner;

public class Main {

    public static void q1(){
        int a;
        a = 5;
        System.out.println ("a=" + a);
    }

    public static void q2(){
        int a, b;
        a = 5;
        b=7;
        System.out.println ("a=" + a);
        System.out.println ("b=" + b);
        System.out.println ("a+b="+ (a+b));
    }

    public static void q4(){
        int first, second;
        first = 10;
        second = 100;
        System.out.println ("first=" + first);
        System.out.println ("second=" + second);
        System.out.println ("first+second=" + (first+second));
        System.out.println ("first*second="+ (first*second));
    }

    public static void q5(){
        int num;
        num = 83;
        num = 90;
        System.out.println ("num is " + num);
    }

    public static void q6(){
        int n1 , n2 , n3;
        n1 = 83;
        n2 = n1-3;
        n3 = n1+n2;
        System.out.println ("n1=" + n1);
        System.out.println ("n2=" + n2);
        System.out.println ("n3=" + n3);
    }

    public static void q7(){
        int num;
        num = 83;
        num = -17;
        System.out.println ("num=" + num);
    }

    public static void q8a(){
        int num;
        num = 10;
        num = num+1;
        System.out.println ("num=" + num);
    }

    public static void q8b(){
        int num;
        num = 10;
        num++;
        System.out.println ("num=" + num);
    }

    public static void q9a(){
        int x , y , z;
        x = 10;
        y = x;
        z = x;
        System.out.println ("x=" + x);
        System.out.println ("y=" + y);
        System.out.println ("z=" + z);
    }

    public static void q10(){
        int x , y ;
        x = 4;
        y = x;
        x = 10000;
        System.out.println ("x=" + x);
        System.out.println ("y=" + y);
    }

    public static void q11(){
        int side;
        side = 8;
        System.out.println ("The perimeter of the square is " + (4*side));
        System.out.println ("The area of the square is " + (side*side));
    }

    public static void q12(){
        int boys, girls;
        boys = 17;
        girls = 15;
        System.out.println ("Number of students in the class is " + (boys+girls));
        System.out.println ("Number of students can be added to the class is " + (42-(boys+girls)));
    }

    public static void q13(){
        int num = 100;
        System.out.println ("num=" + num);
    }

    public static void q14a(){
        int num = 100;
        int x = num++;
        System.out.println ("num=" + num);
        System.out.println ("x=" + x);
    }

    public static void q14b(){
        int num = 100;
        int x = ++num;
        System.out.println ("num=" + num);
        System.out.println ("x=" + x);
    }

    public static void q14c(){
        int num = 100;
        int x = num--;
        System.out.println ("num=" + num);
        System.out.println ("x=" + x);
    }

    public static void q15(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println ("enter int number");
        num = input.nextInt();
        System.out.println ("num = " + num);
    }

    public static void q16(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println ("Enter 1st int number:");
        num1 = input.nextInt();
        System.out.println ("Enter 2nd int number:");
        num2 = input.nextInt();
        System.out.println ("num2 = " + num2);
        System.out.println ("num1 = " + num1);
    }

    public static void q17(){
        Scanner input = new Scanner(System.in);
        int length, width;
        System.out.println ("Enter length int of rectangle:");
        length = input.nextInt();
        System.out.println ("Enter width int of rectangle:");
        width = input.nextInt();
        System.out.println ("The perimeter of the rectangle is " + (2*(length+width)));
        System.out.println ("The area of the rectangle is " + (length*width));
    }

    public static void q18(){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println ("Enter 1st int number:");
        num1 = input.nextInt();
        System.out.println ("Enter 2nd int number:");
        num2 = input.nextInt();
        System.out.println ("Enter 3rd int number:");
        num3 = input.nextInt();
        System.out.println ("" + num1);
        System.out.println (" " + num2);
        System.out.println ("  " + num3);
        System.out.println ("   " + num1 + " " + num2);
        System.out.println ("      " + num1 + " " + num2 + " " + num3);
    }

    public static void main(String[] args) {
//        q1();
//        q2();
//        q4();
//        q5();
//        q6();
//        q7();
//        q8a();
//        q8b();
//        q9a();
//        q10();
//        q11();
//        q12();
//        q13();
//        q14a();
//        q14b();
//        q14c();
//        q15();
//        q16();
//        q17();
        q18();
    }
}
