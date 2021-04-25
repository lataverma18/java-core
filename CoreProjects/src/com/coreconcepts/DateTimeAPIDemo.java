package com.coreconcepts;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;


public class DateTimeAPIDemo {
public static void display(int []arr)
{
	for(int temp:arr)
		System.out.println(temp);
}
	public static void main(String[] args) {
		
		/*
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
		System.out.println(ZonedDateTime.now(ZoneId.of("Australia/ACT")));*/
		/*
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		LocalDate ld=LocalDate.of(1990, 10, 18);
		LocalDate ld1=LocalDate.of(1990, 11, 27);
		
		Period p=Period.between(ld, ld1);
		System.out.println(p.getYears());
		
		System.out.println("Next Day is"+ld.plusWeeks(4));
		System.out.println(ld.isLeapYear());
		System.out.println(ld.withDayOfMonth(2));
		System.out.println(LocalTime.of(10,45));
*/		
		//Formatting & Parsing
		/*System.out.println("Enter the date in 'yyyy/mm/dd' format");
		String date=new Scanner(System.in).nextLine();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(dtf.parse(date));*/
		
		DateTimeFormatter dtf1=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL	);
		LocalDate ld=LocalDate.now();
		System.out.println(ld.format(dtf1));
	}
}
