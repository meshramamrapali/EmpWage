package EmployeeWage;

public class EmpWage {
    public static final int IS_PART_TIME =1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int EmpRatePerHours;
    private final int numberOfWorkingDays;
    private final int maxHourPerMonth;
    private int totalEmpWage;

    public EmpWage(String company, int empRatePerHours, int numberOfWorkingDays, int maxHourPerMonth, int totalEmpWage){
        this.company = company;
        this.EmpRatePerHours = empRatePerHours;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;

    }

    public void computeEmpWage(){
        int empHour =0, totalEmpHour = 0, totalWorkingDays = 0; // variables

        while (totalEmpHour <= maxHourPerMonth && totalWorkingDays < numberOfWorkingDays ){

            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck){
                case IS_FULL_TIME  :
                    empHour = 8;
                    break;
                case IS_PART_TIME:
                    empHour = 4;
                    break;
                default:
                    empHour = 0;

            }

            totalEmpHour += empHour;

            System.out.println("day#:" + totalWorkingDays+ "is:" + "enp hrs" + empHour);
        }
        totalEmpWage = totalEmpHour * EmpRatePerHours;
    }
    @Override
    public String toString(){
        return  " total employee wage for company :" + company + "is :" + totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWage Mahindra = new EmpWage("Mahindra",20,20,8,4);
        EmpWage Google = new EmpWage("Google",30,3,10,5);

        Mahindra.computeEmpWage();
        System.out.println(Mahindra);
        Google.computeEmpWage();
        System.out.println(Google);
    }
}
