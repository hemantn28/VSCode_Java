package custom_exception;

public class AgeNotEligibleException extends Exception{

    public AgeNotEligibleException(String message) {
        super(message);
    }
    
    //Step 1. Make Exception class as Parent.
    //Step 2. Override constructor with message.
    //Step 3. Use throw keyword to throw exception from our code.

  

}
