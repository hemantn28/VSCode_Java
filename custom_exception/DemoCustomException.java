package custom_exception;

public class DemoCustomException {

    public void doVoting(int age) throws AgeNotEligibleException{

        if(age<18){

            throw new AgeNotEligibleException("age is less than 18 hence not eligible for voting");
        }
        else{
            System.out.println("Welcome to voting app");
        }

    }
    
    public static void main(String[] args) throws AgeNotEligibleException {
        
        int age=19;

       DemoCustomException obj=new DemoCustomException();
       obj.doVoting(age);
    }
}
