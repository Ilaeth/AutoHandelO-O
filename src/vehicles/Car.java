package vehicles;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Vehicle{

    public Car(Enum.Brand brand, Enum.Mileage mileage, Enum.Color color, Enum.Segment segment) {
        super(brand, mileage, color, segment);
        this.value = generateValue();
    }

    public BigDecimal generateValue() {
        BigDecimal rand = BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(5000.0, 500000.0 + 1));
        return rand.setScale(2, RoundingMode.DOWN);
    }
}