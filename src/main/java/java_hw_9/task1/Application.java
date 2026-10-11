package java_hw_9.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new HashMap<>();

        while (true) {
            System.out.println("Enter command: addPerson, getPerson or exit");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Program finished.");
                break;
            }

            if (command.equalsIgnoreCase("addPerson")) {

                System.out.println("Enter surname:");
                String surname = scanner.nextLine();
                String key = surname.toUpperCase();

                System.out.println("Enter name:");
                String name = scanner.nextLine();

                int age;

                while (true) {
                    System.out.println("Enter age:");

                    String ageInput = scanner.nextLine();

                    try {
                        age = Integer.parseInt(ageInput);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Incorrect age. Please enter a number.");
                    }
                }

                if (people.containsKey(key)) {
                    System.out.println("Person with this surname already exists.");
                    System.out.println("Do you want to replace this person? yes/no");

                    String answer = scanner.nextLine();

                    if (answer.equalsIgnoreCase("yes")) {
                        people.put(key, new Person(name, surname, age));
                        System.out.println("Person replaced.");
                    } else {
                        System.out.println("Person was not replaced.");
                    }

                } else {
                    people.put(key, new Person(name, surname, age));
                    System.out.println("Person added.");
                }

            } else if (command.equalsIgnoreCase("getPerson")) {

                System.out.println("Enter surname:");
                String surname = scanner.nextLine();
                String key = surname.toUpperCase();

                if (people.containsKey(key)) {
                    System.out.println(people.get(key));
                } else {
                    if (people.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Person with surname " + surname + " was not found.");
                        System.out.println("Available surnames:");
                        System.out.println(people.keySet());
                    }
                }

            } else {
                System.out.println("Unknown operation. Please try again.");
            }
        }

        scanner.close();
    }
}