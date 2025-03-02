package Q10;

import java.util.Scanner;

public class Q10CT62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an odd-length word:");
        String input = scanner.nextLine();

        int length = input.length();

        if (length % 2 != 0) {
            int middleIndex = length / 2;
            char middleChar = input.charAt(middleIndex);

            System.out.println(middleChar);
        } else {
            System.out.println("The input word does not have an odd length.");
        }

        scanner.close();
    }
}
