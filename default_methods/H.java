package default_methods;

public class H implements From{

    @Override
    public void m1() {
        System.out.println("Inside H: m1 method");
        
    }

    @Override
    public void m2() {
        System.out.println("Inside H: m2 method");
        
    }
    public static void main(String[] args) {
        H h=new H();
        h.m1();
        h.m2();
    }
    
}
