//This program is to calculate wages for a month of an Employee until a condition of total
// working hours or days is reached for a month.
package EmployeeWageComputationProblem.UC_6;

import java.util.Random;

public class CalculateWagesTillAConditionOfTotalWorkingHoursOrDaysIsReachedForAMonth {
    public static void main(String[] args) {
        //Declaring the variables.
        Random random = new Random();
        int randomCheck;
        int empHour = 0;
        int wagePerHour = 20;
        int salary = 0;
        int numWorkingDays = 20;
        int monthlySalary = 0;
        int maxHours = 100;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        /*Calculating the number of working days of an Employee randomly unless it satisfies the condition
          of total working hours or days is reached for a month.*/
        while (totalWorkingDays < numWorkingDays && totalWorkingHours < maxHours)
        {
            totalWorkingDays++;
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
            monthlySalary += salary;
            totalWorkingHours += empHour;
        }
        System.out.println();
        System.out.println("Total working days of an Employee is: "+totalWorkingDays+"\n");
        System.out.println("Total working hour of an Employee is: "+totalWorkingHours+"\n");
        System.out.println("Salary of an Employee in a month is: $"+monthlySalary);
    }
}
