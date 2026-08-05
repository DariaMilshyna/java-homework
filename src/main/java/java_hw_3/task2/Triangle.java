package java_hw_3.task2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a){
            System.out.println("You can build a triangle");
        }
        else {
            System.out.println("You can't build a triangle");
        }
    }
}
