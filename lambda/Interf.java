package lambda;

public interface Interf {

    public void add(int i, int b);
}

class Demo {

    public static void main(String[] args) {

        Interf i= (a,b)->System.out.println("The sum is: "+(a+b));
         
        i.add(10,20);
        i.add(100,20);
        i.add(10,200);
        i.add(100,200);
      
    

    }
    
}


