package com.bridgelabz.lambda;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean Email(String name) {
		boolean check = Pattern
				.matches("([a-zA-Z0-9-_]{3,})[a-zA-Z0-9.-_]*[@][a-zA-Z0-9]*[a-zA-Z0-9.-_]{3,}[a-zA-Z0-9.-_]*", name);
		return check;
	}
}