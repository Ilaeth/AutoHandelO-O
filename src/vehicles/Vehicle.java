package vehicles;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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

    public static ArrayList<Vehicle> generateRandomVehicles(int x) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for(int i = 0; i < x; i++) {
            int randomBrand = ThreadLocalRandom.current().nextInt(0, Enum.Brand.values().length);
            Enum.Brand brand = Enum.Brand.values()[randomBrand];

            int randomMileage = ThreadLocalRandom.current().nextInt(0, Enum.Mileage.values().length);
            Enum.Mileage mileage = Enum.Mileage.values()[randomMileage];

            int randomColor = ThreadLocalRandom.current().nextInt(0, Enum.Color.values().length);
            Enum.Color color = Enum.Color.values()[randomColor];

            int randomSegment = ThreadLocalRandom.current().nextInt(0, Enum.Segment.values().length);
            Enum.Segment segment = Enum.Segment.values()[randomSegment];

            int randomVehicle = ThreadLocalRandom.current().nextInt(0, Enum.Vehicle.values().length);

            switch (randomVehicle) {
                case 0:
                    vehicles.add(new Motorcycle(brand, mileage, color, segment));
                case 1:
                    vehicles.add(new Car(brand, mileage, color, segment));
                case 2:
                    vehicles.add(new Bus(brand, mileage, color, segment));
                case 3:
                    vehicles.add(new Truck(brand, mileage, color, segment));
            }
        }

        return vehicles;
    }

    @Override
    public String toString() {
        return  " {" + "\n" +
                "Vehicle "+ getterType() + "\n" +
                " Brand " + brand + "\n" +
                " Mileage " + mileage + "\n" +
                " Color " + color + "\n" +
                " Segment " + segment + "\n" +
                " Value = " + value
                + "\n" + " }";
    }
}