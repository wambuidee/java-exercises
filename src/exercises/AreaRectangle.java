package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main (String[] args){
        float length;
        float width;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter rectangle length:");
        length = in.nextFloat();
        System.out.println("Please enter rectangle width:");
        width = in.nextFloat();

        float Area = length*width;
        System.out.println("The area of the rectangle is: " + Area);

    }
}

