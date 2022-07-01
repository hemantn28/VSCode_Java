package Mixed;

import java.util.Scanner;

public class ArmstrongNumberDemo {
    public static void main(String[] args) {
        
        //153= 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27=153

       int n=155;
       int t=n;
       int r,sum=0;

       while (n>0) {
        r=n%10;
        n=n/10;
        sum=sum + r*r*r;
       }
       if (t==sum) {
        System.out.println("It an Armstrong number");
       }else{
        System.out.println("Not an Armstrong Number");
       }
       
       



    }
}
