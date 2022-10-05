package EmployeeWageComputationProblem.UC_1;

public class EmployeeisPresentorAbsent {
    public static void main(String[] args) {
        //Declaring the varibles.
        double isPresent = 1;
        double randomCheck = (double) Math.floor((Math.random() * 10) % 2);

        //Checking if the Employee is present!!!
        if (randomCheck == isPresent) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}

