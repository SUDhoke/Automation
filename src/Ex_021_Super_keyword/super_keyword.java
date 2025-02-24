package Ex_021_Super_keyword;

public class super_keyword
{
    public static void main(String[] args) {

        Mobile ph = new Mobile("OPPO", "2000");
        System.out.println(ph.model_name);
        System.out.println(ph.year_of_launch);

        ph.display();
        String m_name = ph.give_me_model_name();
        System.out.println(m_name);
    }
}
class Mobile {
    //attributes
    String model_name;
    String year_of_launch;

    //constructor
    Mobile(String m, String y) {
        this.model_name = m;
        this.year_of_launch = y;
    }

    //method
    void display() {
        System.out.println(this.model_name + " - " + this.year_of_launch);
    }

    //another method
    String give_me_model_name()
    {
        return this.model_name;
    }
}
