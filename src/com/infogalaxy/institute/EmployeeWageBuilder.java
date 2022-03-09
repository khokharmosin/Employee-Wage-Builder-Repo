package com.infogalaxy.institute;
import java.util.Random;
public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Display Massage Welcome Employee Wage program
        System.out.println("Welcome To Employee Wage Computation Progarm..");
        //UC-6 Calculate Wage Till 100hrs
        int working_day = 0;
        int working_hr = 0;
        Random random = new Random();
        while(working_hr <=Constants.TOTAL_WORKING_HR && working_day < Constants.WORKING_DAYS){
            int total_Wage = 0;
            working_day++;
            System.out.println("Days="+working_day);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent.");
            } else {
                System.out.println("Employee is Present.");
                int emptype = random.nextInt() % 2;
                if (emptype < 0){
                    emptype = -emptype;
                }
                switch (emptype) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee Is part Time.");
                        total_Wage = Constants.WAGE_PER_HR*Constants. PART_TIME_HR;
                        working_hr = working_hr + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee Is Full Time.");
                        total_Wage = Constants.WAGE_PER_HR * Constants.FULL_TIME_HR;
                        working_hr = working_hr + Constants.FULL_TIME_HR;
                        break;
                }
            }
            System.out.println("Employee Total Wage=" + total_Wage);
            System.out.println("Total Working Hrs=" + working_hr);
        }
    }

}
