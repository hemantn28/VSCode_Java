package class_objects;

public class Demo {
    
    public void helloMe(){
        System.out.println("Hello java world");
    }

    public void welcome(){
        System.out.println("Welcome all");
    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.helloMe();
        obj.welcome();
    }
}
