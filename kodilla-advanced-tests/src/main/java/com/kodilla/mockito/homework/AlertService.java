package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AlertService {
    private Map<String, Set<User>> alerts = new HashMap<>();

    public void addUserToLocation (String location, User user) {
         Set<User> users = alerts.getOrDefault(location, new HashSet<>());
         users.add(user);
         alerts.put(location, users);
    }
    public void sendAlert (Alert alert, String location) {

        if (alerts.containsKey(location)) {
            alerts.get(location).forEach(user -> user.receive(alert));
        }
    }
    public void removeLocation (String location) {
        alerts.remove(location);

    }
    public void removeUser (User user, String location) {
        if (alerts.containsKey(location)) {
            alerts.get(location).remove(user);
        }
    }

    public void removeUserFromAllLocations(User user) {
        for (Set<User> users : this.alerts.values()) {
            users.remove(user);
        }
    }
}
