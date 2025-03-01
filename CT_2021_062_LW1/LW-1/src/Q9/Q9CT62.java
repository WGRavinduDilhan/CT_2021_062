package Q9;

import java.util.Scanner;

public class Q9CT62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int length = input.length();

        if (length > 0) {

            char firstChar = input.charAt(0);
            char lastChar = input.charAt(length - 1);

            System.out.println(length);
            System.out.println(firstChar);
            System.out.println(lastChar);
        } else {
            System.out.println("The string is empty.");
        }

        scanner.close();
    }
}
