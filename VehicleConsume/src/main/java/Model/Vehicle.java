package Model;

public class Vehicle {

    // distance in kilometers
    private double distance;
    
    // fuel in liters
    private double fuel;

    // default constructor
    public Vehicle() {
        this(0, 0);
    }

    // constructor with parameters
    public Vehicle(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    // get distance
    public double getDistance() {
        return distance;
    }

    // set distance
    public void setDistance(double distance) {
        this.distance = distance;
    }

    // get fuel
    public double getFuel() {
        return fuel;
    }

    // set fuel
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    // calculate fuel consumption in Km/L
    public double getConsumption() {
        return (getDistance() / getFuel());
    }
}