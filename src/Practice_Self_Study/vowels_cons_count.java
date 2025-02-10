package Practice_Self_Study;

import java.util.Scanner;

public class vowels_cons_count
{
    public static void main(String[] args) {
        //step1- count of v and c in a string
        // input -> String -> name
        //output -> v -> count and c count (2 var int type)

        Scanner sc= new Scanner(System.in);// user input -> scanner class
        System.out.println("Enter a name(string)");//print
        String str = sc.next();//store value in str variable
        int l = str.length();
        System.out.println(l);

        int v = 0 ;
        int c = 0; // variables  for v and c count

        str= str.toLowerCase();

       for(int i =0 ; i<l; i++)
       {
           char ch = str.charAt(i);// it will take a character from a string and store in the ch variable

           if(ch == 'a'||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           {
               v++;
           }else {
               c++;
           }

       }

        System.out.println("vowels :"+v);
        System.out.println("Consonant :"+c);
        sc.close();
    }
}
