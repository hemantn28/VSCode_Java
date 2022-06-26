package java8;

public interface Interf {
    public void m1();
}

class Test{
    public static void main(String[] args) {
        
        Interf i=()->System.out.println("Hello...By Lambda Expression");
        i.m1();
        i.m1();
        i.m1();
        i.m1();
        i.m1();
        i.m1();
        
    }
}
