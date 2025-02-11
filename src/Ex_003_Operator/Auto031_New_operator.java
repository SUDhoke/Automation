package Ex_003_Operator;

public class Auto031_New_operator
{
    int j;
    public Auto031_New_operator(int j)

    {
        this.j=j;
    }
    public int test(int t1, int t2)
    {

        return t1 + t2;

    }
    static void test1()
    {
        System.out.println("Hello");

    }

public static void main(String[] args)
{

     String S1 = new String("TEST");
     System.out.println(S1);

     Auto031_New_operator newobj = new Auto031_New_operator(60);
     System.out.println(newobj.j);

    //Auto031_New_operator tn = new Auto031_New_operator();
    int result = newobj.test(45, 56);
    System.out.println(result);

    test1();

}


}
