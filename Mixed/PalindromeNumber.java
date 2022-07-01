package Mixed;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n,c,rem,s=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        n=sc.nextInt();
        c=n;

        while (n>0) {//121>0=true; 12>0=true; 1>0=true;
            rem=n%10;//121/10=1; rem=1; 12/10=2; rem=2;
            s=(s*10)+rem;//(0*10)+1=1; s=1; (1*10)+2=10+2=12;s=12;
            n=n/10; //121/10=12; n=12; 1/10=1;n=1;
        }
        if (c==s) {
            System.out.println("Plaindrome number");
        }else{
            System.out.println("Not Palindrome number");
        }
        
    }
}
