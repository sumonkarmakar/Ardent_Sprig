package com.javat;

public class PrintableFactory {
	public Printable getPrintable() {
		// return new B();
		return new A();// return any one instance, either A or B
	}
}
