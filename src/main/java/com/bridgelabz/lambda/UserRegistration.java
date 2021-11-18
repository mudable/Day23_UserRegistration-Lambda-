package com.bridgelabz.lambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public boolean Name(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public boolean LastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public boolean Email(String email) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean Number(String number) {
		String regex = "91\\s[0-9]{10}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(number);
		return matcher.matches();
	}

	public boolean Password(String pass) {
		String regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pass);
		return matcher.matches();
	}
}
