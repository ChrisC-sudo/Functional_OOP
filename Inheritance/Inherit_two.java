package Inheritance;

import java.util.Scanner;

public class Inherit_two extends Inherit_one {
	public void chr_two() {
		try (Scanner digit = new Scanner(System.in)) {
			System.out.println("Enter the Digit:");
			int n = digit.nextInt();
			System.out.println("Hello chr_two:" +n);
		}
	}

}
