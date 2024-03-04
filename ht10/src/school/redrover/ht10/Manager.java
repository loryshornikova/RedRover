package school.redrover.ht10;

public class Manager extends Worker {
    private int numberOfSubordinates;

    public Manager(String name, int numberOfSubordinates) {
        super(name);
        this.setNumberOfSubordinates(numberOfSubordinates);
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() + getNumberOfSubordinates() * 0.01 * 3;
        }
    }
}
