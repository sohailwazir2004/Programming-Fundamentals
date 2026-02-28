import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double price, tax, total;
        final double TAX_RATE = 0.06;
        System.out.print("Enter the item price: ");
        price = keyboard.nextDouble();
        tax = price * TAX_RATE;
        total = price + tax;
        System.out.println("Price: $" + price);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
