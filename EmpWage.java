package EmployeeWage;

public class EmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static int computeEmpWage() {
        int empHrs = 0;
        int total_working_days = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs < MAX_HRS_IN_MONTH &&
                total_working_days < NUM_OF_WORKING_DAYS){
            total_working_days++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs +=empHrs;
            System.out.println( total_working_days +" " + " Emp Hours :"+ empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("total emp wage" + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}
