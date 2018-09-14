package com.aca;

public class Time {

	public static void main(String[] args) {
		int hour = 1;
		int minute = 1;
		int second = 1;
		
		System.out.println("The current time is: " + hour + ":" + minute + ":" + second + ".");
		
		int minutesSinceM = hour * 60 + minute;
		System.out.println("Number of minutes since Midnight: " + minutesSinceM);
		
		int secondsSinceM = minutesSinceM *60 + second;
		System.out.println("Number of seconds since Midnight: " + secondsSinceM);
		
		int x = 23; //11:00:00pm
		int y = 59;	//00:59:00 minutes
		int z = 59;	//00:00:59 seconds
		
		int endOfDayMinutes = x * 60 + y;	//calculates number of minutes from midnight to 11:59:59
		int endOfDaySeconds = endOfDayMinutes * 60 + z; //calculates number of seconds from midnight to 11:59:59
		
		System.out.println("Number of seconds in a day: " + endOfDaySeconds);
		
		System.out.println("Number of seconds remaining in the day: " + (endOfDaySeconds - secondsSinceM));
		
		
		
	}

}
