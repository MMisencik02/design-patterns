package factory;

/**
 * A list of possible car types: small, sedan and luxury
 */
enum CarType {
    SMALL, SEDAN, LUXURY;
}

/**
 * A car creator
 * @author Mario Misencik
 */
public class CarFactory {
    
    /**
     * Creates and assembles a small, sedan, or luxury car depending on the type passed in
     * @param type the type of car (small, sedan, or luxury)
     * @param make the brand of car
     * @param model the exact model of car
     * @return A car
     */
    public static Car createCar(String type, String make, String model) {
        Car car = null;
        CarType carType = CarType.valueOf(type.toUpperCase());
        if (carType.name().equals("SMALL")) {
            car = new SmallCar(make, model);
            car.assemble();
            return car;
        } else if (carType.name().equals("SEDAN")) {
            car = new SedanCar(make, model);
            car.assemble();
            return car;
        } else if (carType.name().equals("LUXURY")) {
            car = new LuxuryCar(make, model);
            car.assemble();
            return car;
        } else {
            car = new SmallCar(make, model);
            car.assemble();
            return car;
        }
    }
}