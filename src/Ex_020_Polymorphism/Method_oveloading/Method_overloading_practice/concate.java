package Ex_020_Polymorphism.Method_oveloading.Method_overloading_practice;

public class concate
{
    public static void main(String[] args) {

        StringManipulator m = new StringManipulator();
        System.out.println(m.concatenate("Sonali"," Dhoke"));
        System.out.println(m.concatenate("Hello"," World"," java"));
        System.out.println(m.concatenate("Sonali ",26));
    }
}
class StringManipulator
{
   public String concatenate(String s1, String s2)
   {
       return s1.concat(s2);
   }
   String concatenate(String s1,String s2,String s3)
   {
       return s1.concat(s2.concat(s3));
   }
   String concatenate(String s1, int i1)
   {
       return s1 + i1;
   }
}
