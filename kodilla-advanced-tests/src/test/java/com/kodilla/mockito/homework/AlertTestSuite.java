package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;

public class AlertTestSuite {

    AlertService alertService = new AlertService();
    User user = Mockito.mock(User.class);
    Alert alert = Mockito.mock(Alert.class);

    @Test
    public void shouldAddUserAndReceiveAlert() {
        alertService.addUserToLocation("Warsaw", user);
        alertService.sendAlert(alert, "Warsaw");
        Mockito.verify(user,times(1)).receive(alert);
    }
    @Test
    public void shouldNotReceiveAlertAfterRemoveLocation() {
        alertService.addUserToLocation("Warsaw", user);
        alertService.addUserToLocation("Kraków", user);
        alertService.removeUser(user,"Warsaw");
        alertService.sendAlert(alert, "Warsaw");
        alertService.sendAlert(alert, "Kraków");
        Mockito.verify(user, times(1)).receive(alert);
    }
    @Test
    public void twoUsersAddedToOneLocationOneRemovedShouldNotReceiveAlertAfterRemoveLocation() {
        alertService.addUserToLocation("Warsaw", user);
        User user1 = Mockito.mock(User.class);
        alertService.addUserToLocation("Warsaw", user1);
        alertService.removeUser(user,"Warsaw");
        alertService.sendAlert(alert, "Warsaw");
        Mockito.verify(user, times(0)).receive(alert);
        Mockito.verify(user1, times(1)).receive(alert);
    }
    @Test
    public void shouldNotReceiveAlertsWhenRemovedFromAllLocations() {
        alertService.addUserToLocation("Warsaw", user);
        alertService.addUserToLocation("Kraków", user);
        alertService.addUserToLocation("Gdańsk", user);
        alertService.removeUserFromAllLocations(user);
        alertService.sendAlert(alert, "Warsaw");
        alertService.sendAlert(alert, "Kraków");
        alertService.sendAlert(alert, "Gdańsk");
        Mockito.verify(user,times(0)).receive(alert);

    }
    @Test
    public void shouldSendAlertInLocationToSomeGroupOfUsers() {
        alertService.addUserToLocation("Kraków", user);
        User user1 = Mockito.mock(User.class);
        alertService.addUserToLocation("Warsaw", user1);
        User user2 = Mockito.mock(User.class);
        alertService.addUserToLocation("Warsaw", user2);
        alertService.sendAlert(alert, "Warsaw");
        Mockito.verify(user, times(0)).receive(alert);
        Mockito.verify(user1, times(1)).receive(alert);
        Mockito.verify(user2, times(1)).receive(alert);

    }
    @Test
    public void shouldSendAlertToAllUsers() {
        alertService.addUserToLocation("Warsaw", user);
        User user1 = Mockito.mock(User.class);
        alertService.addUserToLocation("Warsaw", user1);
        alertService.addUserToLocation("Kraków", user);
        User user2 = Mockito.mock(User.class);
        alertService.addUserToLocation("Kraków", user2);
        alertService.addUserToLocation("Gdańsk", user);
        alertService.sendAlert(alert, "Warsaw");
        alertService.sendAlert(alert, "Kraków");
        alertService.sendAlert(alert, "Gdańsk");
        Mockito.verify(user, times(3)).receive(alert);
        Mockito.verify(user1,times(1)).receive(alert);
        Mockito.verify(user2,times(1)).receive(alert);

    }
    @Test
    public void shouldRemoveOneLocation() {
        alertService.addUserToLocation("Warsaw", user);
        alertService.addUserToLocation("Kraków", user);
        alertService.addUserToLocation("Gdańsk", user);
        alertService.removeLocation("Kraków");
        alertService.sendAlert(alert, "Warsaw");
        alertService.sendAlert(alert, "Kraków");
        alertService.sendAlert(alert, "Gdańsk");
        Mockito.verify(user,times(2)).receive(alert);

    }
}
