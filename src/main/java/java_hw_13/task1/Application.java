package java_hw_13.task1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("Enter 'start' to calculate or 'exit' to quit:");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Program finished.");
                break;
            }

            if (!command.equalsIgnoreCase("start")) {
                System.out.println("Unknown command.");
                continue;
            }

            try {
                System.out.println("Enter first number:");
                double a = readNumber(scanner);

                System.out.println("Enter second number:");
                double b = readNumber(scanner);

                System.out.println("Choose operation (+, -, *, /):");
                String operation = scanner.nextLine();

                double result = calculator.calculate(a, b, operation);

                System.out.println("Result: " + result);

            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());

            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());

            } catch (UnknownCalculationException e) {
                System.out.println(e.getMessage());

            } catch (Exception e) {
                System.out.println("Сталася невідома помилка");
            }
        }

        scanner.close();
    }

    public static double readNumber(Scanner scanner)
            throws InvalidNumberException {

        try {
            return Double.parseDouble(scanner.nextLine());

        } catch (NumberFormatException e) {
            throw new InvalidNumberException(
                    "Помилка: Ви ввели нечислове значення. Спробуйте ще раз.");
        }
    }
}