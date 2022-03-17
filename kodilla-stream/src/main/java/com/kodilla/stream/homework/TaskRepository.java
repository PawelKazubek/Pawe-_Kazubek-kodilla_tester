package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("washing a car", LocalDate.of(2022, 03, 15), LocalDate.of(2022,03,16)));
        tasks.add(new Task("cleaning a house", LocalDate.of(2022, 03, 16), LocalDate.of(2022, 03, 18)));
        tasks.add(new Task("shopping", LocalDate.of(2022, 03, 16), LocalDate.of(2022, 03, 16)));
        return tasks;
    }
}
