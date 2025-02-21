package Ex_016_Array;

public class Array_2D
{
    public static void main(String[] args) {

        int[][] a1 = {{1,2,3},{5,6,7}};
        float[][] f1 = {{1.1F,1.2F,1.3F},{2.1F,2.2F,2.3F}};

        int[][] a2 = new int[2][2];

        a2[0][0] = 123;
        a2[0][1] = 222;
        a2[1][0]= 125;
        a2[1][1]= 127;
        System.out.println(a2[1][1]);
    }
}
