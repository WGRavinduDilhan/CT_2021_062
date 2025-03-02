package Q8;

import java.util.Scanner;

public class Q8CT62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input a string that contains a single exclamation mark:");
        String input = scanner.nextLine();

        int index = input.indexOf('!');

        if (index != -1) {
            String part1 = input.substring(0, index).trim();
            String part2 = input.substring(index + 1).trim();

            System.out.println(part1);
            System.out.println(part2);
        } else {
            System.out.println("The input does not have an exclamation mark.");
        }
        scanner.close();
    }
}
