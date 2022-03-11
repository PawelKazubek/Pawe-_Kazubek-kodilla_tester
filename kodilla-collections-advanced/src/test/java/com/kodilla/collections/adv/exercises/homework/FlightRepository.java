package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Gdansk"));
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Gdansk", "Warsaw"));
        flights.add(new Flight("Berlin", "Gdansk"));
        flights.add(new Flight("Berlin", "Warsaw"));
        flights.add(new Flight("Warsaw", "Frankfurt"));

        System.out.println(flights);
        return flights;

    }
}
