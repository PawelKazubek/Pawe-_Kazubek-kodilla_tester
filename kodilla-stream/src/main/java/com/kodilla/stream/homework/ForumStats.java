package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() >=40)
                .mapToInt(ForumStats::getNumberOfPost)
                .average()
                .getAsDouble();
        System.out.println("Średnia liczba postów dla użytkowników >=40: " + avg);

        double avg1 = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() <40)
                .mapToInt(ForumStats::getNumberOfPost)
                .average()
                .getAsDouble();
        System.out.println("Średnia liczba postów dla użytkowników <40: " + avg1);
    }
    public static int getNumberOfPost(User user) {
        return user.getNumberOfPost();
    }
}
