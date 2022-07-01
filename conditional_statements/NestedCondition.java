package conditional_statements;

public class NestedCondition {
    public static void main(String[] args) {
        int age=23;
        String city="Delhi";

        if (!(age>18) && !(city=="Agra")) {
            System.out.println("Eligible for voting in Agra");
        }
        else{
            System.out.println("Not eligible for voting in Agra");
        }

        //OR OPERATOR

        int marks=85;
        String subject="Hindi";

        if (!(marks>=75) || subject=="Maths") {
            System.out.println("U have first division in maths");
        }else{
            System.out.println("No first division in maths");
        }
    }
}
