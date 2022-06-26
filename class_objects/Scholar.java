package class_objects;

public class Scholar {
    
    public void study(){
        System.out.println("STudents study");
    }

    public void play(){
        System.out.println("Students play");
    }
    public static void main(String[] args) {
        Scholar sch1=new Scholar();
        sch1.study();
        sch1.play();
    }
}
