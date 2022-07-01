package Mixed;

import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        
        //Program to swap two numbers without using the third variable.

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of x");
        int x=sc.nextInt();

        System.out.println("Enter the value of y");
        int y=sc.nextInt();

        System.out.println("Before swapping numbers: "+x+" "+y);

        //Swapping

        x=x+y;

        y=x-y;

        x=x-y;

        System.out.println("After swapping numbers: "+x+ " "+y);
        
    }
}
