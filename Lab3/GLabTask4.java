import java.util.Scanner;

public class GLabTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes since midnight (N): ");
        int N = input.nextInt();

        int hours = N / 60;
        int minutes = N % 60;

        System.out.println(hours + " " + minutes);
    }
}
