package java_hw_4.task6;

import java.util.Random;

public class Plus {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[45];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101) - 50;
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}