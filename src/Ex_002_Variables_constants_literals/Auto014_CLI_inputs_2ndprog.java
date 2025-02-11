package Ex_002_Variables_constants_literals;

public class Auto014_CLI_inputs_2ndprog
{

    public static void main(String[] args) {

        String S1 = args[0];
        String S2 = args[1];

        int A = Integer.parseInt(args[2]);
        float f = Float.parseFloat(args[3]);
        double d = Double.parseDouble(args[4]);
        boolean b1 = Boolean.parseBoolean(args[5]);

        System.out.println("Name : " +S1);
        System.out.println("Last_name :"+S2);
        System.out.println("Age :" +A);
        System.out.println("Marks: "+f);
        System.out.println("Family  monthly Income :  "+d);
        System.out.println("old student :"+b1);

    }
}
