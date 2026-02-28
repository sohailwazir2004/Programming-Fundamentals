import java.util.Scanner;

public class GLabTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students (N): ");
        int N = input.nextInt();
        System.out.print("Enter number of apples (K): ");
        int K = input.nextInt();

        int applesPerStudent = K / N;
        int remaining = K % N;

        System.out.println(applesPerStudent);
        System.out.println(remaining);
    }
}
