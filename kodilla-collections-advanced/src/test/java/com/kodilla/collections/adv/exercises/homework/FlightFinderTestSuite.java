package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom () {

        List<Flight> resultDeparture = FlightFinder.findFlightsFrom("Warsaw");

        List<Flight> expectedDeparture = new ArrayList<>();
        expectedDeparture.add(new Flight("Warsaw", "Gdansk"));
        expectedDeparture.add(new Flight("Warsaw", "Berlin"));
        expectedDeparture.add(new Flight("Warsaw", "Frankfurt"));
        assertEquals(3, resultDeparture.size());

        List<Flight> resultDeparture1 = FlightFinder.findFlightsFrom("Gdansk");

        List<Flight> expectedDeparture1 = new ArrayList<>();
        expectedDeparture1.add(new Flight("Gdansk", "Warsaw"));
        assertEquals(1,resultDeparture1.size());

        List<Flight> resultDeparture2 = FlightFinder.findFlightsFrom("Berlin");

        List<Flight> expectedDeparture2 = new ArrayList<>();
        expectedDeparture2.add(new Flight("Berlin", "Gdansk"));
        expectedDeparture2.add(new Flight("Berlin", "Warsaw"));
        assertEquals(2,resultDeparture2.size());

    }

    @Test
    public void testFindFlightsTo () {
        List<Flight> resultArrival = FlightFinder.findFlightsTo("Warsaw");

        List<Flight> expectedArrival = new ArrayList<>();
        expectedArrival.add(new Flight("Gdansk", "Warsaw"));
        expectedArrival.add(new Flight("Berlin", "Warsaw"));
        assertEquals(2,resultArrival.size());

        List<Flight> resultArrival1 = FlightFinder.findFlightsTo("Gdansk");

        List<Flight> expectedArrival1 = new ArrayList<>();
        expectedArrival1.add(new Flight("Warsaw", "Gdansk"));
        expectedArrival1.add(new Flight("Berlin", "Gdansk"));
        assertEquals(2,resultArrival1.size());

        List<Flight> resultDeparture2 = FlightFinder.findFlightsTo("Berlin");

        List<Flight> expectedArrival2 = new ArrayList<>();
        expectedArrival2.add(new Flight("Warsaw", "Berlin"));
        assertEquals(1,resultDeparture2.size());

        List<Flight> resultDeparture3 = FlightFinder.findFlightsTo("Frankfurt");

        List<Flight> expectedArrival3 = new ArrayList<>();
        expectedArrival3.add(new Flight("Warsaw", "Frankfurt"));
        assertEquals(1,resultDeparture3.size());
    }
}
