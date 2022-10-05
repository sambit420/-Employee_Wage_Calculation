//This program is to calculate wages for a month of an Employee.

package EmployeeWageComputationProblem.UC_5;

import java.util.Random;

public class CalculatingWagesForMonth {
    public static void main(String[] args) {
        //Declaring the variables.
        Random random = new Random();
        int randomCheck;
        int empHour;
        int wagePerHour = 20;
        int salary = 0;
        int numWorkingDays = 20;
        int monthlySalary = 0;

        //Calculating the number of working days of an Employee randomly.
        for (int i=1; i <= numWorkingDays; i++)
        {
            randomCheck = random.nextInt(3);
            switch (randomCheck) {
                case 0 :
                    System.out.println("Employee is absent");
                    empHour=0;
                    salary = empHour * wagePerHour;
                    break;
                case 1 :
                    System.out.println("Employee is working part-time");
                    int partTimeHour = 8;
                    empHour = partTimeHour;
                    salary = empHour * wagePerHour;
                    break;
                case 2 :
                    System.out.println("Employee is working full-time");
                    int fullTimeHour = 16;
                    empHour = fullTimeHour;
                    salary = empHour * wagePerHour;
                    break;
            }
            monthlySalary = monthlySalary + salary;
        }
        System.out.println("Salary of an Employee in a month is: $"+monthlySalary);


    }
}