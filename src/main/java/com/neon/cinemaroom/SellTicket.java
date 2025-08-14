package com.neon.cinemaroom;

import java.util.Scanner;


public class SellTicket {

    AvailableSeats seats = new AvailableSeats();

    //Try to chane this later, lookS too redundant with initArraySeats()!
    public void arraySeatsFill(){
        seats.initArraySeats();
        showAvailableSeats();
    }

    public void showAvailableSeats(){
        System.out.println();
        System.out.println("These are all the available seats you can select from:");
        System.out.println();
        seats.createCinemaRoom();
        provideTicket();
    }

    public void provideTicket() {

        System.out.println("Choose a seat: ");
        Scanner input = new Scanner(System.in);
        String seatSelected = input.next();
       // input.close();

        // Extract the row letter (first character), then convert it to a number
        char rowSeatChar = seatSelected.charAt(0);
        int rowSeatCharToInt = rowSeatChar - 'A';
        // Extract the column number (everything after the first character), then convert it to a number
        String colSeatString = seatSelected.substring(1);
        int colSeaStringToInt = Integer.parseInt(colSeatString);
        // Calculate array index, -1 since array count goes from 0 to 9
        int arrayIndex = (rowSeatCharToInt * 10) + (colSeaStringToInt - 1);


        //Check for valid seat inputs seats colum A to J and row 1 to 9
        if (!seatSelected.matches("[A-J](10|[1-9])")) {
            System.out.println("Invalid input!, only enter characters from A to J and numbers from 1 to 10");
            System.out.println();
        } else if (seats.getSeats()[arrayIndex] == 'B') {
            System.out.println("Seat is already booked");
           // System.out.println();

        } else{

            seats.getSeats()[arrayIndex] = 'B';
            System.out.println("Seat booked");
        }

       whatToDoNext();

    }

    public void whatToDoNext(){

        System.out.println();
        System.out.println("What would you like to do next?");
        System.out.println();
        System.out.println("1. Book another seat");
        System.out.println("2. Return to main Menu");
        System.out.println("3. Quit");
        System.out.println();
        System.out.println("Enter a number: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        //input.close();

        switch(choice){
            case 1:
                showAvailableSeats();
                break;
            case 2:
                System.out.println("To build!");
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid input!");
                whatToDoNext();
        }
    }

}


