import model.Flight;

public class FlightTest {

    public static void main(String[] args) {
        // Create a Flight object using the constructor
        Flight flight = new Flight("Delta Airlines", "DL123", "New York", "Los Angeles",
                                   299.99, "2024-04-10 08:00", "2024-04-10 11:00", 20,
                                   6.0, 4500.0);

        // Test getters
        System.out.println("Airline Name: " + flight.getAirlineName());
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Origin: " + flight.getFlightOrigin());
        System.out.println("Destination: " + flight.getFlightDestination());
        System.out.println("Airfare: $" + flight.getAirfare());
        System.out.println("Departure Time: " + flight.getDepartureTime());
        System.out.println("Arrival Time: " + flight.getArrivalTime());
        System.out.println("Available Seats: " + flight.getAvailableSeats());
        System.out.println("Duration: " + flight.getFlightDuration() + " hours");
        System.out.println("Distance: " + flight.getDistance() + " km");

        // Test toString()
        System.out.println("\nFlight Details:\n" + flight.toString());

        // Test updating an attribute
        flight.setAirlineName("United Airlines");
        System.out.println("\nAfter changing the airline name:");
        System.out.println(flight.toString());
      
    }
}
