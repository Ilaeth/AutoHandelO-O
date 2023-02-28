package vehicles;

public class Car extends Vehicle{

    public Car(String vehicleID, String producer, String model, Integer yearOfProduction, Double price) {
        super(vehicleID,producer,model,yearOfProduction,price);
    }

    @Override
    public String toString() {
        return "Car "+producer + " " + model + " " + yearOfProduction + " year, for the price " + Math.round(price);
    }
}