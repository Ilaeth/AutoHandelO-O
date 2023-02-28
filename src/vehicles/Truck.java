package vehicles;

public class Truck extends Vehicle {

    public Truck(String vehicleID, String producer, String model, Integer yearOfProduction, Double price) {
        super(vehicleID, producer, model, yearOfProduction, price);
    }
    @Override
    public String toString() {
        return "Truck "+producer + " " + model + " " + yearOfProduction + " year, for the price " + Math.round(price);
    }
}