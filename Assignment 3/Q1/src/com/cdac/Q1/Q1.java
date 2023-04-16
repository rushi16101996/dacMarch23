package com.cdac.Q1;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	
	private static void acceptRecord(int arr[]) {
		Scanner sc= new Scanner(System.in);
		if(arr!=null) {
			System.out.println("Please enter numbers");
			for(int index=0;index<arr.length;++ index) {
				arr[index]=sc.nextInt();
			}
		}
	}
	private static void printRecord(int arr[]) {
		int sum=0;
		int max=arr[0];
		int min=arr[0];
		if(arr!=null) {
			System.out.println("Contents of array : ");
			for(int index=0;index<arr.length;index++) {
				System.out.println(arr[index]);
			}
			
			for(int index=0;index<arr.length;index++) {
				sum=sum+arr[index];
			}
			System.out.println("Sum of array : "+sum);
			
			System.out.println("Average of array : "+(sum/arr.length));
			
			for(int index=0;index<arr.length;index++) {
				if(max<arr[index]) {
					max=arr[index];
				}
			}
			System.out.println("Largest element in array : "+max);
			
			for(int index=0;index<arr.length;index++) {
				if(min>arr[index]) {
					min=arr[index];
				}
			}
			System.out.println("Smallest element in array : "+min);
			
			Arrays.sort(arr);
	        System.out.println("\nThe sorted array is: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter size of array");
		int arr[]=new int[sc.nextInt()];
		Q1.acceptRecord(arr);
		Q1.printRecord(arr);

	}
}
