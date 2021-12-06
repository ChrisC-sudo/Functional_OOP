package Inheritance;

import java.util.Scanner;

public class Inherit_three extends Inherit_two {
	public void chris_three() {
		try (Scanner username = new Scanner(System.in)) {
			System.out.println("Enter the Username:");
			String name = username.next();
			System.out.println("Hello chris_three:" + name);
		}
	}
}
