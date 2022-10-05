package EmployeeWageComputationProblem.UC_3;

public class AddingPartTimeEmployeeAndHisWage {
    public static void main(String[] args) {
        //Declaring the variables.
        double isPartTime = 1;
        double isFullTime = 2;
        double randomCheck = (double) Math.floor((Math.random() * 10) % 3);
        int empHour;
        int wagePerHour = 20;
        int salary = 0;

        //Adding part-time Employee and his/her wage.
        if (randomCheck == isFullTime) {
            int fullTimeHour = 16;
            empHour = fullTimeHour;
            salary = empHour * wagePerHour;
            System.out.println("Salary is: $" + salary);
        } else if (randomCheck == isPartTime) {
            int partTimeHour = 8;
            empHour = partTimeHour;
            salary = empHour * wagePerHour;
            System.out.println("Salary is: $" + salary);
        } else {
            empHour = 0;
            System.out.println("Salary is: $" + salary);
        }
    }

}
