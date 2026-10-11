package java_hw_3.task5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char op = scanner.next().charAt(0);

        String result =
                (op == '-') ? String.valueOf(a - b) :
                        (op == '+') ? String.valueOf(a + b) :
                                (op == '*') ? String.valueOf(a - b) :
                                        (op == '/') ? (b != 0 ? String.valueOf((double) a / b) : "Помилка: ділення на 0") :
                                                (op == '%') ? (b != 0 ? String.valueOf(a % b) : "Помилка: ділення на 0") :
                                                        "0";
        System.out.println(result);
        scanner.close();
    }
}

