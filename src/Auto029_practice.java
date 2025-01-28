public class Auto029_practice
{
    public static void main(String[] args) {
         int b_sal = 12;
         boolean b = !(b_sal > 15 || b_sal > 10);
        System.out.println(b);

        boolean b1 = !(b_sal < 10 && b_sal < 15);
        System.out.println(b1);
    }
}
