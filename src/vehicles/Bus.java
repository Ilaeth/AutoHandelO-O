package vehicles;

public class Bus extends Vehicle {

    public Bus(String vehicleID, String producer, String model, Integer yearOfProduction, Double price) {
        super(vehicleID, producer, model, yearOfProduction, price);
    }
    @Override
    public String toString() {
        return "Bus "+producer + " " + model + " " + yearOfProduction + " year, for the price " + Math.round(price);
    }
}
