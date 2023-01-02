import java.util.Random;
public class Employee_Wage_Computation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int wage_per_hour = 20;
        int fullday = 8;
        int halfday = 4;
        int overhead = 3;
        int working_days = 20;
        Random sc = new Random();
        int empcheck = sc.nextInt(overhead);

        switch (empcheck) {
            case 1 -> {
                System.out.println(" Employee is present");
                System.out.print(" Daily wage of employee is: " + wage_per_hour * fullday * working_days + "Rs");
            }
            case 2 -> {
                System.out.println(" Employee is present but has worked half day");
                System.out.print(" Daily wage of employee is: " + wage_per_hour * halfday * working_days + "Rs");
            }
            default -> {
                System.out.println(" Employer is absent");
                System.out.print(" Daily wage of employee is: 0 Rs");
            }
        }
    }
}


