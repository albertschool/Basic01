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

    public static void q19a(){
        Scanner input = new Scanner(System.in);
        int num1, diff;
        System.out.println ("Enter 1st number of series:");
        num1 = input.nextInt();
        System.out.println ("Enter difference of series:");
        diff = input.nextInt();
        int num3 = num1 + 2 * diff;
        int num4 = num3 + diff;
        System.out.println ("The 3rd number of the series is " + num3);
        System.out.println ("The 4th number of the series is " + num4);
    }

    public static void q19b(){
        Scanner input = new Scanner(System.in);
        int num1, diff;
        System.out.println ("Enter 1st number of series:");
        num1 = input.nextInt();
        System.out.println ("Enter difference of series:");
        diff = input.nextInt();
        int num3 = num1 + 2 * diff;
        int num4 = num3 + diff;
        System.out.println ("The 3rd number of the series is " + num3);
        System.out.println ("The 4th number of the series is " + num4);
        System.out.println ("The sum of first 4 numbers of the series is " + (num1 + num1 + diff + num3 + num4));
    }

    public static void q20(){
        Scanner input = new Scanner(System.in);
        int a; // first number;
        int b; // second number
        System.out.println ("enter first number");
        a = input.nextInt();
        System.out.println ("enter second number");
        b = input.nextInt();
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
        int c = a; // saving a value
        a = b;
        b = c;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
    }

    public static void q21(){
        double num;
        num = 1.35;
        System.out.println ("num=" + num);
    }

    public static void q22(){
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, num4;
        System.out.println ("Enter 1st number:");
        num1 = input.nextDouble();
        System.out.println ("Enter 2nd number:");
        num2 = input.nextDouble();
        System.out.println ("Enter 3rd number:");
        num3 = input.nextDouble();
        System.out.println ("Enter 4th number:");
        num4 = input.nextDouble();
        System.out.println ("The average is: " + (num1+num2+num3+num4)/4);
    }

    public static void q23a(){
        int numI = 15;
        double numD;
        numD = numI;
        System.out.println ("numI= " + numI);
        System.out.println ("numD= " + numD);
    }

    public static void q23c(){
        int numI;
        double numD;
        numD = 9.6;
        numI = (int)numD;
        System.out.println ("numI= " + numI);
        System.out.println ("numD= " + numD);
    }

    public static void q24(){
        char tav1 , tav2;
        tav1 = 't';
        tav2 = '+';
        System.out.println ("tav1=" + tav1);
        System.out.println ("tav2=" + tav2);
    }

    public static void q25a(){
        int num;
        char ch;
        ch = 'c';
        num = ch;
        System.out.println ("num=" + num);
        System.out.println ("ch=" + ch);
    }

    public static void q25c(){
        int num;
        char ch;
        num = 99;
        ch = (char) num;
        System.out.println ("num=" + num);
        System.out.println ("ch=" + ch);
    }

    public static void q26(){
        Scanner input = new Scanner(System.in);
        int a;
        double b;
        System.out.println ("enter two number");
        a = input.nextInt();
        b = input.nextDouble();
        double result = a+b;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
        System.out.println ("result="+result);
    }

    public static void q27(){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println ("enter two number");
        a = input.nextInt();
        b = input.nextInt();
        int result = a%b;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
        System.out.println ("result="+result);
    }

    public static void q28(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println ("enter the 3 digit number");
        num = input.nextInt();
        int n1 = num % 10;
        num = num / 10;
        int n2 = num % 10;
        int n3 = num / 10;
        System.out.println ("result="+ (n1*100+n2*10+n3));
    }

    public static void q29(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println ("enter an int amount of money");
        num = input.nextInt();
        int n1 = num / 10;
        num = num % 10;
        int n2 = num / 5;
        int n3 = num % 5;
        System.out.println ("Amount of 10 coins: "+ n1);
        System.out.println ("Amount of 5 coins: "+ n2);
        System.out.println ("Amount of 1 coins: "+ n3);
    }

    public static void q30(){
        Scanner input = new Scanner(System.in);
        int day, daysLeft;
        System.out.println ("Enter today number:");
        day = input.nextInt();
        System.out.println ("Enter days left to birthday:");
        daysLeft = input.nextInt();
        System.out.println ("Birthday in day: "+ (day+daysLeft)%7);
    }

    public static void q31(){
        Scanner input = new Scanner(System.in);
        double a,b;
        System.out.println ("enter two number");
        a = input.nextDouble();
        b = input.nextDouble();
        double result = a%b;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
        System.out.println ("result="+result);
    }

    public static void q32a(){
        Scanner input = new Scanner(System.in);
        final double PI=3.14;
        double radius , area;
        System.out.println ("enter radius");
        radius = input.nextDouble();
        area = PI*radius*radius;
        System.out.println ("area ="+ area);
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
//        q18();
//        q19a();
//        q19b();
//        q20();
//        q21();
//        q22();
//        q23a();
//        q23c();
//        q24();
//        q25a();
//        q25c();
//        q26();
//        q27();
//        q28();
//        q29();
//        q30();
//        q31();
        q32a();
    }
}
