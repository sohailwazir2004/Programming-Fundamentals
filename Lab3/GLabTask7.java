import java.util.Scanner;

public class GLabTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Class A tickets sold: ");
        int classA = input.nextInt();
        System.out.print("Enter Class B tickets sold: ");
        int classB = input.nextInt();
        System.out.print("Enter Class C tickets sold: ");
        int classC = input.nextInt();
        System.out.print("Enter Class D tickets sold: ");
        int classD = input.nextInt();

        double incomeA = classA * 20;
        double incomeB = classB * 15;
        double incomeC = classC * 10;
        double incomeD = classD * 5;
        double total = incomeA + incomeB + incomeC + incomeD;

        System.out.println("Income from Class A: $" + incomeA);
        System.out.println("Income from Class B: $" + incomeB);
        System.out.println("Income from Class C: $" + incomeC);
        System.out.println("Income from Class D: $" + incomeD);
        System.out.println("Total Income: $" + total);
    }
}
