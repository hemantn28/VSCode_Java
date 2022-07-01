package default_methods;

public interface I {
    
    public void m1();
    public void m2();
    default void m3()
    {
        System.out.println("Default Methods");
    }
   

}
class Test implements I{

    @Override
    public void m1() {
       System.out.println("Inside Test and m1 method");
        
    }

    @Override
    public void m2() {
        System.out.println("Inside Test and m2 method");
        
    }
    public static void main(String[] args) {
        I i=new Test();
        i.m1();
        i.m2();
        i.m3();
       
    }

   
     
}

