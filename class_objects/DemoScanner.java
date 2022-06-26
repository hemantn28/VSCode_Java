package class_objects;

import java.util.Scanner;

public class DemoScanner {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Plz enter ur name");
        String name=sc.nextLine();
        System.out.println("You have entered ur name as "+name);

        System.out.println("Plz enter ur age");
        int age=sc.nextInt();
        System.out.println("u have entered ur age "+age);

        System.out.println("Plz enter ur salary");
        double salary=sc.nextDouble();
        System.out.println("You have entered ur salary as "+salary);
    }
}
