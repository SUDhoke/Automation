package Ex_021_Super_keyword;

public class super_keyword_02
{
    public static void main(String[] args) {
        son s1 = new son();
        s1.son_method();

        System.out.println();
        son s2 = new son(50);
    }
}
class Father
{
    int gold;
    //default constructor
    Father()
    {
        System.out.println("Default Constructor - with no parameters in it ");
    }
    //parameterised constructor
    Father(int g)
    {
        System.out.println("Father_Gold");
    }

    //method
    void home()
    {
        System.out.println("Father Home ");
    }
}
class son extends Father
{
    int s;
   //constructor
   son()
   {
       super();
   }
   son(int s)
   {
       super(50);
   }
   void son_method()
   {
       super.home();
       System.out.println(super.gold);
   }
}
