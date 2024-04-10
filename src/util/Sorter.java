package util;

import model.Flight;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

    public static void sortByFlightNumber(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparing(Flight::getFlightNumber));
    }

    public static void sortByDepartureTime(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparing(Flight::getDepartureTime));
    }

    public static void sortByArrivalTime(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparing(Flight::getArrivalTime));
    }

    public static void sortByAirfare(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparingDouble(Flight::getAirfare));
    }

    public static void sortByDuration(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparingDouble(Flight::getFlightDuration));
    }

    public static void sortByOrigin(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparing(Flight::getFlightOrigin));
    }

    public static void sortByDestination(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparing(Flight::getFlightDestination));
    }

    public static void sortByAvailableSeats(List<Flight> flights) {
        Collections.sort(flights, Comparator.comparingInt(Flight::getAvailableSeats));
    }

    // Add any additional sorting methods you need.
}

