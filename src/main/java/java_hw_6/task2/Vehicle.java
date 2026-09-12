package java_hw_6.task2;

public class Vehicle {

    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println("Транспорт рухається зі швидкістю " + speed + " км/год");
    }

    public void stop() {
        System.out.println("Транспорт " + name + " зупинився");
    }
}