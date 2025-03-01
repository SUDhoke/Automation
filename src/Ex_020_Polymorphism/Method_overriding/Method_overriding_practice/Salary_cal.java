package Ex_020_Polymorphism.Method_overriding.Method_overriding_practice;

import Task.Task_31st_Jan.Empployee_net_salary;

public class Salary_cal {
    public static void main(String[] args) {
        Emp em = new fulltime();
        System.out.println("Filltime Salary : " + em.cal_sal(62355.25F));
        Emp em1 = new part(25,5);
        System.out.println("part salary :"+em1.cal_sal(52));
    }
}
//superclass
class Emp
{
    float cal_sal(float basesal)
    {
        return basesal;
    }

}
class fulltime extends Emp
{
    @Override
    float cal_sal(float full_sal) {

        return full_sal;
    }
}
class part extends Emp
{
    float sal;
    float hours;

    part(float sal_part,float hours)
    {
        this.sal = sal_part;
        this.hours = hours;
    }
    @Override
    float cal_sal(float sal_part) {

        return sal_part * this.hours;
    }
}

