public class Payroll {
    public static void main(String[] args) {
        int[] empID = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };
        double[] wageRate = { 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 19.00, 20.00 };
        // next print the employee ID and the wage rate for each employee
        for (int i = 0; i < empID.length; i++) {
            System.out.println("Employee ID: " + empID[i] + " Wage Rate: " + wageRate[i]);
        }
    }
    
}
