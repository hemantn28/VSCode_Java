package Mixed;

import java.util.Scanner;

public class UserInput {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1=sc.nextInt();

        System.out.println("Enter num2");
        int num2=sc.nextInt();

        int result=num1+num2;
        System.out.println("Addition is "+result);
    }
}
