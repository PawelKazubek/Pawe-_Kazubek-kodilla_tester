package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String departure) {
        List<Flight> resultsDeparture = new ArrayList<>();

        for (Flight searchedFlight : FlightRepository.getFlightTable()) {
            if (searchedFlight.getDeparture().equals(departure)) {
                resultsDeparture.add(searchedFlight);
            }
        }
        return resultsDeparture;
    }
    public static List<Flight> findFlightsTo(String arrival) {
        List<Flight> resultsArrival = new ArrayList<>();

        for (Flight searchedFlight : FlightRepository.getFlightTable()) {
            if (searchedFlight.getArrival().equals(arrival)) {
                resultsArrival.add(searchedFlight);
            }
        }
        return resultsArrival;
    }

}
