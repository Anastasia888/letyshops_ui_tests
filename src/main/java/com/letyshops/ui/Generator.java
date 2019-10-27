package com.letyshops.ui;

public class Generator {
	
	public static int generateNumber(int max) {
		return (int) (Math.random() * ++max);
	}
	
	public static String generateEmail() {
	    return "rik" + generateNumber(90) + "@imailto.net";
	} 
	  
}
