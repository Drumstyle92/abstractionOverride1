/**
 * @author Drumstyle92
 * class that contains the main.
 */
public class Tester {
    /**
     *
     * @param args fundamental parameter for the functioning of the main class.
     * Main class with one machine object and one boat object with various specifications also with a final output.
     */
    public static void main(String[] args){
        // Machine and boat object.
        Car car = new Car(4,3,34555.9999);
        Boat boat = new Boat(101.78,1000);
        System.out.println("-----------------------Vehicle1---------------------");
        car.showVehicleDetails();
        System.out.println("------------------------Sound1----------------------");
        car.doVehicleSound();
        System.out.println("-----------------------Vehicle2---------------------");
        boat.showVehicleDetails();
        boat.getBoatWeightAndSpeed();
        System.out.println("------------------------Sound2----------------------");
        boat.doVehicleSound();
        System.out.println("----------------------------------------------------");


    }
}
