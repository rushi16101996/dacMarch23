package com.cdac.main;
import java.util.Scanner;

public class Q7 {
	static Scanner sc=new Scanner(System.in);
	
	private static int menuList() {
		System.out.println("1. For Addition of 2 matrix");
		System.out.println("2. For Subtraction of 2 matrix");
		System.out.println("3. For Multiplication of 2 matrix");
		System.out.println("4. For Transpose of 2 matrix");
		System.out.println("0. To Exit");
		return sc.nextInt();
	}
	private static int[][] acceptRecord1(int[][] arr1) {
		System.out.println("Enter data elements : ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		return arr1;
	}
	private static int[][] acceptRecord2(int[][] arr2) {
		System.out.println("Enter data elements : ");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		return arr2;
	}
	private static void addition(int[][] arr1, int[][] arr2) {
		int res[][] = new int [3][3];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				res[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		Q7.printRecord(res);
	}
	private static void subtraction(int[][] arr1, int[][] arr2) {
		int res[][] = new int [3][3];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				res[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
		Q7.printRecord(res);
	}
	private static void multiplication(int[][] arr1, int[][] arr2) {
		int res[][] = new int [3][3];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				res[i][j]=arr1[i][j]*arr2[i][j];
			}
		}
		Q7.printRecord(res);
	}
	private static void transpose(int[][] arr1, int[][] arr2) {
		int res[][] = new int [3][3];
		  {
		        int i, j;
		        for (i = 0; i < arr1.length; i++)
		            for (j = 0; j < arr1.length; j++)
		                res[i][j] = arr1[j][i];		    
		}
		Q7.printRecord(res);
	}
	private static void printRecord(int[][] arr) {
		if( arr != null ) {
			for( int row = 0; row < arr.length; ++ row ) {
				for( int col = 0; col < arr[ row ].length; ++ col ) {
					System.out.print(arr[ row ][ col ]+"	");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		operation o1=new operation();
		System.out.println("Enter no of rows :");
		int row=sc.nextInt();
		System.out.println("Enter no of coloumns :");
		int col=sc.nextInt();
		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		Q7.acceptRecord1(arr1);
		Q7.acceptRecord2(arr2);
		int choice;
        while ((choice=Q7.menuList())!=0) {
            switch (choice) {
                case 1:
                	Q7.addition(arr1,arr2);
                    break;
                case 2:
                	Q7.subtraction(arr1, arr2);
                    break;
                case 3:
                	Q7.multiplication(arr1, arr2);
                    break;
                case 4:
                	Q7.transpose(arr1,arr2);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } 
	}
}
