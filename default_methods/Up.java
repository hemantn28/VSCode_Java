package default_methods;

public interface Up {
   
    public static void m1(){
        System.out.println("Interface static method");
    }

}



class Direction implements Up{


    public static void main(String[] args) {
       Up.m1();
    }
}
