package Exceptions;

public class Calculator {
  
    public void divide(int a, int b){
        int result=0;
        System.out.println("***before division");
        try {
            result=a/b;
        } catch (Exception e) {
            System.out.println("Exception occured so result will be zero");
        }
        finally{
            System.out.println("FINALLY BLOCK EXECUTION");
        }
       
        System.out.println("***after division");
        System.out.println("division is: "+result);
    
        System.out.println();
       
    }
    

    public void printArray(int[] arr){
        System.out.println("***before print");
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        
         System.out.println("***after print");
    }

    public static void main(String[] args) {
        Calculator calc= new Calculator();
        calc.divide(10, 2);
   
        int arr[]={2,85,6};
        calc.printArray(arr);


    }
    
}
