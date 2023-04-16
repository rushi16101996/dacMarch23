package com.cdac.main;

import java.util.Scanner;

public class MovieTheatre {
	static Scanner sc=new Scanner(System.in);
	private static int menuList() {
         System.out.println("Enter choice :");
         System.out.println("1 - To view Seating Chart");
         System.out.println("2 - To reserve Seats");
         System.out.println("3 - To view Sales Report");
         System.out.println("0 - Exit");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		while((choice=MovieTheatre.menuList())!=0) {
			switch (choice) {
            case 1:
                Booking.displaySeats();
                break;
            case 2:
                Booking.reserveSeats();
                break;
            case 3:
                Booking.displaySalesReport();
                break;
            default:
                System.out.println("Invalid option");
        }
		}

	}
}
