package main.java.com.kata;

import static main.java.com.kata.enumerations.FooBarEnum.*;

public class FooBar {
	
	public String computeFooBar(int number) {
		if(number % 3 == 0 && number % 5 == 0 ) {
			return FOO_BAR.getLabel();
		}
		if(number % 3 == 0) {
			return FOO.getLabel();
		}
		if(number % 5 == 0) {
			return BAR.getLabel();
		}
		return String.valueOf(number);
	}
}
