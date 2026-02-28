import java.util.Scanner;

public class GLabTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total milk produced (liters): ");
        double totalMilk = input.nextDouble();

        double cartonCapacity = 3.78;
        double costPerLiter = 0.38;
        double profitPerCarton = 0.27;

        int cartons = (int) Math.ceil(totalMilk / cartonCapacity);
        double cost = totalMilk * costPerLiter;
        double profit = cartons * profitPerCarton;

        System.out.println("Number of cartons: " + cartons);
        System.out.printf("Cost of producing milk: $%.2f%n", cost);
        System.out.printf("Profit: $%.2f%n", profit);
    }
}
