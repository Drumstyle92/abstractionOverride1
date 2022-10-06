/**
 * @author Drumstyle92
 * Class that represents the machine with the methods and variables that represent it.
 */
public class Car extends Vehicle{
    int  numberOfDoors;
    double carPrice;

    /**
     * shows the doors of the car.
     */
    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("The number of doors is " + numberOfDoors);
    }

    /**
     * machine sound.
     */
    @Override
    public void doVehicleSound() {
        System.out.println("The sound of the car: DRUMMMMMMMMMMMMMMMM ");
    }

    /**
     *
     * @param wheels number of wheels of the machine.
     * @param doors number of doors on the machine.
     * @param price cost of the machine.
     *
     */
    Car(int wheels,int doors,double price){
        type = " car ";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }
}
