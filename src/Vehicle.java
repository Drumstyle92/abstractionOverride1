/**
 * @author Drumstyle92
 * abstract class containing methods and a part of vehicle variables.
 */
public abstract class Vehicle {
    String type;
    int numberOfWheels;

    /**
     * method showing the type and how many wheels the vehicle has.
     */
    public void showVehicleDetails(){
        System.out.println("The vehicle is a "+ type +" and has "+ numberOfWheels +" wheels ");
    }

    /**
     * abstract method that shows the sounds of vehicles if overridden.
     */
    public abstract void doVehicleSound();
}
