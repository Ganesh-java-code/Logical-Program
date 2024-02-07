package in.ganesh.test;

import java.util.Scanner;

public class CandiesAndWrappers {

//    Prob1: A shop sells a candy for Rs 2 per piece and there is an offer that you can claim a candy for 4 wrappers.
//    Given an initial amount to you, calculate how many candies can you buy from that money
    public static void main(String[] args) {

        // Define candy price and wrappers required for free candy
        int candyPrice = 2;
        int wrappersForFreeCandy = 4;

        // Get initial amount from user
        System.out.print("Enter the amount you have (in rupees): ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        // Calculate candies bought with money
        int candiesFromMoney = money / candyPrice;

        // Initialize wrappers collected
        int wrappers = candiesFromMoney;

        // Keep buying candies with wrappers until there are no more wrappers
        while (wrappers >= wrappersForFreeCandy) {
            // Calculate candies bought with wrappers
            int candiesFromWrappers = wrappers / wrappersForFreeCandy;

            // Add candies bought with wrappers to the total
            candiesFromMoney += candiesFromWrappers;

            // Update remaining wrappers
            wrappers = (wrappers % wrappersForFreeCandy) + candiesFromWrappers;
        }

        // Print the total number of candies
        System.out.println("You can buy " + candiesFromMoney + " candies.");

    }
}
