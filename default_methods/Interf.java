package default_methods;

public interface Interf {
    
    default void m3(){
        System.out.println("Default Methods");
    }
    // default int hashCode(){
        
    // }
}

class Life implements Interf{

    
    @Override
    public void m3() {
        System.out.println("Overriding version of Default Methods");
        Interf.super.m3();
    }

    public static void main(String[] args) {
        Life mylife=new Life();
        mylife.m3();
    }
}
