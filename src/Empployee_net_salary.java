import java.util.Scanner;

public class Empployee_net_salary
{
    public static void main(String[] args) {

        //Basic pay is the fixed portion of the emp salary
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Basic Pay of an employee");
        float BP = sc.nextFloat();

        //house rent allowance - percentage of basic pay - consider 10%
        float HRA = (10*BP)/100;
        System.out.println("House rent allowance of an employee : "+HRA);

        //dearness allowance (DA) - A percentage of asic pay to offset inflation - 5 %
        float DA = (2*BP)/100;
        System.out.println("DA :"+DA);

        //Gross salary calculation

        float Gross_salary = BP + HRA + DA ;
        System.out.println("Gross salary : "+Gross_salary);

        double income_tax = 0.00;

        //calculate deductions

        // calculate Income tax
        if (Gross_salary < 300000)
        {
            System.out.println("nil : no Income_tax ");
        }else if(Gross_salary >=300000 && Gross_salary <=600000)
        {
            income_tax = (5 * Gross_salary) / 100 ;
            System.out.println("Income tax : between 3 to 6 Lac: "+income_tax);
        }
        else if (Gross_salary > 600000 && Gross_salary <=900000)
        {
        income_tax = (10 * Gross_salary) / 100;
            System.out.println("Income tax : above 6 and upto 9 lac : "+income_tax);
        } else if (Gross_salary > 900000 && Gross_salary <=1200000)
        {
         income_tax = (15 * Gross_salary) / 100;
            System.out.println("income tax : above 9 and upto 12 lac : "+income_tax);
        }else
        {
            income_tax = (15 * Gross_salary)  / 100;
            System.out.println("Income tax above 12 lac :" + income_tax);
        }

        //calculate PF
        float PF = (float)(0.5 *Gross_salary)  / 100;
        System.out.println("Provident Fund : "+PF);

        //Professional Tax

        int P_Tax = 200;
        System.out.println("Professional Tax : "+P_Tax);


        //Net salary calculation

        double Net_Salary = Gross_salary - income_tax - PF - P_Tax;
        System.out.println("Net pay :"+Net_Salary);

    }
}
