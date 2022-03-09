package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> students = new ArrayList<>();

    public School(double... students) {
        for (Double student : students)
            this.students.add(student);
    }
    public double getStudentsSum () {
        double sum = 0;
        for (Double student : students)
            sum+=student;
        return sum;
    }

    @Override
    public String toString() {
        return "School {" +
                "students=" + students +
                '}';
    }
}
