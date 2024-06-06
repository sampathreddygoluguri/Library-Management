import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalaryRepeater {
    
    public static int countRepeaters(int[] salaries, int size) {
        if (size < 0) {
            System.out.println("Invalid Input");
            return -1;
        }
        
        for (int salary : salaries) {
            if (salary < 0) {
                System.out.println("Invalid Input");
                return -1;
            }
        }
        
        Map<Integer, Integer> salaryCountMap = new HashMap<>();
        
        // Count the frequency of each salary
        for (int salary : salaries) {
            salaryCountMap.put(salary, salaryCountMap.getOrDefault(salary, 0) + 1);
        }
        
        // Find the number of repeaters
        for (int count : salaryCountMap.values()) {
            if (count > 1) {
                return count;
            }
        }
        
        return 0; // No repeated salaries found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Invalid Input");
            scanner.close();
            return;
        }
        
        int[] salaries = new int[size];
        for (int i = 0; i < size; i++) {
            salaries[i] = scanner.nextInt();
            if (salaries[i] < 0) {
                System.out.println("Invalid Input");
                scanner.close();
                return;
            }
        }
        
        int repeaters = countRepeaters(salaries, size);
        
        // Print the number of repeaters if valid
        if (repeaters != -1) {
            System.out.println(repeaters);
        }
        
        scanner.close();
    }
}
