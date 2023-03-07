package vehicles;

import java.util.Comparator;

public class SortVehicleAscending implements Comparator<Vehicle> {
        public int compare(Vehicle o1, Vehicle o2) {
            return o1.getterValue().compareTo(o2.getterValue());
    }
}