package java8;

public class Cat implements Printable{
    String name;
    int age;

    @Override
    public void print() {
       System.out.println("meow");
        
    }

}
