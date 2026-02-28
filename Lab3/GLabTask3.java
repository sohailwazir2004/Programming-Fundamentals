import java.util.Scanner;

public class GLabTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter students in class 1: ");
        int a = input.nextInt();
        System.out.print("Enter students in class 2: ");
        int b = input.nextInt();
        System.out.print("Enter students in class 3: ");
        int c = input.nextInt();

        int desks = (a + 1) / 2 + (b + 1) / 2 + (c + 1) / 2;
        System.out.println("Minimum desks needed: " + desks);
    }
}
