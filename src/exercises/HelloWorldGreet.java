package exercises;

import java.util.Scanner;

public class HelloWorldGreet {
    public static void main (String[] args){
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println ("Please enter your name:");
        name = in.next();
        System.out.println("Hello " + name +"!");
    }
}
