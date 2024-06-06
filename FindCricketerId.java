import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CricketerScoreFinder {
    
    public static void findCricketerId(int[] array, int size, int score) {
        if (size < 0) {
            System.out.println("Invalid array size");
            return;
        }
        
        for (int value : array) {
            if (value < 0) {
                System.out.println("Invalid input");
                return;
            }
        }
        
        if (score < 0) {
            System.out.println("Invalid score");
            return;
        }
        
        List<Integer> cricketerIds = new ArrayList<>();
        
        // Iterate through the array and check the scores
        for (int i = 1; i < size; i += 2) {
            if (array[i] > score) {
                cricketerIds.add(array[i - 1]);
            }
        }
        
        // Print the cricketer IDs who scored more than the given score
        for (int id : cricketerIds) {
            System.out.println(id);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Invalid array size");
            scanner.close();
            return;
        }
        
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                System.out.println("Invalid input");
                scanner.close();
                return;
            }
        }
        
        int score = scanner.nextInt();
        if (score < 0) {
            System.out.println("Invalid score");
            scanner.close();
            return;
        }
        
        findCricketerId(array, size, score);
        
        scanner.close();
    }
}
