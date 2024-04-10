package demo;

import model.Flight;
import util.Sorter;
import gui.Form1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightTest {
    public static void main(String[] args) {
        // Initialize Scanner to read input from the console.
        Scanner scanner = new Scanner(System.in);
        List<Flight> flightsList = new ArrayList<>();

        // Prompt the user to enter the number of Flight objects they want to create.
        System.out.print("Enter the number of flights to input: ");
        int numberOfFlights = Integer.parseInt(scanner.nextLine());

        // Loop over the number of flights to gather details for each one.
        for (int i = 0; i < numberOfFlights; i++) {
            System.out.println("Enter details for flight " + (i + 1) + ":");

            // Prompt for each detail of the Flight and store the response.
            System.out.print("Airline Name: ");
            String airlineName = scanner.nextLine();

            System.out.print("Flight Number: ");
            String flightNumber = scanner.nextLine();

            System.out.print("Origin: ");
            String flightOrigin = scanner.nextLine();

            System.out.print("Destination: ");
            String flightDestination = scanner.nextLine();

            System.out.print("Airfare: ");
            double airfare = Double.parseDouble(scanner.nextLine());

            System.out.print("Departure Time (e.g., 2024-04-10 08:00): ");
            String departureTime = scanner.nextLine();

            System.out.print("Arrival Time (e.g., 2024-04-10 11:00): ");
            String arrivalTime = scanner.nextLine();

            System.out.print("Available Seats: ");
            int availableSeats = Integer.parseInt(scanner.nextLine());

            System.out.print("Flight Duration (hours): ");
            double flightDuration = Double.parseDouble(scanner.nextLine());

            System.out.print("Distance (km): ");
            double distance = Double.parseDouble(scanner.nextLine());

            // Create a new Flight object and add it to the list.
            flightsList.add(new Flight(airlineName, flightNumber, flightOrigin, flightDestination,
                                       airfare, departureTime, arrivalTime, availableSeats,
                                       flightDuration, distance));
        }

        // Close the scanner to prevent resource leaks.
        scanner.close();


        System.out.println("\nUnsorted Flight Details:");
        for (Flight flight : flightsList) {
            System.out.println(flight);
        }

        // After all flights are entered, we sort them using the Sorter class.
        Sorter.sortByFlightNumber(flightsList);

        // Print out the sorted flights to the console.
        System.out.println("\nSorted Flight Details:");
        for (Flight flight : flightsList) {
            System.out.println(flight);
        }
        

        // Launch the GUI and pass the list of flights.
        javax.swing.SwingUtilities.invokeLater(() -> {
            Form1 form = new Form1(flightsList);
            form.setVisible(true);
        });
    }
}
