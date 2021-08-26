package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static int lengthOfLine1() {
        int x1,x2,y1,y2;
        double ds;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter x1 point");

        x1=sc.nextInt();

        System.out.println("enter y1 point");

        y1=sc.nextInt();

        System.out.println("enter x2point");

        x2=sc.nextInt();

        System.out.println("enter y2 point");

        y2=sc.nextInt();
        ds=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+ds);
        int l1 = (int) ds;
        return l1;
    }

    public static void main(String arg[]) {
        System.out.println("Welcome to Line Comparison.");
        lengthOfLine1();
    }

}