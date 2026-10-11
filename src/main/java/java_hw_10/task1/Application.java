package java_hw_10.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", 250);
        Car car2 = new Car("Audi", 240);
        Car car3 = new Car("Toyota", 180);
        Car car4 = new Car("Mercedes", 260);
        Car car5 = new Car("Ford", 200);

        List<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println("Cars before sorting:");
        System.out.println(cars);

        cars.sort(Comparator.comparingInt(Car::getSpeed));

        System.out.println("Cars after sorting by speed:");
        System.out.println(cars);
    }
}