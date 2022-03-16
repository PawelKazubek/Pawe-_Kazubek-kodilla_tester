package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom () {

        List<Flight> resultDeparture = FlightFinder.findFlightsFrom("Warsaw");

        assertEquals(3, resultDeparture.size());

        List<Flight> resultDeparture1 = FlightFinder.findFlightsFrom("Gdansk");

        assertEquals(1,resultDeparture1.size());

        List<Flight> resultDeparture2 = FlightFinder.findFlightsFrom("Berlin");

        assertEquals(2,resultDeparture2.size());

    }

    @Test
    public void testFindFlightsTo () {
        List<Flight> resultArrival = FlightFinder.findFlightsTo("Warsaw");

        assertEquals(2,resultArrival.size());

        List<Flight> resultArrival1 = FlightFinder.findFlightsTo("Gdansk");

        assertEquals(2,resultArrival1.size());

        List<Flight> resultDeparture2 = FlightFinder.findFlightsTo("Berlin");

        assertEquals(1,resultDeparture2.size());

        List<Flight> resultDeparture3 = FlightFinder.findFlightsTo("Frankfurt");

        assertEquals(1,resultDeparture3.size());
    }
}
