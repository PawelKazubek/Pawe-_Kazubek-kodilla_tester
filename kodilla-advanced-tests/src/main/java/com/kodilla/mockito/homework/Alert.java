package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Alert {
    private Map<Location, Set<User>> notification = new HashMap<>();

    public void addUserToLocation (Location location, User user) {
         Set<User> users = notification.getOrDefault(location, new HashSet<>());
         users.add(user);
         notification.put(location, users);
    }
    public void sendNotification (Notification notification, Location location) {
       // for (Map.Entry<Location, Set<User>> locationEntry : notification.entrySet());


    }
    public void removeLocation (User user, Location location) {
        this.notification.remove(location);
    }
    public void removeUser (User user, Location location) {
        this.notification.remove(user);
    }

}
