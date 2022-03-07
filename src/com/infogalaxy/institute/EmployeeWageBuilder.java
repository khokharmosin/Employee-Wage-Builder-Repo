package com.infogalaxy.institute;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Display Massage Welcome Employee Wage program
        System.out.println("Welcome To Employee Wage Computation Progarm..");
        Random random = new Random();
        int empAttendance = random.nextInt()%2;
        //UC-1 Employee Attendance
        System.out.println(empAttendance);
        if(empAttendance == 0){
            System.out.println("Employee is Absent.");
        }else{
            System.out.println("Employee is Present.");
        }
    }
}
