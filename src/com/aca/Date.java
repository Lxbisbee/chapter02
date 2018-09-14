package com.aca;

public class Date {

	public static void main(String[] args) {
		String american = "American Format: ";
		String euro = "European Format: ";
		String day = "Thursday";
		int date = 26;
		String month = "July";
		int year = 2018;
		
		//System.out.println(american);
		//System.out.println(day);
		//System.out.println(date);
		//System.out.println(month);
		//System.out.println(year);
		
		System.out.println(american +"\n" + day + ", " + month + " " + date + ", " + year);
		
		System.out.println(euro + "\n" + day + " " + date + " " + month + " " + year);
	}

}
