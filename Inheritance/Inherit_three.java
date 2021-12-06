package Inheritance;

import java.util.Scanner;

public class Inherit_three extends Inherit_two {
	public void chr_three() {
		try (Scanner username = new Scanner(System.in)) {
			System.out.println("Enter the Username:");
			String name = username.next();
			System.out.println("Hello chr_three:" + name);
		}
	}
}
