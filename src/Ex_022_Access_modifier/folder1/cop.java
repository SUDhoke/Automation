package Ex_022_Access_modifier.folder1;

public class cop
{
    public int gun;
    String i_card;

    //constructor
    public cop(int g)
    {
       this.gun = g;
    }

   protected void can_I_shoot(){ // protected -  can be accessible within the package not outside the package
        System.out.println("yes you can shoot");
    }
}
