package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        //user input:
        System.out.println("Please provide the following information:(press enter/tab to see)");
        System.out.println("Full name: ");
        String fullName = scanner.nextLine().trim();

        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine().trim();

        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine().trim();

        System.out.println("Billing State: ");
        String billingState = scanner.nextLine().toUpperCase();


        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine();


        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine().toUpperCase();

        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        /*
        //Display the output:
        System.out.println(fullName + "\n");
        //space needed
        System.out.println("Billing Address :\n" + billingStreet + billingCity + "," + billingState + billingZip);
        //space
        System.out.println("Shipping Address:\n " + shippingStreet + shippingCity + "," + shippingState + shippingZip);
*/
        sb.append(fullName).append("\n")
                .append("Billing Address:\n")
                .append(billingStreet).append("\n")
                .append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n")
                .append("Shipping Address:\n")
                .append(shippingStreet).append("\n")
                .append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        // Display
        System.out.println("\nCustomer Information:");
        System.out.println(sb.toString());





    }
}
