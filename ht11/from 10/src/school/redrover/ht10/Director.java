package school.redrover.ht10;

public final class Director extends Worker {

    public Director(String name,  int numberOfSubordinates) {
        super(name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

@Override
    public int getRate(){
        return super.getRate() * 3;
    }


    @Override
    public double getSalary () {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() + getNumberOfSubordinates() * 0.01 * getRate();
        }
    }
}
