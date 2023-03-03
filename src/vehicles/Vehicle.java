package vehicles;

import java.math.BigDecimal;

public abstract class Vehicle{
    Enum.Brand brand;
    Enum.Mileage mileage;
    Enum.Color color;
    Enum.Segment segment;
    BigDecimal value;

    public Vehicle(Enum.Brand brand, Enum.Mileage mileage, Enum.Color color, Enum.Segment segment) {
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
        this.value = generateValue();
    }

    public abstract BigDecimal generateValue();

    public String getterType() {
        if (this instanceof Motorcycle) return "Motorcycle";
        else if(this instanceof Car) return "Car";
        else if (this instanceof Bus) return "Bus";
        else return "Truck";
    }

    @Override
    public String toString() {
        return "Vehicle "+ getterType() + " Brand " + brand + " Mileage " + mileage + " Color " + color + " Segment " + segment + " Value = " + value;
    }
}