import java.util.Scanner;

public class GLabTask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pay rate per hour: ");
        double payRate = input.nextDouble();
        System.out.print("Enter hours worked per week: ");
        double hoursPerWeek = input.nextDouble();

        int weeks = 5;
        double grossIncome = payRate * hoursPerWeek * weeks;
        double taxes = grossIncome * 0.14;
        double netIncome = grossIncome - taxes;

        double clothes = netIncome * 0.10;
        double supplies = netIncome * 0.01;
        double remaining = netIncome - clothes - supplies;
        double savingsBonds = remaining * 0.25;
        double parentsBonds = savingsBonds * 0.50;

        System.out.printf("Income before taxes: $%.2f%n", grossIncome);
        System.out.printf("Income after taxes: $%.2f%n", netIncome);
        System.out.printf("Money spent on clothes: $%.2f%n", clothes);
        System.out.printf("Money spent on school supplies: $%.2f%n", supplies);
        System.out.printf("Money spent on savings bonds: $%.2f%n", savingsBonds);
        System.out.printf("Parents' savings bonds: $%.2f%n", parentsBonds);
    }
}
