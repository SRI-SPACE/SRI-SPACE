
        import java.util.Scanner;

class products {
    int pid;
    double price;
    int quantity;

    products(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        products[] products = new products[5];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Enter pid, price, quantity for product " + (i + 1) + ": ");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new products(pid, price, quantity);
        }

        int highestPricePid = findHighestPricePid(products);
        System.out.println("Product with highest price has PID: " + highestPricePid);

        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

    static int findHighestPricePid(products[] products) {
        double maxPrice = 0;
        int pid = -1;
        for (products p : products) {
            if (p.price > maxPrice) {
                maxPrice = p.price;
                pid = p.pid;
            }
        }
        return pid;
    }

    static double calculateTotalAmount(products[] products) {
        double total = 0;
        for (products p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }
}