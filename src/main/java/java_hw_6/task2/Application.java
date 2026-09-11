package java_hw_6.task2;

public class Application {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Transport", 50);
        vehicle.move();
        vehicle.stop();

        Car car = new Car("Toyota", 120, 5);
        car.move();
        car.stop();

        Truck truck = new Truck("Volvo", 90, 20.5);
        truck.move();
        truck.stop();
    }
}