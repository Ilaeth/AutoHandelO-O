package vehicles;

public class Vehicle{
    final protected String vehicleID;
    final public String model;
    final public String producer;
    final public Integer yearOfProduction;
    public Double price;

    public Vehicle(String vehicleID, String producer, String model, Integer yearOfProduction, Double price) {
        this.vehicleID = vehicleID;
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    @Override
    public String toString() {
        return vehicleID;
    }
}