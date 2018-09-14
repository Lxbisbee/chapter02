package com.aca;

public class Withdrawal {

	public static void main(String[] args) {

		//This exercise calls for the student to create a simple program to 
		//tell an ATM how many bills of each denomination to dispense for a withdrawal.
		
		int withdrawal = 137;
		System.out.println("Now Dispensing $" + withdrawal + "...");
		System.out.println("$100" + "(" + (withdrawal/100) + ")");
		withdrawal = withdrawal % 100;
		System.out.println("$50 " + "(" + (withdrawal/50) + ")");
		withdrawal = withdrawal % 50;
		System.out.println("$20 " + "(" + (withdrawal/20) + ")");
		withdrawal = withdrawal % 20;
		System.out.println("$10 " + "(" + (withdrawal/10) + ")");
		withdrawal = withdrawal % 10;
		System.out.println("$5  " + "(" + (withdrawal/5) + ")");
		withdrawal = withdrawal % 5;
		System.out.println("$1  " + "(" + (withdrawal/1) + ")");
		System.out.println("Have a nice day!");

	}

}
//		withdrawal = withdrawal % 1;
//		System.out.println(".25 " + "(" + (withdrawal/.25) + ")");
//		withdrawal = withdrawal % .25;
//		System.out.println(".10 " + "(" + (withdrawal/.1) + ")");
//		withdrawal = withdrawal % .1;
//		System.out.println(".05 " + "(" + (withdrawal/.05) + ")");
//		withdrawal = withdrawal % .05;
//		System.out.println(".01 " + "(" + (withdrawal/.01) + ")");