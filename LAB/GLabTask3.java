import java.util.Scanner;

public class GLabTask3 {

    public static void main(String[] args) {

        // Scanner object
        Scanner console = new Scanner(System.in);

        // Named constants
        final int SECRET = 11;
        final double RATE = 12.50;

        // Variable declarations
        int num1, num2, newNum;
        String name;
        double hoursWorked, wages;

        // Input two integers
        System.out.print("Enter num1: ");
        num1 = console.nextInt();

        System.out.print("Enter num2: ");
        num2 = console.nextInt();

        // Output num1 and num2
        System.out.println("The value of num1 = " + num1 +
                " and the value of num2 = " + num2);

        // Calculate newNum
        newNum = (num1 * 2) + num2;
        System.out.println("The value of newNum = " + newNum);

        // Update newNum using SECRET
        newNum = newNum + SECRET;
        System.out.println("After adding SECRET, newNum = " + newNum);

        // Input name
        System.out.print("Enter last name: ");
        name = console.next();

        // Input hours worked
        System.out.print("Enter hours worked: ");
        hoursWorked = console.nextDouble();

        // Calculate wages
        wages = RATE * hoursWorked;

        // Final output
        System.out.println("Employee name: " + name);
        System.out.println("Wages = " + wages);
    }
}