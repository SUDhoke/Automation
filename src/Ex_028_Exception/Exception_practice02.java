package Ex_028_Exception;

public class Exception_practice02
{
    public static void main(String[] args) {
        Integer [] array1 = null;
        calculator cal1 = new calculator();
        System.out.println("case1 : null array");
        cal1.calculate_sum(array1);

        Integer [] array2 = {};
        calculator cal2 = new calculator();
        System.out.println("case 2 : Empty Array");
        cal2.calculate_sum(array2);

        Integer [] array3 = {10,20,30};
        calculator cal3 = new calculator();
        System.out.println("Case 3 : sum of the elements");
        cal3.calculate_sum(array3);
    }
}
class calculator
{
    Integer sum;
    public void calculate_sum(Integer[] array)
{
   try{
       //custom exception
       if (array.length == 0) {
           throw new new_custom("Empty Array to calculate sum array must contain some elements");
       }
        for(int i =0; i<(array.length);i++)
        {
            sum = sum + array[i];
        }
    } catch (NullPointerException | new_custom e) {
        System.out.println(e.getMessage());
    }
    System.out.println(sum);
}
}
//class for ex for custom exception
class new_custom extends Exception{
     new_custom(String m)
     {
         super(m);
     }
}