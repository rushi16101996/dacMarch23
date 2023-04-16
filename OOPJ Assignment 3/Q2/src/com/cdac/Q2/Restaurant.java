package com.cdac.Q2;

import java.util.Scanner;

class Update{
	static Scanner sc= new Scanner(System.in);
	private int index;
	private Dish[]arr;
	
	public Update() {
		this(3);
	}
	
	public Update(int i) {
		this.arr = new Dish[i];
	}
	
	public void addNewDish(Dish dish) {
		if(index<this.arr.length) {
			this.arr[index]= dish;
			index= index +1;
		}
		
	}

	public boolean removeDish(String dishName) {
		for(int index = 0; index<arr.length; index++) {
			if(this.arr[index]!=null && this.arr[index].getDishName().equals(dishName)) {
				this.arr[index]=null;
				return true;
			}
		}
		return false;
	}

	public void viewMenu() {
		for(Dish dh : this.arr) {
			if(dh !=null) {
			System.out.println(dh);	
			}
		}
	}

	public void editPrice(String dishName) {
		System.out.println("Enter new price : ");
		float newPrice=sc.nextFloat();
		for(int index = 0; index<arr.length; index++) {
			if(this.arr[index]!=null && this.arr[index].getDishName().equals(dishName)) {
				arr[index].setPrice(newPrice);
				break;
			}
	}
	}
	
}

class Dish{
	private String dishName;
	private float price;
	
	public Dish() {
		// TODO Auto-generated constructor stub
	}
	
	public Dish(String dishName, float price) {
		super();
		this.dishName = dishName;
		this.price = price;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish =" + getDishName()+ "  " + "Price =" + getPrice() ;
	}
	
}

public class Restaurant {
	static Scanner sc=new Scanner(System.in);
	private static void acceptRecord(Dish dish) {
		System.out.println("Enter the new name of dish : ");
		sc.nextLine();
		dish.setDishName(sc.nextLine());
		System.out.println("Enter price for the dish : ");
		dish.setPrice(sc.nextFloat());
	}
	private static int menuList() {
		System.out.println("Press 1. To view current menu and prices");
		System.out.println("Press 2. To add new dish to menu");
		System.out.println("Press 3. To remove a dish from menu");
		System.out.println("Press 4. To modify the price of a dish on the menu");
		System.out.println("Press 0. To Exit");
		return sc.nextInt();
	}


	public static void main(String[] args) {
		int choice;
		Update update=new Update();
		while((choice=Restaurant.menuList())!=0) {
			switch(choice) {
			case 1:
				update.viewMenu();
				break;
			case 2:
				Dish dish=new Dish();
				Restaurant.acceptRecord(dish);
				update.addNewDish(dish);
				break;
			case 3:
				System.out.println("Enter name of dish to remove :");
				sc.nextLine();
				boolean removed = update.removeDish(sc.nextLine());
				System.out.println(removed ? "Dish is removed" : "Dish not found");	
				break;				
			case 4:
				System.out.println("Enter name of dish to edit price :");
				sc.nextLine();
				update.editPrice(sc.nextLine());
				break;
			}
	}
}
}
