package class_objects;

public class Dog {
    
    String name;
    String breed;
    int heightInFeet;
     
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.breed);
        System.out.println(this.heightInFeet);
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Lucy";
        d1.breed="Labrador";
        d1.heightInFeet=2;
        d1.printInfo();

        System.out.println();

        Dog d2=new Dog();
        d2.name="Johnny";
        d2.breed="Pomerian";
        d2.heightInFeet=2;
        d2.printInfo();
    }
}
