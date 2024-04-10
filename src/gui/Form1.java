package gui;

import model.Flight;
import util.Sorter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Form1 extends JFrame {
    private JPanel mainPanel;
    private JTextArea flightsArea;
    private JTextField airlineNameField;
    private JTextField flightNumberField;
    private JTextField originField;
    private JTextField destinationField;
    private JTextField airfareField;
    private JTextField departureTimeField;
    private JTextField arrivalTimeField;
    private JTextField availableSeatsField;
    private JTextField durationField;
    private JTextField distanceField;
    private JButton addButton;
    private JButton sortButton;
    private JComboBox<String> sortOptions;

    private List<Flight> flights;

    public Form1(List<Flight> initialFlights) {
        this.flights = new ArrayList<>(initialFlights);
        setTitle("Flight Information System");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initializeComponents();
        populateFlightsArea();
    }

    private void initializeComponents() {
        mainPanel = new JPanel(new BorderLayout(5, 5));
        setContentPane(mainPanel);

        // Input fields panel
        JPanel formPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        // Initialize and add input fields and labels to formPanel
        airlineNameField = new JTextField(20);
        flightNumberField = new JTextField(20);
        originField = new JTextField(20);
        destinationField = new JTextField(20);
        airfareField = new JTextField(20);
        departureTimeField = new JTextField(20);
        arrivalTimeField = new JTextField(20);
        availableSeatsField = new JTextField(20);
        durationField = new JTextField(20);
        distanceField = new JTextField(20);

        Font textFieldFont = new Font("SansSerif", Font.PLAIN, 13); // Choose an appropriate font size

        airlineNameField.setFont(textFieldFont);
        flightNumberField.setFont(textFieldFont);
        originField.setFont(textFieldFont);
        destinationField.setFont(textFieldFont);
        airfareField.setFont(textFieldFont);
        departureTimeField.setFont(textFieldFont);
        arrivalTimeField.setFont(textFieldFont);
        availableSeatsField.setFont(textFieldFont);
        durationField.setFont(textFieldFont);
        distanceField.setFont(textFieldFont);


        // Inside your initializeComponents method, after initializing input fields

        addFormField(formPanel, "Airline Name:", airlineNameField);
        addFormField(formPanel, "Flight Number:", flightNumberField);
        addFormField(formPanel, "Departure City:", originField);
        addFormField(formPanel, "Destination City:", destinationField);
        addFormField(formPanel, "Airfare:", airfareField);
        addFormField(formPanel, "Departure Time (DD-MM-YYYY 00:00):", departureTimeField);
        addFormField(formPanel, "Arrival Time (DD-MM-YYYY 00:00):", arrivalTimeField);
        addFormField(formPanel, "Available Seats:", availableSeatsField);
        addFormField(formPanel, "Flight Duration (hr):", durationField);
        addFormField(formPanel, "Flight Distance (km):", distanceField);

        // Buttons panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        addButton = new JButton("Add Flight");
        addButton.addActionListener(this::addFlightAction);
        buttonPanel.add(addButton);

        sortButton = new JButton("Sort Flights");
        sortButton.addActionListener(this::sortFlightsAction);
        buttonPanel.add(sortButton);

        // Sorting options ComboBox
        sortOptions = new JComboBox<>(new String[]{"Flight Number", "Departure Time", "Arrival Time", "Airfare", "Duration", "Origin", "Available Seats"});
        buttonPanel.add(sortOptions);

        // Flights display area
        flightsArea = new JTextArea(10, 50);
        flightsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(flightsArea);

        // Add sub-panels to mainPanel
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
    }

    private void addFormField(JPanel panel, String labelText, JComponent field) {
        JLabel label = new JLabel(labelText);
        Font labelFont = new Font(label.getFont().getName(), Font.BOLD, 13); 
        label.setFont(labelFont);
        panel.add(label);
        panel.add(field);
    } 


    
    
    private void addFlightAction(ActionEvent e) {
        try {
            Flight flight = new Flight(
                airlineNameField.getText(),
                flightNumberField.getText(),
                originField.getText(),
                destinationField.getText(),
                Double.parseDouble(airfareField.getText()),
                departureTimeField.getText(),
                arrivalTimeField.getText(),
                Integer.parseInt(availableSeatsField.getText()),
                Double.parseDouble(durationField.getText()),
                Double.parseDouble(distanceField.getText())
            );
            flights.add(flight);
            System.out.println(flights);
            populateFlightsArea();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for airfare, available seats, duration, and distance.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void sortFlightsAction(ActionEvent e) {
        String selectedOption = (String) sortOptions.getSelectedItem();

         // Call the appropriate sorting method from Sorter
        switch (selectedOption) {
            case "Flight Number":
                Sorter.sortByFlightNumber(flights);
                break;
            case "Departure Time":
                Sorter.sortByDepartureTime(flights);
                break;
            case "Arrival Time":
                Sorter.sortByArrivalTime(flights);
                break;
            case "Airfare":
                Sorter.sortByAirfare(flights);
                break;
            case "Duration":
                Sorter.sortByDuration(flights);
                break;
            case "Origin":
                Sorter.sortByOrigin(flights);
                break;
            case "Available Seats":
                Sorter.sortByAvailableSeats(flights);
                break; 
            default:
                JOptionPane.showMessageDialog(this, "Sorting option not implemented.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        populateFlightsArea(); // Update the flightsArea after sorting
    }


    private void populateFlightsArea() {
        flightsArea.setText(""); // Clear the text area
        for (Flight flight : flights) {
            flightsArea.append(flight.toString() + "\n");
        }
    }

}
