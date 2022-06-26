package class_objects;

public class Calculator {

    public void addition(){
        int a=3;
        int b=35;
        int result=a+b;
        System.out.println("addition is :"+result);

    }

    public void subtraction(){
        int a=36;
        int b=21;
        int result=a-b;
        System.out.println("subtraction is "+result);
    }

    public void multiplication(){
        int a=25;
        int b=5;
        int result=a*b;
        System.out.println(result);
    }

    public void divide(){
        double a=55;
        double b=2;
        double result=a/b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator calc1=new Calculator();
        calc1.addition();
        calc1.subtraction();
        calc1.multiplication();
        calc1.divide();
    }
    
}
