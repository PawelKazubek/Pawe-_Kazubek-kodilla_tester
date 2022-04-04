package lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Infiniti;
import com.kodilla.collections.interfaces.homework.Lexus;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(76);
        cars.add(ford);
        cars.add(new Lexus(95));
        cars.add(new Infiniti(80));

        cars.remove(1);
        cars.remove(ford);
        cars.remove(new Infiniti(80));
        System.out.println(cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
