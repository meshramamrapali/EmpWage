package EmployeeWage;

public class EmpWage {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;

    public static int computeEmpWage(String company, int EmpRatePerHrs, int numberOfWorkingDays
            , int maxHrsPerMonth ){
        int EmpHrs = 0, TotalEmpHrs = 0, TotalWorkingDays = 0;

        while (TotalEmpHrs <= maxHrsPerMonth && TotalWorkingDays < numberOfWorkingDays){

            TotalWorkingDays++;

            int empCheck = (int)Math. floor(Math.random() * 10) % 2;
            switch (empCheck){
                case is_part_time:
                    EmpHrs = 4;
                    break;
                case is_full_time:
                    EmpHrs = 8;
                    break;
                default:
                    EmpHrs = 0;
            }
            TotalEmpHrs +=EmpHrs;
            System.out.println("day "+ TotalWorkingDays+ " employee hrs"+ EmpHrs);
        }
        int TotalEmpWage = TotalEmpHrs * EmpRatePerHrs;
        System.out.println("total employee wage for company :"+company+ " is :"+TotalEmpWage);
        return TotalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage("Mahindra",5,6,40);
        computeEmpWage("Google",10,5,50);
    }
}
