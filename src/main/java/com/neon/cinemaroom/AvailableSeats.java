package com.neon.cinemaroom;

import java.util.Arrays;

public class AvailableSeats {

    private final char[] SEATS = new char[100];

    //Initialize array SEATS only once to avoid overriding then call createCinemaRoom() to create and display Cinema
    public void initArraySeats(){
        Arrays.fill(SEATS, 'A');
    }

    public void createCinemaRoom(){

        // Print column headers (1 to 10)
        System.out.print("   "); // Space for row labels
        for(int col = 1; col <= 10; col++){
            System.out.print(col + "  ");
        }
        System.out.println();

        // Print rows with seats (A to J)
        for(int row = 0; row < 10; row++){
            // Print row label (A, B, C...)
            char rowLabel = (char)('A' + row);
            System.out.print(rowLabel + "  ");

            // Print seats
            for(int col = 0; col < 10; col++){
                int index = (row * 10) + col;
                System.out.print(SEATS[index] + "  "); // 'A' for available
            }
            System.out.println(); // New line after each row
        }

        System.out.println();
    }

    public char[] getSeats(){
        return SEATS;
    }
}


