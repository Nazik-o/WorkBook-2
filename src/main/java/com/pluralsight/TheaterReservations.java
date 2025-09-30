package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine().trim();
        System.out.println("Please enter your last name: ");
        String userLastName = scanner.nextLine().trim();

        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String dateStr = scanner.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateStr, fmt);

        System.out.println("How many tickets would you like? : ");
        int ticket = scanner.nextInt();

        if (ticket > 2){
            System.out.println(ticket + " tickets" + " tickets reserved for " + dateStr + " under " + userLastName + ","  + userName);
        }
        else {
            System.out.println(ticket + " ticket reserved for " + dateStr + " under " + userLastName + ","  + userName);
        }

        scanner.close();
    }
}
