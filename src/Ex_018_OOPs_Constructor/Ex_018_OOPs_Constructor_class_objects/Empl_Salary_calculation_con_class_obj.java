package Ex_018_OOPs_Constructor.Ex_018_OOPs_Constructor_class_objects;

public class Empl_Salary_calculation_con_class_obj {
    public static void main(String[] args) {


        Employee E1 = new Employee("Sonali_Dhoke", "QA Engineer", 100);

        E1.cal_sal();
        E1.display();
    }
}
class Employee
{
    String Emp_name;
    String Emp_D;
    double B_salary;


    //Constructor
    Employee(String name,String des, double sal)
    {
        System.out.println("Constructor : ");
        this.Emp_name = name;
        this.Emp_D = des;
        this.B_salary = sal;
    }
    //method to calculate total salary
    double cal_sal()
    {
       double bonus = (10*B_salary)/100;
       double total_sal = bonus + B_salary;
        return total_sal;
    }

    // method to display
    public void display()
    {
        System.out.println("Employee Details : ");
        System.out.println("Employee Name : "+Emp_name);
        System.out.println("Employee Designation : "+Emp_D);
        System.out.println("Basic Employee Salary : "+B_salary);
        System.out.println("Total Salary : "+cal_sal());
    }

//    void calculate_salary()
//    {
//        bonus = ((10/B_salary)*100);
//        double total_salary = B_salary + bonus;
//        System.out.println("Employee Details : "+Emp_name+"\n"+Emp_D+ "\n"+B_salary+"\n"+"Total_salary :"+total_salary);
//    }
}
