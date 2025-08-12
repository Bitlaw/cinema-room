package com.neon.cinemaroom;

import java.util.Scanner;

public class SellTicket {

    private String seatNumber;

    public void ticket() {

        AvailableSeats seats = new AvailableSeats();
        seats.displayAllSeat();

        System.out.println("Choose a seat: ");
        Scanner input = new Scanner(System.in);
        seatNumber = input.next();
        if (!seatNumber.matches("[A-J](10|[1-9])")) {
            // Invalid format
        }
        else{
            System.out.println("Invalid input!, only enter characters from A to J and numbers from 1 to 10");
            ticket();
            System.out.println();
        }

        System.out.println(seatNumber);



    }

}


