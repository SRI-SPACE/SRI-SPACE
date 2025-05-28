
public class Employee {
    class employee implements Taxable {
    int empId;
    String name;
    double salary;

    public employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return salary * incomeTax;
    }
}

}
