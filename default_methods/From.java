package default_methods;

public interface From {
    
    public void m1();
    public void m2();
    default void m3(){
        System.out.println("Deafult Method:: m3");
    }
     
}
class HT implements From{

    @Override
    public void m1() {
       System.out.println("Inside HT: m1 method");
        
    }

    @Override
    public void m2() {
        System.out.println("Inside HT: m2 method");
        
    }
    @Override
    public void m3() {
        System.out.println("Overriding Default Method: m3 method");
        From.super.m3();
    }

public static void main(String[] args) {
    From f=new HT();
    f.m1();
    f.m2();
    f.m3();

}
}