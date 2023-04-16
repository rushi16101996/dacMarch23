package com.cdac.main;

import java.util.Scanner;

public class Organization {
	static Scanner sc= new Scanner(System.in);
	private SalesPerson[] salesPersonsArr;
    {
	}

	public Organization() {
		salesPersonsArr = new SalesPerson[15];

	
	}

	public SalesPerson[] getSalesPersonsArr() {
		return salesPersonsArr;
	}

	public void setSalesPersonsArr(SalesPerson[] salesPersonsArr) {
		this.salesPersonsArr = salesPersonsArr;
	}

	public void viewAllSalesPersons() {
		for (SalesPerson person : salesPersonsArr) {
			System.out.println(person);
		}
	}

	public void addSalesPerson(SalesPerson person) {
		System.out.println(salesPersonsArr.length);
		for (int i = 0; i < salesPersonsArr.length; i++) {
			if (salesPersonsArr[i] == null) {
				person.setId(i + 1);
				salesPersonsArr[i] = person;
				System.out.println("Sales Person added successfully.");
				System.out.println();
				System.out.println("| IMPORTANT |  Please remember your ID  !");	
				System.out.println(person);
				return;
			}
		}
		System.out.println("Oraganisation capacity is full !!");
	}

	public void updateSaleFigures(int id) {
		SalesPerson person= findSalesPerson(id);
		if(person==null) return;
		
		for(int i=0;i<person.getSalesFigures().length;i++) {
			System.out.print("Sales Figures for month "+i+" before :   "+person.getSalesFigures()[i]);
			System.out.print(" After (enter): ");
			person.getSalesFigures()[i]=sc.nextDouble();
			System.out.println();
		}
	
	}

	public SalesPerson findSalesPerson(int id) {
		for (int i = 0; i < salesPersonsArr.length; i++) {
             if(salesPersonsArr[i]!=null    && salesPersonsArr[i].getId()==id) {
            	 return salesPersonsArr[i];
             }
		}
		
		System.out.println("Sales Person with id "+id +" not found !!");
		return null;
	}


	public void calculateSalesOfAll() {
		for(int i=0;i<salesPersonsArr.length;i++) {
			if(salesPersonsArr[i]!=null) {
				System.out.println(salesPersonsArr[i].getName()+"	Total Sales Figure :	"+salesPersonsArr[i].calculateTotalFigs()	);
				
				}
		   
		}
	}
}
