package java8;

public interface Interf1 {
    
    public void add(int a, int b);
}

class Test1{
    public static void main(String[] args) {
        Interf1 i= (a,b)-> System.out.println("The sum of a & b is : "+(a+b));
        i.add(10, 20);
        i.add(100, 20);
        i.add(10, 200);
        i.add(104, 202);

    }
}
