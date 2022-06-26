package class_objects;

public class Book {
    
    String name;
    int pages;
    String author;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.pages);
        System.out.println(this.author);
    }

    public static void main(String[] args) {
        
        Book myBook=new Book();
        myBook.name="Can't hurt me";
        myBook.pages=250;
        myBook.author="David Goggins";
        myBook.printInfo();

        System.out.println();


        Book book2=new Book();
        book2.name="Discovery Of India";
        book2.pages=450;
        book2.author="Jawahar lal nahru";
        book2.printInfo();

        
    }
}
