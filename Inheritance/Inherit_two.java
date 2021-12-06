package Inheritance;

import java.util.Scanner;

public class Inherit_two extends Inherit_one {
	public void chris_two() {
		try (Scanner digit = new Scanner(System.in)) {
			System.out.println("Enter the Digit:");
			int n = digit.nextInt();
			System.out.println("Hello chris_two:" +n);
		}
	}

}
