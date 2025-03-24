package Ex_015_String_Functions;

import java.util.Scanner;

public class String_func_01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        java.lang.String name = "monal";
        //1.length function - returns the length of the string
        System.out.println("Length function : ");
        System.out.println(str.length()+"\n");
        System.out.println(name.length());

        //2.charAt(index)- return a character at specified index
        System.out.println("CharAt function : ");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4)+"\n");
        System.out.println(name.charAt(0));

        //3.concat("string") - concatenates two strings
        System.out.println("concat function : ");
        System.out.println(str.concat(" Uttam"));
        System.out.println(str.concat(" Dhoke")+"\n");
        System.out.println(name.concat(str));

        //4. contains - checks string contains another string
        System.out.println("contains function : ");
        System.out.println(str.contains("ho")+"\n");
        System.out.println(name.contains("mo"));

        //5.equals - checks if two strings are equal
        System.out.println("equals function : ");
        System.out.println(str.equals("sonali")+"\n");
        System.out.println(name.equals(str));

        //6.equalsIgnoreCase - check two strings but case-insensitive
        System.out.println("equalsIgnoreCase function : ");
        System.out.println(str.equalsIgnoreCase("SONALI")+"\n");
        System.out.println(name.equalsIgnoreCase(str));

        //7.indexOf(ch) - returns the first occurrence of a character
        System.out.println("indexOf(ch) function : ");
        System.out.println(str.indexOf('i'));
        String s1 = "Aditya";
        System.out.println(s1.indexOf('d')+"\n");
        System.out.println(name.indexOf('o'));
        System.out.println(name.indexOf('0',2));

        //8.replace ('ch(old character)' ,'a(new character)') - replace characters ch is character who is replaced with a
        System.out.println("replace function : ");
        System.out.println(str.replace('s','m')+"\n");
        System.out.println(name.replace('m','s'));

        //9.replaceAll() - replace all occurrence
        System.out.println("ReplaceAll function : ");
        System.out.println(str.replaceAll("s","m")+"\n");
        System.out.println(name.replaceAll("m","s"));

        //10.split("delimeter") - split string into an array
        System.out.println("split function : ");
        String split = "sonali@com";
        String[] split1 = split.split("@");
        System.out.println(split1[1]+"\n");

        String split01 = "monal@com";
        String [] arr = split.split("com");


        //11. substring(start,end) - Extract a part of the string
        System.out.println("substring function : ");
        String s = "aditya";
        System.out.println(s.substring(0,3)+"\n");
        System.out.println(name.substring('o'));
        System.out.println(name.substring(0,4));



        //12.toLowerCase - convert to lower case
        System.out.println("toLowerCase functions : ");
        String lower  = "TEST";
        System.out.println(lower.toLowerCase()+"\n");
        System.out.println(name.toLowerCase());

        //13.toUpperCase - convert to Upper case
        System.out.println("toUpperCase functions : ");
        String upper = "dhoke";
        System.out.println(upper.toUpperCase()+"\n");
        System.out.println(name.toUpperCase());

        //14.startsWith("H") - Check if strings starts with a substring
        System.out.println("starts with Function : ");
        System.out.println(str.startsWith("so")+"\n");
        System.out.println(name.startsWith("mo"));

        //15. endWith("H") - checks if strings ends with a substrings
        System.out.println("end with function : ");
        System.out.println(str.endsWith("ke")+"\n");
        System.out.println(name.endsWith("al"));

        //16. trim() - Removes the leading and trailing spaces
        String t = "     test  java    ";
        System.out.println("trim function : ");
        System.out.println(t.trim()+"\n");

        String name1 = "   name ";
        System.out.println(name1.trim());

        //17. compareTo(str) - compares string lexicographically
        System.out.println("compareTo Function : ");
        String s3 = "Sonali";
        System.out.println(s3.compareTo("test")+"\n");
        System.out.println(name.compareTo(str));

        //18 . compareToIgnoreCase -
        System.out.println("compareToIgnoreCase Function : ");
        System.out.println(str.compareToIgnoreCase("sonaliii")+"\n");
        System.out.println(name.compareToIgnoreCase(str));

        //19.lastIndexOf(ch) - check last occurence of the character
        System.out.println("lastIndexOf Function : ");
        System.out.println(str.lastIndexOf('i')+"\n");
        System.out.println(name.lastIndexOf('o'));

        //20.string conversion function
        // valueOf(int) - converts a number to a string
        System.out.println("valueOf function : ");
        int number = 123;
        String str1 = String.valueOf(number);
        System.out.println(str1+"\n");

        int num = 111;
        String stest = String.valueOf(num);
        System.out.println(stest);

        //21.toCharArray() - converts a string to char array
        System.out.println("toCharArray() functions : ");

        String str2 = "test";
        char[] ch = str2.toCharArray();
        System.out.println(ch);

    }
}
