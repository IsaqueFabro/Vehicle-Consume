package Main;

import java.util.Locale;
import java.util.Scanner;
import Model.Vehicle;

public class main {

    public static void main(String[] args) {
        // create a new Vehicle object
        Vehicle car = new Vehicle();

        // scanner for user input
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // use dot as decimal separator

        // get distance from user
        System.out.print("Enter the distance traveled in kilometers: ");
        car.setDistance(scanner.nextDouble());

        // get fuel amount from user
        System.out.print("Enter the amount of fuel used in liters: ");
        car.setFuel(scanner.nextDouble());

        // display fuel consumption in Km/L
        System.out.printf("The vehicle's fuel consumption is %.1f Km/L%n", car.getConsumption());
    }
}