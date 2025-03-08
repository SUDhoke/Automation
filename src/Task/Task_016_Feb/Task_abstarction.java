package Task.Task_016_Feb;

public class Task_abstarction
{
    public static void main(String[] args) {
        PrintMyBook pmb = new PrintMyBook("Harry potter","j.k,Rowling",120);
        pmb.getDetails();
    }
}
//class abstraction
abstract class Book
{
    //attributes
    String name;
    String author;
    int price;

    Book(String name,String author,int price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    //abstract method
   public abstract void getDetails();
}
class PrintMyBook extends Book{

    PrintMyBook(String name, String author,int price)
    {
        super(name,author,price);
    }

    @Override
    public void getDetails()
    {
        System.out.println("Book details: ");
        System.out.println("name : "+this.name);
        System.out.println("author :"+this.author);
        System.out.println("Price :"+this.price);
    }

}