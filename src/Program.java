import java.util.*;

public class Program {
    public static void main(String[] args) {
        TreeSet<Car> cars = new TreeSet<>();
        Car car1 = new Car(2, "BMW", "520d");
        Car car2 = new Car(3, "BMW", "530d");
        Car car3 = new Car(3.5, "BMW", "540d");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for (Car c : cars) {
            System.out.println(c);
        }
    }
}
