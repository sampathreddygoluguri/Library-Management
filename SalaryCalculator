import java.util.Scanner;

public class SalaryCalculator {
    
    public static int calculateSal(int salary, int shifts) {
        if (salary > 8000) {
            System.out.println("Salary too large");
            return -1;
        } else if (salary < 0) {
            System.out.println("Salary too small");
            return -1;
        } else if (shifts < 0) {
            System.out.println("Shifts too small");
            return -1;
        }
        
        // Calculate the expenditures
        double foodExpenditure = salary * 0.2;
        double travelExpenditure = salary * 0.3;
        
        // Calculate the additional income from shifts
        double additionalIncome = salary * 0.02 * shifts;
        
        // Calculate the saving
        double saving = salary - (foodExpenditure + travelExpenditure) + additionalIncome;
        
        return (int) saving; // Cast to int for final output
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int salary = scanner.nextInt();
        int shifts = scanner.nextInt();
        
        int saving = calculateSal(salary, shifts);
        
        // Print the saving if valid
        if (saving != -1) {
            System.out.println(saving);
        }
        
        scanner.close();
    }
}
