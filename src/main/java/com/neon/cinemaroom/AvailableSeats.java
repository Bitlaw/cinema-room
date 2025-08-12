package com.neon.cinemaroom;

import java.util.Arrays;

public class AvailableSeats {

    private char[] seats = new char[100];


    public AvailableSeats() {

    }

    public void displayAllSeat(){
        System.out.println();
        System.out.println("These are all the available seats you can select from:");
        System.out.println();

        Arrays.fill(seats, 'A');

        // Print column headers (1-10)
        System.out.print("   "); // Space for row labels
        for(int col = 1; col <= 10; col++){
            System.out.print(col + "  ");
        }
        System.out.println();

        // Print rows with seats
        for(int row = 0; row < 10; row++){
            // Print row label (A, B, C...)
            char rowLabel = (char)('A' + row);
            System.out.print(rowLabel + "  ");

            // Print seats
            for(int col = 0; col < 10; col++){
                int index = (row * 10) + col;
                System.out.print(seats[index] + "  "); // 'A' for available
            }
            System.out.println(); // New line after each row
        }

        System.out.println();
    }

    public char[] getSeats(){
        return seats;
    }
}


