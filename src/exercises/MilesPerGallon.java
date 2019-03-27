package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args){
        double miles;
        double gallons;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter number of miles driven:");
        miles = in.nextDouble();
        System.out.println("Please enter number of gallons used:");
        gallons = in.nextDouble();

        double milesPerGal = miles/gallons;
        System.out.println("You hae consumed " + milesPerGal + " miles/gallon");
    }
}
