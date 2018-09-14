package com.aca;

public class IntExtremes {

	public static void main(String[] args) {
		
		//This exercise demonstrates the limits of what a variable of type int 
		//can store and the result of trying to going outside this range.
		//ALL DATA TYPES HAVE LIMITS
		
		int positiveInt = 2_147_483_647;
		System.out.println(positiveInt);
		
		positiveInt = positiveInt+1;
		System.out.println(positiveInt);

		int negativeInt = -2_147_483_648;
		System.out.println(negativeInt);

		negativeInt = negativeInt - 1;
		System.out.println(negativeInt);
		


	}

}
