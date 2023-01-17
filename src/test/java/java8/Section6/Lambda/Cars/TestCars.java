package java8.Section6.Lambda.Cars;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestCars {


    @Test
    public static void checkCar() {
        List<Car> mustangsRed = createTenCars(() -> new Car("Red", "mustangGT", 4.0));
        List<Car> mustangsGreen = createTenCars(() -> new Car("Green", "mustangGT", 4.0));
        List<Car> mustangsYellow = createTenCars(() -> new Car("Yellow", "mustangGT", 4.0));
        System.out.println(mustangsRed);
        System.out.println(mustangsGreen);
        System.out.println(mustangsYellow);
    }

    public static List<Car> createTenCars(Supplier<Car> supplier) {
        List<Car> cars = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        List<Car> mustangsBlue = createTenCars(() -> new Car("Blue", "mustangGT", 4.0));
        System.out.println("our car: " + mustangsBlue);

        changeCar(mustangsBlue.get(0), car -> {
            car.color = "purple";
            car.engine = 5.5;
            car.model = "RX";
        });
        System.out.println("updated car: " + mustangsBlue);
    }
}
