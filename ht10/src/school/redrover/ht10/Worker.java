package school.redrover.ht10;

public class Worker extends Employee {
    public Worker(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
            return getBaseSalary();

    }
}
