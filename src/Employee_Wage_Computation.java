public class Employee_Wage_Computation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int Is_Full_Time=1;
        double empcheck =Math.floor(Math.random()*10)%2;
        if(Is_Full_Time == empcheck)
        {
            System.out.println(" Employee is present");
        }
        else
        {
            System.out.println(" Employer is absent");
        }
    }
}
