package Q11;

import java.util.Scanner;

public class Q11CT62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name (First Middle Last):");
        String input = scanner.nextLine().trim();

        String[] nameParts = input.split(" ");

        if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        } else {
            System.out.println("Name format is wrong. Please enter in 'First Middle Last' format.");
        }

        scanner.close();
    }
}
