package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlertService {
    private Map<String, Set<User>> alerts = new HashMap<>();

    public void addUserToLocation (String location, User user) {
         Set<User> users = alerts.getOrDefault(location, new HashSet<>());
         users.add(user);
         alerts.put(location, users);
    }
    public void sendAlert (String location, Alert alert) {
        this.location.reveive(alert);

    }
    public void removeLocation (User user, String location) {
        this.alerts.remove(location);
    }
    public void removeUser (User user, String location) {
        this.alerts.remove(user);
    }

    public void removeUserFromAllLocations(User user) {
        this.alerts.remove(user);
    }
}
