package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");

        double radius = in.nextDouble();
        //double area = Math.PI * radius*radius;

        if( radius <0){
            Scanner reenter = new Scanner(System.in);
            System.out.println("Please enter a number greater than zero");
            double radius2 = reenter.nextDouble();
            double area2 = Math.PI * radius2*radius2;
            System.out.println("The area of the circle is :" + area2);

        }else {
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circle is :" + area);
        }
    }
}
