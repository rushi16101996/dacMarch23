package com.cdac.main;

import java.util.Scanner;

public class Booking {
	static Scanner sc=new Scanner(System.in);
	private static int rows = 10;
    private static int cols = 10;
    private static double ticketPrice = 200.00;
    private static int numSeatsSold = 0;
    private static double revenue = 0;
    private static int[][] seats = new int[rows][cols];
		
		public static void displaySeats() {
			System.out.println("Seating Chart:");
	        System.out.println("0 - Available");
	        System.out.println("1 - Sold");

	        for (int row = 0; row < rows; row++) {
	            for (int col = 0; col < cols; col++) {
	                System.out.print(seats[row][col] + " ");
	            }
	            System.out.println();
	        }
		}

		public static void reserveSeats() {
			System.out.println("How many seats would you like to reserve?");
	        int numSeatsToReserve = sc.nextInt();

	        int[] selectedRowNumbers = new int[numSeatsToReserve];
	        int[] selectedColNumbers = new int[numSeatsToReserve];

	        for (int i = 0; i < numSeatsToReserve; i++) {
	            System.out.printf("Enter seat %d row number: ", i + 1);
	            int row = sc.nextInt() - 1;
	            System.out.printf("Enter seat %d column number: ", i + 1);
	            int col = sc.nextInt() - 1;

	            if (isValidSeat(row, col) && isSeatAvailable(row, col)) {
	                selectedRowNumbers[i] = row;
	                selectedColNumbers[i] = col;
	            } else {
	                System.out.println("Invalid seat selection. Please try again.");
	                return;
	            }
	        }

	        int reservationNumber = generateReservationNumber();
	        double price = numSeatsToReserve * ticketPrice;

	        for (int i = 0; i < numSeatsToReserve; i++) {
	            int row = selectedRowNumbers[i];
	            int col = selectedColNumbers[i];

	            seats[row][col] = 1;
	        }

	        numSeatsSold += numSeatsToReserve;
	        revenue += price;

	        System.out.println("Reservation successful!");
	        System.out.printf("Reservation Number: %d%n", reservationNumber);
	        System.out.printf("Total cost: Rs%.2f%n", price);
		}
		
		private static int generateReservationNumber() {
	        return (int) (Math.random() * 1000);
	    }

	    private static boolean isValidSeat(int row, int col) {
	        return row >= 0 && row < rows && col >= 0 && col < cols;
	    }

	    private static boolean isSeatAvailable(int row, int col) {
	        return seats[row][col] == 0;
	    }

		public static void displaySalesReport() {
			int numSeatsAvailable = rows * cols - numSeatsSold;
	        double totalRevenue = numSeatsSold * ticketPrice;

	        System.out.println("Sales Report:");
	        System.out.printf("Number of seats sold: %d%n", numSeatsSold);
	        System.out.printf("Number of seats available: %d%n", numSeatsAvailable);
	        System.out.printf("Total revenue: Rs%.2f%n", totalRevenue);
		}
}
