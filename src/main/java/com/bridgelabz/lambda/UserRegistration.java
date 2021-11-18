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

		Validation LastName = () -> {
			System.out.println("Enter Last name :: ");
			String lastName = sc.next();
			return userReg.Name(lastName);
		};
		System.out.println(LastName.validate());
		Validation Email = () -> {
			System.out.println("Enter Email ID :: ");
			String EmailId = sc.next();
			return userReg.Email(EmailId);
		};
		System.out.println(Email.validate());
	}

	private boolean Name(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	private boolean LastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	private boolean Email(String email) {
		String regex ="^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
