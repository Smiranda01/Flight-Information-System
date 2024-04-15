package model;

public class Flight {
    // Mandatory attributes
    private String airlineName;
    private String flightNumber;
    private String flightOrigin;
    private String flightDestination;
    private double airfare;
    private String departureTime;
    private String arrivalTime;
    
    // Optional attributes 
    private int availableSeats;
    private double flightDuration; // in hours
    private double distance; // in kilometers

    // Constructor
    public Flight(String airlineName, String flightNumber, String flightOrigin, String flightDestination,
                  double airfare, String departureTime, String arrivalTime, int availableSeats,
                  double flightDuration, double distance) {
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
        this.airfare = airfare;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
        this.flightDuration = flightDuration;
        this.distance = distance;
    }

    // Getters and Setters
    // Airline Name
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    // Flight Number
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    // Flight Origin
    public String getFlightOrigin() {
        return flightOrigin;
    }

    public void setFlightOrigin(String flightOrigin) {
        this.flightOrigin = flightOrigin;
    }

    // Flight Destination
    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    // Airfare
    public double getAirfare() {
        return airfare;
    }

    public void setAirfare(double airfare) {
        this.airfare = airfare;
    }

    // Departure Time
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    // Arrival Time
    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    // Available Seats
    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Flight Duration
    public double getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(double flightDuration) {
        this.flightDuration = flightDuration;
    }

    // Distance
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        if (flightDuration > 1 ) {
            return "Flight " +
            "Airline Name = " + airlineName +
            ", Flight Number = " + flightNumber + 
            ", Flight Origin = " + flightOrigin + 
            ", Flight Destination = " + flightDestination + 
            ", Airfare = $" + airfare +
            ", Departure Time = " + departureTime + 
            ", Arrival Time = " + arrivalTime + 
            ", Available Seats = " + availableSeats + 
            ", Flight Duration = " + flightDuration + " hrs" +
            ", Distance = " + distance + " kms" ; 
        } else {
            return "Flight: " +
            "Airline Name = " + airlineName +
            ", Flight Number = " + flightNumber + 
            ", Flight Origin = " + flightOrigin + 
            ", Flight Destination = " + flightDestination + 
            ", Airfare = $" + airfare +
            ", Departure Time = " + departureTime + 
            ", Arrival Time = " + arrivalTime + 
            ", Available Seats = " + availableSeats + 
            ", Flight Duration = " + flightDuration + " hr" +
            ", Distance = " + distance + " km" ; 
        }
        
    }

}

