package school.redrover.ht10;

public class Director extends Manager {

    public Director(String name,  int numberOfSubordinates) {
        super(name, numberOfSubordinates);

    }

    @Override
    public double getSalary () {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() + getNumberOfSubordinates() * 0.01 * 9;
        }
    }
}
