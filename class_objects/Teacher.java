package class_objects;


public class Teacher {
    
    String name;
    String school;
    int age;
    String subject;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.school);
        System.out.println(this.age);
        System.out.println(this.subject);

        
    }

    public Teacher(String name, String school, int age, String subject) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.subject = subject;
    }

    public static void main(String[] args) {
        
    Teacher t1=new Teacher("Ramesh", "ABC", 50, "History");
    t1.printInfo();
     
    System.out.println();
    Teacher t2=new Teacher("Rakesh", "ZBC", 45, "English");
    t1.printInfo();

    System.out.println();
    
    Teacher t3=new Teacher("NK Jha", "Modern", 48, "Hindi");
    System.out.println(t3.name+" "+t3.school+" "+t3.age+" "+t3.subject);
    

}

}
