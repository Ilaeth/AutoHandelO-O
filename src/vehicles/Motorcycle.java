package vehicles;

public class Motorcycle extends Vehicle {

    public Motorcycle(String vehicleID, String producer, String model, Integer yearOfProduction, Double price) {
        super(vehicleID, producer, model, yearOfProduction, price);
    }
    @Override
    public String toString() {
        return "Motorcycle "+producer + " " + model + " " + yearOfProduction + " year, for the price " + Math.round(price);
    }
}