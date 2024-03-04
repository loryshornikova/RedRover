package school.redrover.ht10;

public abstract class Employee {

    protected String name;
    protected final double BASESALARY = 2200.0;
    protected double baseSalary;
    protected int numberOfSubordinates;
    protected final int rate = 3;

    public int getRate(){
        return  rate;
    }


    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
    public Employee (String name) {
        this.name = name;
           }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    protected void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return BASESALARY;
    }
    protected abstract double getSalary();
}
