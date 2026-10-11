package java_hw_10.task2;

public class Application {

    public static void main(String[] args) {

        Vehicle vehicle1 = Vehicle.getInstance("BMW", 250, 50000);
        Vehicle vehicle2 = Vehicle.getInstance("Audi", 240, 45000);
        Vehicle vehicle3 = Vehicle.getInstance("Mercedes", 260, 60000);

        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);

        System.out.println();

        System.out.println("Hash vehicle1: " + vehicle1.hashCode());
        System.out.println("Hash vehicle2: " + vehicle2.hashCode());
        System.out.println("Hash vehicle3: " + vehicle3.hashCode());
    }
}