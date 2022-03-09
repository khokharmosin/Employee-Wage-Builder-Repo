package com.infogalaxy.institute;
import java.util.Random;
public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Display Massage Welcome Employee Wage program
        System.out.println("Welcome To Employee Wage Computation Progarm..");
        //UC-3 Checking Employee Part Time or Full Time
        final int PART_TIME_HR = 4;
        final int FULL_TIME_HR = 8;
        //UC-2 Calculate Daily Wage
        final int WAGE_PER_HR = 20;
        Random random = new Random();
        //UC-5 Calculating Wages For A Month
        for(int i = 1;i <= 20;i++) {
            int total_Wage = 0;
            System.out.println("Days="+i);
            int empAttendance = random.nextInt() % 2;
            //UC-1 Employee Attendance
            System.out.println(empAttendance);
            if (empAttendance == 0) {
                System.out.println("Employee is Absent.");
            } else {
                System.out.println("Employee is Present.");
                int emptype = random.nextInt() % 2;
                System.out.println(emptype);
                //UC-4 Using Switch case Statement
                switch (emptype) {
                    case 0:
                        System.out.println("Employee Is part Time.");
                        total_Wage = PART_TIME_HR * WAGE_PER_HR;
                        break;
                    case 1:
                    case -1:
                        System.out.println("Employee Is Full Time.");
                        total_Wage = FULL_TIME_HR * WAGE_PER_HR;
                        break;
                }
            }
            System.out.println("Employee Total Wage=" + total_Wage);
        }
    }

}
