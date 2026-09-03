package java_hw_4.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церква", "тренажерний зал", "кіно", "поліклініку"};

        int nameIndex = scanner.nextInt();
        int timeIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();

        System.out.println(names[nameIndex] + " буде йти до " + places[placeIndex] + " о " + times[timeIndex] + ":00");
    }
}


