package Task.Task_05_Feb;

public class While_loop_printeven_1to20
{
    public static void main(String[] args) {
         int e_num = 1;
         while(e_num <=20)
         {
             if(e_num%2==0)
             {
                 System.out.println(e_num);
             }
             e_num++;
         }
    }
}
