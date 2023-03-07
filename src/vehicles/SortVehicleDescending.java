package vehicles;

import java.util.Comparator;

public class SortVehicleDescending implements Comparator<Vehicle> {
        public int compare(Vehicle o1, Vehicle o2) {
            return o2.getterValue().compareTo(o1.getterValue());
    }
}