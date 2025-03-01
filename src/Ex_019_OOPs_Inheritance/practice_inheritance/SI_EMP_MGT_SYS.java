package Ex_019_OOPs_Inheritance.practice_inheritance;

public class SI_EMP_MGT_SYS
{
    public static void main(String[] args) {

        emp e = new emp("AUD",20,"F",520,"QA",25698);;
        e.display_E();
       // e.display();
        System.out.println("---------------------");
        person p = new person("monali",26,"Female");
        p.display();

//        System.out.println("------Dynamic Dispatch----------------");//with parent reference we can create the object of subclass
//        person p_ref = new emp(562,"En",5600);
//        p_ref.display();

    }
}
class person {

    //attributes
    public String name;
    public int age;
    public String gender;

    //constructor
    person(String n, int a, String g)
    {
        this.name = n;
        this.age = a;
        this.gender = g;
    }
    //method to display person details
    void display()
    {
        System.out.println("person details : "+ "\n"+"name :"+this.name + "\n" + "age :" +this.age+ "\n" +"gender :"+this.gender);
    }
}
class emp extends person {
    //Attributes
    int Emp_id;
    String designation;
    long sal;

    //constructor
    emp(String n,int a,String g,int id,String des,long sl)
    {
        super(n,a,g);
        this.Emp_id = id;
        this.designation = des;
        this.sal = sl;
    }

    void display_E()
    {
        /// display();
        super.display();
        System.out.println("-----------------------");
        System.out.println("Employee Details : "+Emp_id+"\n"+designation+"\n" +sal);
    }

}