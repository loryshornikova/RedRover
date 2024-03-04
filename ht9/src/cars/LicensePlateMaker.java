package cars;

public class LicensePlateMaker {
    private String prefix;
    private int lastUsedNumber = 0;

    public String getPrefix() {
        return prefix;
    }

    public LicensePlateMaker(String prefix) {
    this.prefix = prefix;
    }
    public LicensePlate makeNextPlate() {
        int nextNumber = lastUsedNumber + 1;
        lastUsedNumber = nextNumber;
        return new LicensePlate (prefix + "-" + nextNumber);

    }
}
