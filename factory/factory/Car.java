package factory;

import java.util.ArrayList;

/**
 * A list of possible car accessories
 */
enum Accessories {
    SPORTS_SEATS,
    WINDOW_TINT,
    HEATED_SEATS,
    HIGH_END_SOUND,
    TRUNK_ORGANIZER,
    BACK_UP_CAMERA,
    FLOOR_MATTS,
    BLUE_TOOTH,
    EXTRA_CUP_HOLDERS,
    PHONE_CHARGER;
}

/**
 * A car
 * @author Mario Misencik
 */
public abstract class Car {
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    /**
     * An instance of car
     * @param make the brand of car
     * @param model the exact model of car
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /**
     * Assembles a car step-by-step, starting with the frame and ending with the accessories
     */
    public void assemble() {
        System.out.println("Creating a " + make + " " + model);
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    /**
     * Adds the frame of the car
     */
    protected abstract void addFrame();

    /**
     * Adds the wheels of the car
     */
    protected void addWheels() {
        System.out.println("Adding the Wheels");
    }

    /**
     * Adds the car engine
     */
    protected void addEngine() {
        System.out.println("Adding a Standard Engine");
    }

    /**
     * Adds the windows of the car
     */
    protected void addWindows() {
        System.out.println("Adding Windows");
    }

    /**
     * Adds certain accessories to the car depending of the type of car
     */
    protected abstract void addAccessories();

    /**
     * Prints all of the accessories of the car to the screen
     */
    protected void displayAccessories() {
        System.out.println("Accessories:");
        for (Accessories a : accessories) {
            System.out.println("- " + a);
        }
    }
}