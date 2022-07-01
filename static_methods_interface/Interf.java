package static_methods_interface;

public interface Interf {
    
    public static void m1(){
        System.out.println("Interface static method");
    }
}

class Ship {

    public static void main(String[] args) {
        Interf.m1();
        
    }
}
