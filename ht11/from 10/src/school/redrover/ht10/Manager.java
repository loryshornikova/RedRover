package school.redrover.ht10;

public final class Manager extends Worker {



    public Manager(String name, int numberOfSubordinates) {
        super(name);
        this.setNumberOfSubordinates(numberOfSubordinates);

    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        super.numberOfSubordinates = numberOfSubordinates;
    }



    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() + getNumberOfSubordinates() * 0.01 * getRate();
        }
    }
}
