package class_objects;

public class CalculatorInput {
    
    public void adition(int a, int b){
         int result=a+b;
         System.out.println("The addition is "+result);
    }

    public void subtraction(int a, int b){
        int result=a-b;
        System.out.println("The subtraction is "+result);
    }
    public void multiply(int a, int b){
        int result=a*b;
        System.out.println("The multiplication is "+result);
    }

    public void divide(double a, double b){
        double result=a/b;
        System.out.println("the division is "+result);
    }
    public static void main(String[] args) {
        CalculatorInput obj=new CalculatorInput();
        obj.adition(8, 10);
        obj.subtraction(48, 21);
        obj.multiply(2, 4);
        obj.divide(45, 2);
    }
}
