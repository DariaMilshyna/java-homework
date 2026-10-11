package java_hw_11.task3;

import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class Application {

    public static void main(String[] args) {

        LocalDateTime saturday = LocalDateTime.of(2023, 10, 28, 10, 0);
        LocalDateTime monday = LocalDateTime.of(2023, 10, 30, 10, 0);

        System.out.println("Saturday: " + isWeekend(saturday));
        System.out.println("Monday: " + isWeekend(monday));
    }

    public static boolean isWeekend(LocalDateTime dateTime) {

        DayOfWeek day = dateTime.getDayOfWeek();

        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }
}