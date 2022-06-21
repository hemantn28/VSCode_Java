package Telusko;

public class Demo_Telusko {
    public static void main(String[] args) {
        int a=5;

       //a +=1;//short hand
       //a++;// increment operator
      // a--;//decrement operator
      
      //int b=a++;
     // int b=++a;

     int b=a++ + ++a + a--;

      System.out.println("The value of b: "+b);
        System.out.println("The value of a: "+a);
       
    }
}
