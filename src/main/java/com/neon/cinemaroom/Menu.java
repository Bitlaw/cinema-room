package com.neon.cinemaroom;

import java.util.Scanner;

public class Menu {

    public static void pickOption() {

        int choice;

        SellTicket sellTicket = new SellTicket();

        Scanner input = new Scanner(System.in);
        System.out.println("Select one of the following options:");
        System.out.println();
        System.out.println("1. Sell a ticket");
        System.out.println("2. Refund a ticket");
        System.out.println("3. Show statistics");
        System.out.println("4. Check for other rooms");
        System.out.println("5. Quit the menu");
        System.out.println();
        System.out.println("Enter a number: ");

        choice = input.nextInt();

        switch(choice) {
            case 1:
                sellTicket.ticket();
                break;
            case 2:
                System.out.println("Refund a ticket");
                break;
            case 3:
                System.out.println("Show statistics");
                break;
            default:
                System.out.println("Invalid option! Please enter a number between 1-5.");
                //Call the menu again or handle the error
                pickOption(); // Recursive call to show menu again
                break;
        }
        System.out.println();

    }

}




