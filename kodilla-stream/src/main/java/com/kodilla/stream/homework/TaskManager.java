package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadline = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.deadline.equals(LocalDate.now()))
                .map(TaskManager::getDeadline)
                .collect(Collectors.toList());
                System.out.println(deadline);

    }
    public static LocalDate getDeadline(Task task) {
        return task.getDeadline();
    }
}
