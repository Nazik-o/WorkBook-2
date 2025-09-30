package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask for the full game score in one line
        System.out.print("Please enter a game score (e.g., Home:Visitor|21:9): ");
        String input = scanner.nextLine().trim();

        // Split into two parts: team names and scores
        String[] mainParts = input.split("\\|");

        // Split the left part for teams
        String[] teamParts = mainParts[0].split(":");
        String team1 = teamParts[0].trim();
        String team2 = teamParts[1].trim();

        // Split the right part for scores
        String[] scoreParts = mainParts[1].split(":");
        int score1 = Integer.parseInt(scoreParts[0].trim());
        int score2 = Integer.parseInt(scoreParts[1].trim());


        if ( score1 > score2){
            System.out.println("Team: " + team1 + " WINS");
        }
        else if ( score1 < score2){
            System.out.println("Team: " + team2 + "WINS!");
        }
        else {
            System.out.println("It's a tie between " + team1 + " and " + team2);
        }


        scanner.close();
    }
}
