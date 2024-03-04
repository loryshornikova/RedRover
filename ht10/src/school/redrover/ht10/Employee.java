package school.redrover.ht10;

public class Employee {

    private String name;
    final double BASESALARY = 2200.0;
    double baseSalary;
    private double salary ;


    public Employee (String name) {
        this.name = name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return BASESALARY;
    }
    public double getSalary() {
        return salary;
    }
}
