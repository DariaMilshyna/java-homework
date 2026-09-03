package java_hw_4.task1;

import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();

        while(true){
            String string = scanner.next();
            if (!string.equals("STOP")){
                stringBuilder.append(string).append(" ");
            } else {
                break;
            }
        }
        System.out.println(stringBuilder);
    }
}
