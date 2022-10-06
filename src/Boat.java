/**
 * @author Drumstyle92
 * Class representing the boat with the methods and variables that represent it.
 */
public class Boat extends Vehicle {
    public double maxKnotsSpeed;
    public int kilosWeight;

    /**
     * method that prints the sound of the boat.
     */
    @Override
    public void doVehicleSound() {
        System.out.println("the sound of the boat: BRRRRRRRRRRRRMMMMMMM ");
    }

    /**
     *
     * @param maxSpeed maximum boat speed.
     * @param weight the total weight of the boat.
     * boat builder method which contains the vehicle name and two parameters.
     */
    Boat(double maxSpeed,int weight){
        type = " boat ";
        this.maxKnotsSpeed = maxSpeed;
        this.kilosWeight = weight;
    }

    /**
     * method for printing the boat variables.
     */
    public void getBoatWeightAndSpeed(){
        System.out.printf("The boat has a total of %d kilos and it's maximum speed is %f %n",this.kilosWeight,this.maxKnotsSpeed);
    }
}
