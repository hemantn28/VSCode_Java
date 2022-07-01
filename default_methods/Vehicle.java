package default_methods;

public interface Vehicle {
    
    void v1();
}

interface Bike{
    void v2();

}
interface UtilityMachine{
    void v3();
}
interface MileageBikes{
    void v4();
}
interface GoodBikes{
    void v5();
}

class HeroSplendor implements Vehicle,Bike,UtilityMachine,MileageBikes,GoodBikes{

    @Override
    public void v1() {
        System.out.println("Splendor is a vehicle");
        
    }

    @Override
    public void v2() {
      System.out.println("Splendor is a bike");
        
    }

    

    @Override
    public void v3() {
        System.out.println("Splendor is a Utility Machine");
        
    }
    

    @Override
    public void v4() {
        System.out.println("Splendor is a Mileage Bike");
        
    }
    

    @Override
    public void v5() {
        System.out.println("Splendor is a Good Bike");
        
    }

    public static void main(String[] args) {
        HeroSplendor hs=new HeroSplendor();
        hs.v1();
        hs.v2();
        hs.v3();
        hs.v4();
        hs.v5();
    }
}
