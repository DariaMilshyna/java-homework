package java_hw_12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", "Smith", 25, 3000));
        persons.add(new Person("Anna", "Brown", 35, 4000));
        persons.add(new Person("Daria", "Miller", 45, 5000));
        persons.add(new Person("Robert", "Wilson", 75, 2500));
        persons.add(new Person("Mary", "Taylor", 80, 2000));

        System.out.println("All persons:");
        persons.forEach(System.out::println);

        List<String> names = persons.stream()
                .filter(person -> person.getAge() < 70)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("Filtered names:");
        System.out.println(names);
    }
}