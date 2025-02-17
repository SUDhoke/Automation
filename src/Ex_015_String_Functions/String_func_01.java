package Ex_015_String_Functions;

import java.util.Scanner;

public class String_func_01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        //1.length function - returns the length of the string
        System.out.println("Length function : ");
        System.out.println(str.length()+"\n");

        //2.charAt(index)- return a character at specified index
        System.out.println("CharAt function : ");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4)+"\n");

        //3.concat("string") - concatenates two strings
        System.out.println("concat function : ");
        System.out.println(str.concat(" Uttam"));
        System.out.println(str.concat(" Dhoke")+"\n");

        //4. contains - checks string contains another string
        System.out.println("contains function : ");
        System.out.println(str.contains("ho")+"\n");

        //5.equals - checks if two strings are equal
        System.out.println("equals function : ");
        System.out.println(str.equals("sonali")+"\n");

        //6.equalsIgnoreCase - check two strings but case-insensitive
        System.out.println("equalsIgnoreCase function : ");
        System.out.println(str.equalsIgnoreCase("SONALI")+"\n");

        //7.indexOf(ch) - returns the first occurrence of a character
        System.out.println("indexOf(ch) function : ");
        System.out.println(str.indexOf('i'));
        String s1 = "Aditya";
        System.out.println(s1.indexOf('d')+"\n");

        //8.replace ('ch(old character)' ,'a(new character)') - replace characters ch is character who is replaced with a
        System.out.println("replace function : ");
        System.out.println(str.replace('s','m')+"\n");

        //9.replaceAll() - replace all occurrence
        System.out.println("ReplaceAll function : ");
        System.out.println(str.replaceAll("s","m")+"\n");

        //10.split("delimeter") - split string into an array
        System.out.println("split function : ");
        String split = "sonali@com";
        String[] split1 = split.split("@");
        System.out.println(split1[1]+"\n");

        //11. substring(start,end) - Extract a part of the string
        System.out.println("substring function : ");
        String s = "aditya";
        System.out.println(s.substring(0,3)+"\n");

        //12.toLowerCase - convert to lower case
        System.out.println("toLowerCase functions : ");
        String lower  = "TEST";
        System.out.println(lower.toLowerCase()+"\n");

        //13.toUpperCase - convert to Upper case
        System.out.println("toUpperCase functions : ");
        String upper = "dhoke";
        System.out.println(upper.toUpperCase()+"\n");

        //14.startsWith("H") - Check if strings starts with a substring
        System.out.println("starts with Function : ");
        System.out.println(str.startsWith("so")+"\n");

        //15. endWith("H") - checks if strings ends with a substrings
        System.out.println("end with function : ");
        System.out.println(str.endsWith("ke")+"\n");

        //16. trim() - Removes the leading and trailing spaces
        String t = "     test  java    ";
        System.out.println("trim function : ");
        System.out.println(t.trim()+"\n");

        //17. compareTo(str) - compares string lexicographically
        System.out.println("compareTo Function : ");
        String s3 = "Sonali";
        System.out.println(s3.compareTo("test")+"\n");

        //18 . compareToIgnoreCase -
        System.out.println("compareToIgnoreCase Function : ");
        System.out.println(str.compareToIgnoreCase("sonaliii")+"\n");

        //19.lastIndexOf(ch) - check last occurence of the character
        System.out.println("lastIndexOf Function : ");
        System.out.println(str.lastIndexOf('i')+"\n");

        //20.string conversion function
        // valueOf(int) - converts a number to a string
        System.out.println("valueOf function : ");
        int number = 123;
        String str1 = String.valueOf(number);
        System.out.println(str1+"\n");

        //21.toCharArray() - converts a string to char array
        System.out.println("toCharArray() functions : ");

        String str2 = "test";
        char[] ch = str2.toCharArray();
        System.out.println(ch);

    }
}
