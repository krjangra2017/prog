import java.util.Scanner;

public class OddNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Accept elements from user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print only odd numbers
        System.out.println("Odd numbers in the array are:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
