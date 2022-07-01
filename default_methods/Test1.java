package default_methods;

public class Test1 implements I {

    @Override
    public void m1() {
        System.out.println("Inside Test1 and m1 method");
        
    }

    @Override
    public void m2() {
        System.out.println("Inside Test1 and m2 method");
        
    }
    public static void main(String[] args) {
        Test1 t=new Test1();
        t.m1();
        t.m2();
       
    }

   
    
}
