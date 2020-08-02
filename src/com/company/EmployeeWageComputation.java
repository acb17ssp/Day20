package com.company;

public class EmployeeWageComputation {

    // Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 5;
    public static final int NUMBER_OF_WORKING_HOURS = 10;

    /**
     * This is a void method used to calculate the salary of the employee
     */
    public static void computeWages(){

        // Variables
        int empHours = 0;
        int salary = 0;
        int totalWage = 0;
        int totalHrs = 0;
        int totalDays = 0;

        // loop condition to check if the total days are matching number of working days/hours and eventually calculate salary
        while (totalDays <= NUMBER_OF_WORKING_DAYS || totalHrs <= NUMBER_OF_WORKING_HOURS){

            totalDays++;
            // random numbers (0,1,2)
            int randomNum = (int)( Math.random() * 2 + 1);

            // selection statement
            if (randomNum == IS_FULL_TIME){
                System.out.println("Full time - Present");
                empHours = 8;
            }
            else if (randomNum == IS_PART_TIME){
                System.out.println("Part time - Present");
                empHours = 4;
            }
            else{
                System.out.println("Employee is Absent" + '\n');
            }

            // calculation of salary and hours
            totalHrs+=empHours;
            salary = EMP_RATE * empHours;
            System.out.println("Employee salary for a day: " + salary + '\n');
            totalWage+=salary;
        }
        System.out.println("Total salary: " + totalWage);
    }

    /**
     * The main method only calls the computeWages method declared above
     * @param args - main method
     */
    public static void main(String[] args) {
        System.out.println("Welcome Employee" + "\n");
        computeWages();
    }
}
