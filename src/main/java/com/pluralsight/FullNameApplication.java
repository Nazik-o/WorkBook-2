package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String person;
//use text shorten the space method
        System.out.println("Please enter your first  name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("First name: " + firstName);

        System.out.println("Enter your Middle name (or press Enter to skip) : ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Enter your Suffix (or press Enter to skip): ");
        String suffix = scanner.nextLine().trim();


        String fullName = firstName;
        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }


        System.out.println("Full name :"  + suffix + " " +  firstName + " " + middleName + " " + lastName);

        scanner.close();
    }

}
