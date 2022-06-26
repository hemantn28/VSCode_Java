package class_objects;

public class MethodInputParameter {

    public void message(String name){
        System.out.println("My name is "+name);
    }

    public void printAge(int age){
        System.out.println("My age is "+age);
    }

    public void checkAge(int age){
        if(age>18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
    }

    public void salary(double salary){
        System.out.println("Your salary is "+salary);
    }

    public void checkSalary(double salary){
        if(salary>100000.0){
            System.out.println("ur salary is higher");
        }else{
            System.out.println("ur salary is lower");
        }
    }

    public void hello(String name, int age){
        System.out.println("My name is "+name+" And my age is "+age );
    }

    public void type(String subject, String school){
        System.out.println("My subject is "+subject+" And my school is "+school);
    }


    public static void main(String[] args) {
        MethodInputParameter obj=new MethodInputParameter();
        obj.message("Ram");
        obj.printAge(25);
        obj.checkAge(28);
        obj.salary(856359.500);
        obj.checkSalary(552350.50);
        obj.hello("Shouvik", 25);
        obj.type("History", "ABC");
    }
}
