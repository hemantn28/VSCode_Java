package class_objects;

public class Employee {
    
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        
        Employee emp1=new Employee("Akash", 21, 963568.500);

        System.out.println(emp1.name+" "+emp1.age+" "+emp1.salary);

        System.out.println();

        Employee emp2=new Employee("Roshan", 29, 85365.540);
        System.out.println(emp2.name+" "+emp2.age+" "+emp2.salary);
    }

    
}
