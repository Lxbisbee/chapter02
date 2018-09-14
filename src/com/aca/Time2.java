package com.aca;

public class Time2 {

	public static void main(String[] args) {
		int currentHour = 20;
		int currentMinute = 9;
		int currentSecond = 13;
		
		System.out.println("The current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + ".");
		
		float minutesSinceMidnight = currentHour * 60 + currentMinute;
		System.out.println("Number of minutes since Midnight: " + minutesSinceMidnight);
		
		float secondsSinceMidnight = minutesSinceMidnight *60 + currentSecond;
		System.out.println("Number of seconds since Midnight: " + secondsSinceMidnight);
		
		//This was what I used when I thought the day ended at 11:59:59 instead of thinking about 24 hours in a day
		float x = 24f; //12:00:00pm
		float y = 0f;	//00:00:00 minutes
		float z = 0f;	//00:00:00 seconds
		float numberOfMinutesInADay = x * 60 + y;	//calculates number of minutes from midnight to 12:00:00
		float numberOfSecondsInADay = numberOfMinutesInADay * 60 + z; //calculates number of seconds from midnight to 12:00:00
		
		System.out.println("Number of seconds in a day: " + numberOfSecondsInADay);
		System.out.println("Number of seconds remaining in the day: " + (numberOfSecondsInADay - secondsSinceMidnight));
		
		float percentOfDay = secondsSinceMidnight / 86400 *100;
		System.out.println("The percentage of the day that has passed is: " + percentOfDay + "%");
		
		int startHour = 18;
		int startMinute = 43;
		int startSecond = 30;
		float startTotalInMinutes = startHour * 60 + startMinute;
		float startTotalInSeconds = startTotalInMinutes * 60 + startSecond;
		float elapsedInSeconds = secondsSinceMidnight - startTotalInSeconds;
		float elapsedInMinutes = elapsedInSeconds / 60;
		float elapsedInHours = elapsedInMinutes / 60;
		System.out.println("\nElapsed time (in seconds) since starting: " + elapsedInSeconds);
		System.out.println("Elapsed time (in minutes) since starting: " + elapsedInMinutes);
		System.out.println("Elapsed time (in hours) since starting: " + elapsedInHours);
		
		int elapsedHour = currentHour - startHour;
		int elapsedMinute = currentMinute - startMinute;
		int elapsedSecond = currentSecond - startSecond;
	
		String elapsedTime = "\nElapsed time since starting the project:\nHours: " + elapsedHour + "; Minutes: " + elapsedMinute + "; Seconds: " + elapsedSecond;
		System.out.println(elapsedTime.replace("-", ""));
	}

}

