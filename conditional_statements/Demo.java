package conditional_statements;

public class Demo {
    public static void main(String[] args) {
        
        int age=19;
        if (age>=18) {
            System.out.println("eligible for voting");
        }else{
            System.out.println("not eligible for voting");
        }

        String city="Agra";
        if (city=="Pune") {
            System.out.println("U r in Pune");
        }else{
            System.out.println("U r not in Pune");
        }

        double price=2005.50;

        if (price>=3000.00) {
            System.out.println("product is costly");
        }else{
            System.out.println("product is not costly");
        }
    }

}
