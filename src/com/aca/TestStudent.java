package com.aca;

public class TestStudent {

	public static void main(String[] args) {

		Student student = new Student();
		String name = student.getName();
		System.out.println("value of name is: " + name);
		
		name = student.getFullName("Bisbee");
		System.out.println("Value of name is: " + name);
		
		System.out.println(System.out);
		
	}

}
