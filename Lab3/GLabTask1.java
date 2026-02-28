import java.util.Scanner;

public class GLabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double (e.g., 11.56): ");
        double amount = input.nextDouble();
        int remainingCents = (int)(amount * 100);

        int dollars = remainingCents / 100;
        remainingCents = remainingCents % 100;

        int quarters = remainingCents / 25;
        remainingCents = remainingCents % 25;

        int dimes = remainingCents / 10;
        remainingCents = remainingCents % 10;

        int nickels = remainingCents / 5;
        remainingCents = remainingCents % 5;

        int pennies = remainingCents;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println("  " + dollars + " dollars");
        System.out.println("  " + quarters + " quarters");
        System.out.println("  " + dimes + " dimes");
        System.out.println("  " + nickels + " nickels");
        System.out.println("  " + pennies + " pennies");
    }
}
