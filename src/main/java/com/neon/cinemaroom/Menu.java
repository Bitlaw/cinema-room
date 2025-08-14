package com.neon.cinemaroom;

import java.util.Scanner;

public class Menu {

    public static void pickOption() {

        SellTicket sellTicket = new SellTicket();

        System.out.println("Select one of the following options:");
        System.out.println();
        System.out.println("1. Sell a ticket");
        System.out.println("2. Refund a ticket");
        System.out.println("3. Show statistics");
        System.out.println("4. Check for other rooms");
        System.out.println("5. Quit the menu");
        System.out.println();
        System.out.println("Enter a number: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        //input.close();

        switch(choice) {
            case 1:
                sellTicket.arraySeatsFill();
                break;
            case 2:
                System.out.println("Refund a ticket");
                break;
            case 3:
                System.out.println("Show statistics");
                break;
            default:
                System.out.println("Invalid option!, please enter a number between 1-5.");
                System.out.println();
                // Recursive call to show menu again
                pickOption();
                break;
        }

    }

}




