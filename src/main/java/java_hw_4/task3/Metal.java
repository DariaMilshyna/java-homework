package java_hw_4.task3;

import java.util.Scanner;

public class Metal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter warehouse capacity: ");
        double capacity = scanner.nextDouble();

        while (capacity > 0) {
            System.out.print("Enter metal weight: ");
            double weight = scanner.nextDouble();

            if (weight < 5) {
                System.out.println("The warehouse cannot accept less than 5 kg.");
            } else if (weight > capacity) {
                System.out.println("The warehouse cannot accept this amount of metal.");
            } else {
                capacity -= weight;
                System.out.println("Remaining warehouse capacity: " + capacity + " kg");
            }
        }

        System.out.println("The warehouse is full.");
    }
}