public class Question1 {

    public static void main(String[] args) {
        
        calculateMoney(20, 40, 14, 8, 60);

    }

    /**
     * Takes in the information of a worker and returns the gross earnings, net earnings, 
     * deductions, and the range between no overtime and maximum overtime.
     * 
     * @param wage : double     The hourly wage for the worker
     * @param weekly_hours : int    The number of hours worked per week
     * @param days_vacation : int   The number of vacation days
     * @param sick_days : int   The number of sick days
     * @param overtime_hours : int  The number of available overtime hours
     */
    static void calculateMoney(double wage, int weekly_hours, int days_vacation, int sick_days, int overtime_hours) {

        final int WORKING_DAYS = 261;
        final int STAT_HOLIDAY = 10;
        final double DEDUCTIONS = 23.5 / 100;
        final int STANDARD_WORKDAY = 8;

        int working_hours = (WORKING_DAYS / 5) * weekly_hours;
        int paid_time_off = (STAT_HOLIDAY + days_vacation + sick_days) * STANDARD_WORKDAY;

        double gross_overtime = overtime_hours * (wage * 1.5);

        double gross_earnings_noOvertime = (wage * working_hours) + (wage * paid_time_off);
        double gross_earnings_maxOvertime = gross_earnings_noOvertime + gross_overtime;

        double deductions_noOvertime = gross_earnings_noOvertime * DEDUCTIONS;
        double deductions_maxOvertime = (gross_earnings_noOvertime + gross_overtime) * DEDUCTIONS;

        double net_earnings_noOvertime = gross_earnings_noOvertime - deductions_noOvertime;
        double net_earnings_maxOvertime = gross_earnings_maxOvertime - deductions_maxOvertime;

        System.out.println("------------------------------------------------------------");
        System.out.printf("Gross Earnings - No Overtime: $%.2f \n", gross_earnings_noOvertime);
        System.out.printf("Gross Earnings - Max Overtime $%.2f \n", gross_earnings_maxOvertime);
        System.out.printf("Total Overtime Paid: $%.2f \n", gross_overtime);
        System.out.printf("Deductions - No Overtime: $%.2f \n", deductions_noOvertime);
        System.out.printf("Deductions - Max Overtime: $%.2f \n", deductions_maxOvertime);
        System.out.printf("Net Earnings - No Overtime: $%.2f \n", net_earnings_noOvertime);
        System.out.printf("Net Earnings - Max Overtime: $%.2f \n", net_earnings_maxOvertime);
        System.out.println("------------------------------------------------------------");
    }
}