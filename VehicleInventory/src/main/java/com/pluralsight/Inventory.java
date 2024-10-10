package com.pluralsight;

import java.util.Scanner;

public class Inventory {

    static Scanner input = new Scanner(System.in);
    static Vehicle[] vehicles = new Vehicle[20]; // declare an array that can hold 20 element
    static int vehicleCount = 0; // Counter variable to track how many vehicles are in the array

    public static void main(String[] args) {

        // Preload the array with 6 vehicles
        vehicles[vehicleCount++] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[vehicleCount++] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[vehicleCount++] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[vehicleCount++] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[vehicleCount++] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[vehicleCount++] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        // Main loop
        while (true) {
            System.out.println("\nWelcome to \"Vehicle Inventory!\" How can I help you?");
            System.out.println("1 - List all vehicles\n" +
                    "2 - Search by make/model\n" +
                    "3 - Search by price range\n" +
                    "4 - Search by color\n" +
                    "5 - Add a vehicle\n" +
                    "6 - Quit");
            System.out.print("Enter [ 1 - 6 ] to access a window: ");
            int userSelect = input.nextInt();

            // Conditions based on the user input
            switch (userSelect) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByModel();
                    break;
                case 3:
                    findVehiclesByPrice();
                    break;
                case 4:
                    findVehiclesByColor();
                    break;
                case 5:
                    addVehicle();
                    break;
                case 6:
                    System.out.println("Thank you for using the Vehicle Inventory System. Goodbye!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid selection. Please enter a number between 1 and 6.");
            }
        }
    }

    //method designed to display a list of vehicles
    private static void listAllVehicles() {
        // Print table header
        System.out.printf("%5s %29s %22s %25s %17s\n", "ID", "MAKE/MODEL", "COLOR", "ODOMETER", "PRICE");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        // Loop through the array and display each element
        for (int i = 0; i < vehicleCount; i++) {
            System.out.printf("%5s %30s %20s %24s %20.2f\n",
                    vehicles[i].getVehilceID(),
                    vehicles[i].getMakeModel(),
                    vehicles[i].getColor(),
                    vehicles[i].getOdometerReading(),
                    vehicles[i].getPrice());
        }
    }

    // Method designed to add a new vehicle to array
    private static void addVehicle() {
        // Check if the array is full
        if (vehicleCount >= vehicles.length) {
            System.out.println("Inventory is full. Cannot add more vehicles.");
            return;
        }
        // prompt user for vehicle details
        System.out.print("Enter vehicle ID: ");
        int id = input.nextInt();
        input.nextLine(); // Consume newline after input
        System.out.print("Enter make/model: ");
        String makeModel = input.nextLine();
        System.out.print("Enter color: ");
        String color = input.nextLine();
        System.out.print("Enter odometer reading: ");
        int odometer = input.nextInt();
        System.out.print("Enter price: ");
        float price = input.nextFloat();

        // declare a new 'Vehicle' object and add it to the array
        vehicles[vehicleCount++] = new Vehicle(id, makeModel, color, odometer, price);
        System.out.println("Vehicle added successfully!");
    }

    // Method designed to search for vehicles by color
    private static void findVehiclesByColor() {
        System.out.print("Enter color to search for: ");
        String color = input.next();
        boolean found = false;  //declare a variable to track if any vehicles match the search

        // Print table header
        System.out.printf("%5s %29s %22s %25s %17s\n", "ID", "MAKE/MODEL", "COLOR", "ODOMETER", "PRICE");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        // Loop thru the array to find vehicles matching the color
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getColor().equalsIgnoreCase(color)) {
                System.out.printf("%5s %30s %20s %24s %20s\n",
                        vehicles[i].getVehilceID(),
                        vehicles[i].getMakeModel(),
                        vehicles[i].getColor(),
                        vehicles[i].getOdometerReading(),
                        vehicles[i].getPrice());
                found = true;
            }
        }
        // If no match is found
        if (!found) {
            System.out.println("No vehicles found with color: " + color);
        }
    }

    // Method designed to search for vehicles by price range
    private static void findVehiclesByPrice() {
        System.out.print("Enter minimum price: ");
        double minPrice = input.nextDouble();
        System.out.print("Enter maximum price: ");
        double maxPrice = input.nextDouble();
        boolean found = false;

        // Print table header
        System.out.printf("%5s %29s %22s %25s %17s\n", "ID", "MAKE/MODEL", "COLOR", "ODOMETER", "PRICE");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        // Loop thru the array to find vehicles matching the price range
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getPrice() >= minPrice && vehicles[i].getPrice() <= maxPrice) {
                System.out.printf("%5s %30s %20s %24s %20s\n",
                        vehicles[i].getVehilceID(),
                        vehicles[i].getMakeModel(),
                        vehicles[i].getColor(),
                        vehicles[i].getOdometerReading(),
                        vehicles[i].getPrice());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found in the price range: " + minPrice + " - " + maxPrice);
        }
    }
    // Method designed to search for vehicles by model
    private static void findVehiclesByModel() {
        System.out.print("Enter make/model to search for: ");
        input.nextLine(); // Consume newline
        String makeModel = input.nextLine();
        boolean found = false;

        // Print table header
        System.out.printf("%5s %29s %22s %25s %17s\n", "ID", "MAKE/MODEL", "COLOR", "ODOMETER", "PRICE");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        // Loop thru the array to find vehicles matching the make/model
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getMakeModel().equalsIgnoreCase(makeModel)) {
                System.out.printf("%5s %30s %20s %24s %20s\n",
                        vehicles[i].getVehilceID(),
                        vehicles[i].getMakeModel(),
                        vehicles[i].getColor(),
                        vehicles[i].getOdometerReading(),
                        vehicles[i].getPrice());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found for make/model: " + makeModel);
        }
    }

}