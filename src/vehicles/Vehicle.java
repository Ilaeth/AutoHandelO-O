package vehicles;

public class Vehicle{
    Enum.Brand brand;
    Enum.Mileage mileage;
    Enum.Color color;
    Enum.Segment segment;

    public Vehicle(Enum.Brand brand, Enum.Mileage mileage, Enum.Color color, Enum.Segment segment) {
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
    }
}