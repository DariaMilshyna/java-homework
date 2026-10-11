package java_hw_4.task5;

import java.util.Random;
import java.util.Scanner;

public class Masive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int number = scanner.nextInt();
        boolean found = false;

        for (int element : numbers) {
            if (element == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The number is in the array.");
        } else {
            System.out.println("The number is not in the array.");
        }
    }
}