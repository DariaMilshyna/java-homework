package java_hw_11.task5;

import java.time.LocalDateTime;
import java.time.Duration;

public class Application {

    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(2023, 10, 25, 14, 30);
        LocalDateTime end = LocalDateTime.of(2023, 10, 28, 16, 45);

        calculateDifference(start, end);
    }

    public static void calculateDifference(LocalDateTime start, LocalDateTime end) {

        Duration duration = Duration.between(start, end).abs();

        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;

        System.out.println("Difference: " + days + " days, "
                + hours + " hours, "
                + minutes + " minutes");
    }
}