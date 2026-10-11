package java_hw_4.task2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String string = String.valueOf(number);
        String reversed = new StringBuilder(string).reverse().toString();

        if (string.equals(reversed)) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}