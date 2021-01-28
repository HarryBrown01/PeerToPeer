package PeerPackage;

import java.util.Scanner;

public class Doggo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner pos = new Scanner(System.in);
		System.out.println("Please enter position: ");
		int num1 = pos.nextInt();

		for (int i = 1; i <= 100; i++) {

			if (i != num1) {
				System.out.println(ordinal(i));

			}

		}

	}

	public static String ordinal(int i) {
		String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
		switch (i % 100) {
		case 11:
		case 12:
		case 13:
			return i + "th";
		default:
			return i + suffixes[i % 10];
		}
	}
}
