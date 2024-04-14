import model.Flight;
import util.Sorter;
import gui.Form1;
import java.util.ArrayList;
import java.util.List;

public class FlightTest {
    public static void main(String[] args) {
        List<Flight> flightsList = new ArrayList<>();

        // Adding flights
        flightsList.add(new Flight("Delta Airlines", "DL123", "New York JFK", "Los Angeles LAX", 
                                   350.00, "2024-04-15 07:00", "2024-04-15 10:30", 150, 6.5, 4500));
        flightsList.add(new Flight("British Airways", "BA456", "London Heathrow", "Tokyo Narita", 
                                   800.00, "2024-04-16 14:00", "2024-04-17 09:00", 200, 11, 9600));
        flightsList.add(new Flight("Air New Zealand", "NZ125", "Auckland", "San Francisco", 
                                   2000.00, "2024-04-20 15:00", "2024-04-20 07:00", 100, 12, 10450));

        // Output unsorted flights
        System.out.println("Unsorted Flight Details:");
        flightsList.forEach(flight -> System.out.println(flight));

        // Sort flights by flight number
        Sorter.sortByFlightNumber(flightsList);

        // Output sorted flights
        System.out.println("\nSorted by Flight Number:");
        flightsList.forEach(flight -> System.out.println(flight));

        // Launch the GUI and pass the list of flights.
        javax.swing.SwingUtilities.invokeLater(() -> {
            Form1 form = new Form1(flightsList);
            form.setVisible(true);
        });
    }
}

