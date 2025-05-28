public class DriverMain3 {
    class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        return price * quantity * salesTax;
    }
}
    
}
