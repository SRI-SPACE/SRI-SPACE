import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double finalAmount;
        if (purchaseAmount < 500) {
            finalAmount = purchaseAmount;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            finalAmount = purchaseAmount * 0.9; 
        } else {
            finalAmount = purchaseAmount * 0.8; 
        }

        System.out.println("The final payable amount is: " + finalAmount);
        scanner.close();
    }
}

