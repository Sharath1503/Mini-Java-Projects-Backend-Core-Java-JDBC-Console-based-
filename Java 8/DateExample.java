package com.java8.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		LocalDate Specificdate = LocalDate.of(2024, 3, 26);
		
		System.out.println("Today Date:"+today);
		System.out.println("Specific Date:"+Specificdate);
		
		LocalTime now = LocalTime.now();
		LocalTime Specifictime = LocalTime.of(14,30);
		
		System.out.println("\nCurrent Time:"+now);
		System.out.println("Sprecic Time:"+Specifictime);
		
		LocalDateTime now1 = LocalDateTime.now();
		LocalDateTime specificdatetime = LocalDateTime.of(2024,3,26,12,00);
		System.out.println("\nToday's Date and Time:"+now1);
		System.out.println("Specific Date and time:"+specificdatetime);
		
		Instant now2 = Instant.now();
		System.out.println("\n"+now2);
		
		LocalTime Starttime = LocalTime.of(11,00);
		LocalTime Endtime = LocalTime.of(13,10);
		Duration duration = Duration.between(Starttime, Endtime);
		System.out.println("\nDuration:"+duration);
		
		LocalDate Startdate = LocalDate.of(2023,11,26);
		LocalDate Enddate = LocalDate.of(2024,6,14);
		Period period = Period.between(Startdate, Enddate);
		System.out.println("\nPeriod:"+period);
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatteddate = date.format(formatter);
		System.out.println("\nFormatted Date:"+formatteddate);
		
		String datestring = "01/01/2020";
				LocalDate parseddate = LocalDate.parse(datestring, formatter);
				System.out.println("Parsed Date :"+parseddate);

	}

}
