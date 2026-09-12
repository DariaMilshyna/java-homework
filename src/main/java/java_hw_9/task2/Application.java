package java_hw_9.task2;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Person person1 = new Person("John", "Smith", 25);
        Person person2 = new Person("Anna", "Brown", 30);
        Person person3 = new Person("Daria", "Miller", 22);

        Person duplicate1 = new Person("John", "Smith", 25);
        Person duplicate2 = new Person("Anna", "Brown", 30);

        Set<Person> people = new HashSet<>();

        System.out.println("Adding people:");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(duplicate1);
        people.add(duplicate2);

        System.out.println(people);

        System.out.println("Set size:");
        System.out.println(people.size());

        System.out.println("Contains John Smith:");
        System.out.println(people.contains(person1));

        System.out.println("Remove Daria Miller:");
        people.remove(person3);
        System.out.println(people);

        System.out.println("Is Set empty:");
        System.out.println(people.isEmpty());

        System.out.println("Clear Set:");
        people.clear();

        System.out.println("Is Set empty after clear:");
        System.out.println(people.isEmpty());
    }
}