package default_methods;

public interface Left {
    default void m1(){
        System.out.println("Left interface m1 method");
    }
}

interface Right{
    default void m1(){
        System.out.println("Right interface m1 method");
    } 
}

class Neutral implements Left, Right{
    public void m1(){
        System.out.println("Our own m method");
        Left.super.m1();
        Right.super.m1();
    }
    public static void main(String[] args) {
        Neutral n=new Neutral();
        n.m1();
    }
}
