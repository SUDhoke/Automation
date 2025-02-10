package Operator;

public class Auto030_new_operator {

    int i;
    public Auto030_new_operator(int i)
    {
        this.i = i;
    }

//        Example two

    String S2;

    //Constructor - used to initialize objects when they are created
    public Auto030_new_operator(String S2)
    {
        this.S2 = S2;

    }


    public static void main(String[] args) {

        // first example
        //creating new object of string type and printing that

        String s1 = new String(" Test ");
        System.out.println(s1);

//        Second example object creation - class object

        Auto030_new_operator N1 = new Auto030_new_operator("SUD");
        System.out.println(N1.S2);

        // create the object of class by using new operator

        Auto030_new_operator N2 = new Auto030_new_operator(20);
        System.out.println(N2.i);



    }
}
