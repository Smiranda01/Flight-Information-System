import model.Flight;
import java.util.ArrayList;
import java.util.List;

public class FlightTest {
    public static void main(String[] args) {
        List<Flight> flightsList = new ArrayList<>();

        // Adding test case 1
        flightsList.add(new Flight("Delta Airlines", "DL123", "New York JFK", "Los Angeles LAX", 
                                   350.00, "2024-04-15 07:00", "2024-04-15 10:30", 150, 6.5, 4500));
        
        // Adding test case 2
        flightsList.add(new Flight("British Airways", "BA456", "London Heathrow", "Tokyo Narita", 
                                   800.00, "2024-04-16 14:00", "2024-04-17 09:00", 200, 11, 9600));

        // Print flights to verify correct initialization
        System.out.println("Flight Details:");
        for (Flight flight : flightsList) {
            System.out.println(flight);
        }
    }
}

