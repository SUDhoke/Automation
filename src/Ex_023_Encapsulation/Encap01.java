package Ex_023_Encapsulation;

public class Encap01
{
    public static void main(String[] args)
    {
        VWOLogin v1 = new VWOLogin("sonali","5268a");
        v1.display();

        System.out.println(".................................");
        System.out.println("After changing the username and password");
        v1.password = "anyone can change the password - 123456";
        v1.username = "anyone can change the username - new sonali";
        System.out.println(v1.username);
        System.out.println(v1.password);

        System.out.println("...................................");
        System.out.println("Using encapsulation concepts");
        EncapVWO V2 = new EncapVWO("admin","pass123");
        System.out.println(V2.getUser());
        V2.setUser("Sonali_changed_username", true);
        System.out.println(V2.getUser());
        System.out.println("................password .............");
        System.out.println(V2.getPass());
        boolean isAdmin = true;
        V2.setPass("New_pass",true);
        System.out.println("password changed to: "+V2.getPass());

    }
}
class VWOLogin
{
    public String username;
    public String password;

    //constructor
    VWOLogin(String user, String pass)
    {
        this.username = user;
        this.password = pass;
    }
    void display()
    {
        System.out.println("username : "+this.username + "\n"+"Password : "+this.password);
    }
}

class EncapVWO
{
    private String username;
    private String password;

    EncapVWO(String user, String pass)
    {
        this.username = user;
        this.password = pass;
    }

    public String getUser() {
        return username;
    }

    public boolean setUser(String username, boolean b) {
        this.username = username;

        return false;
    }

    public String getPass() {
        return password;
    }

    public void setPass(String password,boolean isAdmin)
    {

    if(isAdmin)
    {
        this.password = password;
    }else
    {
        System.out.println("not allowed to change the password ");
    }
    }

}
