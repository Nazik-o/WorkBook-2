package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your  full name: ");
        String fullName = scanner.nextLine().trim();
        // Split by spaces
        String[] parts = fullName.split("\\s+");

        String firstName = " ";
        String middleName = "(none)";
        String lastName = " ";

        if (parts.length == 2) {
            //first last
            firstName = parts[0];
            lastName = parts[1];
        } else if (parts.length == 3) {
            // first middle last
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            System.out.println("Invalid name format. Please enter either 'first last' or 'first middle last'.");
            scanner.close();
            return;
        }


        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}
