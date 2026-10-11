package java_hw_10.task4;

public class Application {

    public static void main(String[] args) {

        Car car = new Car.Builder()
                .setModel("BMW")
                .setPrice(50000)
                .setMaxSpeed(250)
                .setCountOfWheels(4)
                .build();

        System.out.println(car);
    }
}