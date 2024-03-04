package cars;

public class Main {
    public static void main(String[] args) {
        LicensePlateMaker ca_maker = new LicensePlateMaker("CA");
        LicensePlate ca_plate = ca_maker.makeNextPlate();
        System.out.println(ca_plate.getPlate());


        LicensePlateMaker ny_maker = new LicensePlateMaker("NY");
        LicensePlate ny_plate = ny_maker.makeNextPlate();
        System.out.println(ny_plate.getPlate());

        LicensePlateMaker ca1_maker = new LicensePlateMaker("CA");
        LicensePlate ca1_plate = ca_maker.makeNextPlate();
        System.out.println(ca1_plate.getPlate());

    }
}
