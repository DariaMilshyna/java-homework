package java_hw_6.task2;

public class Car extends Vehicle {

    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Транспорт " + name + " рухається зі швидкістю "
                + speed + " км/год з " + passengerCapacity + " кількістю людей");
    }
}