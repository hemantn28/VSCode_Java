package static_methods_interface;

public interface Limited {
    
    public void main(String args[]);
    public void display();
    
}

class Testclass1 implements Limited
{
   public void display()
   {
       System.out.println("hello");
    }
   public void main(String[] args)
   {
       //Limited l;
      // l.display();
    }
}
