package com.yedam.classes.statics;

public class CalExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.pi = 2.2;
		
		Calculator.pi = 3.14;
		Calculator.sum(45, 55);
	}//end of main
}//end of class
