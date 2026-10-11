package java_hw_11.task4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2023, 10, 25, 14, 30);

        String formattedDate = formatDateTime(dateTime, "dd-MM-yyyy HH:mm");

        System.out.println("Formatted date: " + formattedDate);
    }

    public static String formatDateTime(LocalDateTime dateTime, String pattern) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        return dateTime.format(formatter);
    }
}