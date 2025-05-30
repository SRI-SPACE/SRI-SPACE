
interface Taxable {
    double salesTax = 0.07;
    double incomeTax = 0.105;
    double calcTax();
    class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {
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
