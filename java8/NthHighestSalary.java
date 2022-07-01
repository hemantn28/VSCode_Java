package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import model.Employee;

public class NthHighestSalary {
    
    public static void main(String[] args) {
        
        List<Employee> emplist=new ArrayList<>();

        emplist.add(new Employee(1, "Rajan", "IT", 23, "Male", 56896.520));
        emplist.add(new Employee(2, "Neha", "Accounts", 25, "Female", 65398.456));
        emplist.add(new Employee(3, "Sameer", "Advertising", 27, "Male", 74256.231));
        emplist.add(new Employee(4, "Rahul", "HouseKeeping", 28, "Male", 87564.205));
        emplist.add(new Employee(5, "Sheetal", "IT", 24, "Female", 91036.500));

       Optional<Employee> sorted=emplist.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(sorted.get());
    }
}
