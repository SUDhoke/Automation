package Ex_018_OOPs_Constructor.Ex_018_OOPs_Constructor_class_objects;

public class Book_multipleCon_class_obj
{
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("You can","George M");
        Book b3 = new Book("The_secret","Rohnda Bryan",256.23);

        b1.display();
        b2.display();
        b3.display();
    }

}
class Book
{
    String title;
    String author;
    double price;

    // Default constructor
    Book()
    {
        System.out.println("Default Constructor : ");
        title = "default_title";
        author = "default_author";
        price = 0.0d;

    }

    // parameterised constructor (title,author)
    Book(String title_t,String author_a)
    {
        System.out.println("Parametrised constructor : Two parameters");
        this.title = title_t;
        this.author = author_a;
    }
    //parametrised constructor - all three parameters
    Book(String title_t1,String author_a1,double price_p)
    {
        System.out.println("parametrised constructor : Three Parameters ");
        this.title = title_t1;
        this.author = author_a1;
        this.price = price_p;
    }

    void display()
    {
        System.out.println("Display all the details : ");
        System.out.println("Book_title : "+title+"\n"+"Book_author : "+author+"\n"+"Price : "+price);
    }
}
