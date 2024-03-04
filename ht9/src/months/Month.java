package months;

public class Month {
    private String name;
    private int numberOfDays;
    private int numberOfWorkingDays;

    public Month(String name, int numberOfDays, int numberOfWorkingDaysDays) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.numberOfWorkingDays = numberOfWorkingDaysDays;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }
}
