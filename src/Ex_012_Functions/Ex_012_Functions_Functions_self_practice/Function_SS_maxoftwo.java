package Ex_012_Functions.Ex_012_Functions_Functions_self_practice;

public class Function_SS_maxoftwo
{
    public static void main(String[] args) {
        //find max of two number

//       int max_m =  Math.max(5,15); //in build function
//        System.out.println(max_m);

        //calling of user defined function
        int max_two = max_T(55,15);
        System.out.println(max_two);
    }

    static int max_T (int a, int b)
    {
        if(a > b)
        {
            return a;
        }else
        return b;
    }
}
