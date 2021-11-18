package com.bridgelabz.lambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validation {
	boolean validate();
}

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);
	static UserRegistration userReg = new UserRegistration();

	public static void main(String[] args) {
		Validation FirstName = () -> {
			System.out.println("Enter first name :: ");
			String firstName = sc.next();
			return userReg.Name(firstName);
		};
		System.out.println(FirstName.validate());
	}

	private boolean Name(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	
}
