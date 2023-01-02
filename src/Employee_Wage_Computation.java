public class Employee_Wage_Computation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int Is_Full_Time=1;
        int wage_per_hour=20;
        int fullday=8;
        double empcheck =Math.floor(Math.random()*10)%2;
        if(Is_Full_Time == empcheck)
        {
            System.out.println(" Employee is present");
            System.out.print(" Daily wage of employee is: " + wage_per_hour * fullday + "Rs");
        }
        else
        {
            System.out.println(" Employer is absent");
            System.out.print(" Daily wage of employee is: 0 Rs");
        }
    }
}
