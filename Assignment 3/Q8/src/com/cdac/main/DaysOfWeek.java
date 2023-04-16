package com.cdac.main;

import java.util.Arrays;

public class DaysOfWeek {
	public enum DayOfWeek {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void printDay(DayOfWeek day) {
		System.out.println(day.name());
	}

	public static DayOfWeek getNextDay(DayOfWeek day) {
		int ordinal = day.ordinal();
		int nextOrdinal = (ordinal + 1) % DayOfWeek.values().length;
		return DayOfWeek.values()[nextOrdinal];
	}

	public static int getDayNumber(DayOfWeek day) {
		return day.ordinal() + 1;
	}

	public static DayOfWeek[] getWeekendDays() {
		return new DayOfWeek[] { DayOfWeek.SATURDAY, DayOfWeek.SUNDAY };
	}

	public static void main(String[] args) {
		
		DayOfWeek day = DayOfWeek.MONDAY;
		
		System.out.print("Day of the week : ");
		DaysOfWeek.printDay(day);
		day = DaysOfWeek.getNextDay(day);
		
	
		System.out.print("Next day : ");
		DaysOfWeek.printDay(day); 
		int dayNumber = DaysOfWeek.getDayNumber(day);
		
		System.out.print("Day Number : ");
		System.out.println(dayNumber);
		DayOfWeek[] weekendDays = DaysOfWeek.getWeekendDays();
		
		System.out.print("Weekend Days : ");
		System.out.println(Arrays.toString(weekendDays)); 
	}
}

