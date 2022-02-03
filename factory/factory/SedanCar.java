package factory;

public class SedanCar extends Car {

    /**
     * An instance of sedan car
     * @param make the brand of car
     * @param model the exact model of car
     */
    public SedanCar(String make, String model) {
        super(make, model);
    }

    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
}