 import java.util.Scanner;

public class WeekdayPrinter {
    public static void main(String[] args) {
        
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day position (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");

        try {
           
            int dayIndex = scanner.nextInt();

            
            System.out.println("The day is: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Error: Invalid day position. Please enter a number between 0 and 6.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } finally {
            scanner.close(); 
        }
    }
}