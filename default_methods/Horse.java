package default_methods;

public class Horse implements Animal, Herbivore{

    @Override
    public void eat() {
      System.out.println("Horse eats only grass");
        
    }

    @Override
    public void walk() {
        System.out.println("Horse walks on 4 legs");
        
    }

    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
    }
    
}
