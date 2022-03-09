package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> students = new HashMap<>();
        Principal john = new Principal("John", "Rambo");
        Principal jessie = new Principal("Jessie", "Jones");
        Principal bart = new Principal("Bart", "Simpson");

        School johnSchool = new School(30, 31, 28, 29);
        School jessieSchool = new School(29, 27, 28, 31);
        School bartSchool = new School(32, 30, 30, 29);

        students.put(john, johnSchool);
        students.put(jessie, jessieSchool);
        students.put(bart, bartSchool);

        for (Map.Entry<Principal, School> principalEntry : students.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + ", students sum: "
                    + principalEntry.getValue().getStudentsSum());

    }
}
