package Ex_023_Encapsulation;

public class ICICIBank
{
   private String user;
   private long bal;
   public String bank_name = "ICICI";

   //constructor
    ICICIBank(String usr , long b)
    {
        this.user = usr;
        this.bal = b;
    }
    void dis()
    {
        System.out.println("Bank details of a user = "+"\n"+"Name of a person : "+this.user +"\n"+"Balance of a person : "+this.bal+"\n"+"Bank name : "+bank_name);
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCah)
    {
        if(isCah==true)
        {
            this.bal = bal;
        }else {
            System.out.println("balance can not be changed - not a authorized person ");
            return;
        }

    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

class main
{
    public static void main(String[] args) {

        ICICIBank I = new ICICIBank("Sonali_Dhoke",15l);
        I.dis();

        System.out.println("----------------------------");
        System.out.println(I.getUser());
        I.setUser("Sonali_Uttamrao_Dhoke");
        System.out.println("Username Changed to full name :"+I.getUser());
        System.out.println("------------------------------");
        System.out.println(I.getBal());
        I.setBal(150,false);
        System.out.println("Balance changed to : "+I.getBal());
    }
}