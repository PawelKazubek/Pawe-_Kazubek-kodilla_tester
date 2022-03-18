package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge().equals(40))
                .map(ForumStats::getNumberOfPost)
                .average()
                .getAsDouble();
        System.out.println(avg);

    }
    public static int getNumberOfPost(User user) {
        return user.getNumberOfPost();
    }
}
