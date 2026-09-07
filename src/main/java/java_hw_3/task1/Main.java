package java_hw_3.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next();
        string4 = string4 + " " + scanner.next();
        string4 = string4 + " " + scanner.next();

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
    }
}
