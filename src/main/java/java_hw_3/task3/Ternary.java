package java_hw_3.task3;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int difference = a > b ? a - b : b - a;
        System.out.println(difference);
    }
}
