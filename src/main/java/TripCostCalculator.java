import java.util.Scanner;

public class TripCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the number of kilometers to travel: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the fuel price per liter: ");
        double fuelPrice = scanner.nextDouble();

        // Calculate total cost
        double totalCost = calculateCost(distance, 5.0, fuelPrice);

        // Display the result
        System.out.printf("Total trip cost: %.2f%n", totalCost);

        scanner.close();
    }

    public static double calculateCost(double distance, double fuelConsumptionRate, double fuelPrice) {
        if (distance <= 0 || fuelConsumptionRate <= 0 || fuelPrice <= 0) {
            return 0;
        }
        double fuelNeeded = (distance / 100) * fuelConsumptionRate;
        return fuelNeeded * fuelPrice;
    }
}