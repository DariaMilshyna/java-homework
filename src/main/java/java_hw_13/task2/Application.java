package java_hw_13.task2;

import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("BMW", 250, 50000, 4);
        Vehicle vehicle2 = null;

        System.out.println("=== Vehicle 1 ===");

        Optional<Vehicle> optional1 = Optional.ofNullable(vehicle1);

        System.out.println("isPresent: " + optional1.isPresent());
        System.out.println("isEmpty: " + optional1.isEmpty());

        optional1.ifPresent(System.out::println);

        System.out.println("orElse: " +
                optional1.orElse(new Vehicle("Default", 100, 10000, 4)));

        System.out.println("orElseGet: " +
                optional1.orElseGet(() ->
                        new Vehicle("Default", 100, 10000, 4)));

        System.out.println("get: " + optional1.get());

        System.out.println("orElseThrow: " +
                optional1.orElseThrow());

        System.out.println("Name: " +
                optional1.map(Vehicle::getName).orElse("Unknown"));

        System.out.println();

        System.out.println("=== Vehicle 2 ===");

        Optional<Vehicle> optional2 = Optional.ofNullable(vehicle2);

        System.out.println("isPresent: " + optional2.isPresent());
        System.out.println("isEmpty: " + optional2.isEmpty());

        optional2.ifPresent(System.out::println);

        System.out.println("orElse: " +
                optional2.orElse(new Vehicle("Default", 100, 10000, 4)));

        System.out.println("orElseGet: " +
                optional2.orElseGet(() ->
                        new Vehicle("Default", 100, 10000, 4)));

        System.out.println("Name: " +
                optional2.map(Vehicle::getName).orElse("Unknown"));

        optional2.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Vehicle is null")
        );

        try {
            System.out.println("get: " + optional2.get());
        } catch (java.util.NoSuchElementException e) {
            System.out.println("get: No value present");
        }

        try {
            System.out.println("orElseThrow: " + optional2.orElseThrow());
        } catch (java.util.NoSuchElementException e) {
            System.out.println("orElseThrow: No value present");
        }
    }
}
