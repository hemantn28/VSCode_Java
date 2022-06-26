package class_objects;

public class Student {
    
    String name;
    int age;
    String section;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.section);
    }

   public static void main(String[] args) {
    
    Student std1=new Student();
    std1.name="Ashish";
    std1.age=21;
    std1.section="PCB";

    std1.printinfo();

    System.out.println();
   }

}
