
    import java.util.Scanner;

public class DriverMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter Employee ID:");
        int empId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter Employee Name:");
        String empName = scanner.nextLine();
        System.out.println("Enter Employee Salary:");
        double empSalary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);
        double incomeTax = employee.calcTax();
        System.out.println("Employee Income Tax: " + incomeTax);

        // Product Input
        System.out.println("Enter Product ID:");
        int productId = scanner.nextInt();
        System.out.println("Enter Product Price:");
        double productPrice = scanner.nextDouble();
        System.out.println("Enter Product Quantity:");
        int productQuantity = scanner.nextInt();

        Product product = new Product(productId, productPrice, productQuantity);
        double salesTax = product.calcTax();
        System.out.println("Product Sales Tax: " + salesTax);

        scanner.close();
    }
}
    

