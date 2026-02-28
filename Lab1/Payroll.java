import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double payRate, grossPay;
        int hours;
        System.out.print("How many hours did you work? ");
        hours = keyboard.nextInt();
        System.out.print("What is your hourly pay rate? ");
        payRate = keyboard.nextDouble();
        if (hours > 40) {
            grossPay = (40 * payRate) + ((hours - 40) * payRate * 1.5);
        } else {
            grossPay = hours * payRate;
        }
        System.out.println("Your gross pay is $" + grossPay);
    }
}
