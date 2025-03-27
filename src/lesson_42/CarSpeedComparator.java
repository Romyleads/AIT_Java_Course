package lesson_42;

import java.util.Comparator;

/*** Author: Roman Romashko Date: 26.03.2025 ***/

public class CarSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed()-car2.getMaxSpeed();
    }
}
