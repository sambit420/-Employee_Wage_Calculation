package EmployeeWageComputationProblem.UC_4;

import java.util.Random;

public class SolvingUsingSwitchCaseStatement {
    public static void main(String[] args) {
        //Declaring the variables.
        Random random = new Random();
        int randomCheck = random.nextInt(3);
        int empHour;
        int wagePerHour = 20;
         int salary;

        //Checking for part-time and full time by Switch case.
        switch (randomCheck) {
            case 0:
                System.out.println("Employee is absent");
                empHour = 0;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $" + salary);
                break;
            case 1:
                System.out.println("Employee is working part-time");
                int partTimeHour = 8;
                empHour = partTimeHour;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $" + salary);
                break;
            case 2:
                System.out.println("Employee is working full-time");
                int fullTimeHour = 16;
                empHour = fullTimeHour;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $" + salary);
                break;
        }
    }
}

