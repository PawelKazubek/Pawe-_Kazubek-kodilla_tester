package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Monika Partyka", new Teacher("Olek Bolek")));
        students.add(new Student("Dawid Moro", null));
        students.add(new Student("Dorota Pelan", new Teacher("Ola Motyl")));
        students.add(new Student("Karolina Gorzka", new Teacher("Paulina Słodka")));
        students.add(new Student("Kamila Grzyb", null));

        for (Student student : students) {

            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacher = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Student: " + student.getName() + ", Teacher: " + teacher.getName());
        }
    }
}
