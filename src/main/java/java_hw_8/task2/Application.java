package java_hw_8.task2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student(1, "Anna", 20, 4.5);
        Student student2 = new Student(2, "Daria", 22, 4.8);
        Student student3 = new Student(3, "Alex", 21, 4.2);
        Student student4 = new Student(4, "Maria", 23, 4.7);
        Student student5 = new Student(5, "John", 19, 4.0);

        student1.addStudent(students, student1);
        student1.addStudent(students, student2);
        student1.addStudent(students, student3);
        student1.addStudent(students, student4);
        student1.addStudent(students, student5);

        System.out.println("All students:");
        student1.printAllStudents(students);

        System.out.println();

        System.out.println("Find student by name:");
        Student foundStudent = student1.findStudentByName(students, "Daria");
        System.out.println(foundStudent);

        System.out.println();

        System.out.println("Remove student with ID 3:");
        student1.removeStudentById(students, 3);
        student1.printAllStudents(students);
    }
}
