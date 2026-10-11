package java_hw_13.task1;

public class Calculator {

    public double calculate(double a, double b, String operation)
            throws DivisionByZeroException, UnknownCalculationException {

        switch (operation) {
            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                if (b == 0) {
                    throw new DivisionByZeroException(
                            "Помилка: Ділення на нуль неможливе!");
                }
                return a / b;

            default:
                throw new UnknownCalculationException(
                        "Сталася невідома помилка");
        }
    }
}