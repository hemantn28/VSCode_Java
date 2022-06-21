package string;

public class InternMethod {
    public static void main(String[] args) {
        
        String st1=new String("Hello Java");

        //String st2=st1;

        String st2=st1.intern();

        System.out.println(st1==st2);

    }
}


