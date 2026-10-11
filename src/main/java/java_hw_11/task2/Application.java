package java_hw_11.task2;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2023, 10, 25, 14, 30);

        System.out.println("Original date: " + dateTime);

        LocalDateTime futureDate =
                calculateFutureDateTime(dateTime, 3, 5);

        System.out.println("Future date: " + futureDate);

        LocalDateTime pastDate =
                calculateFutureDateTime(dateTime, -3, -5);

        System.out.println("Past date: " + pastDate);
    }

    public static LocalDateTime calculateFutureDateTime(
            LocalDateTime dateTime, int days, int hours) {

        return dateTime.plusDays(days).plusHours(hours);
    }
}