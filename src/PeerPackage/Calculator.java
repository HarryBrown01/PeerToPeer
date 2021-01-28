package PeerPackage;

import java.util.Scanner;

public class Calculator {
	public static void method1(int num1, int num2, int num3) {
		if (num1 * num2 == num3) {
			System.out.println(num1 + "*" + num2 + "=" + num3);
		}
		if (num1 + num2 == num3) {
			System.out.println(num1 + "+" + num2 + "=" + num3);
		}
		if (num1 - num2 == num3) {
			System.out.println(num1 + "-" + num2 + "=" + num3);
		}
		if (num1 / num2 == num3) {
			System.out.println(num1 + "/" + num2 + "=" + num3);
		}
	}
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		@SuppressWarnings("resource")
		Scanner scanObject = new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		num1 = scanObject.nextInt();
		System.out.println("Please enter number 2: ");
		num2 = scanObject.nextInt();
		System.out.println("Please enter number 3: ");
		num3 = scanObject.nextInt();		
		
		method1(num1, num2, num3);
		method1(num1, num3, num2);
		method1(num2, num1, num3);
		method1(num2, num3, num1);
		method1(num3, num1, num2);
		method1(num3, num2, num1);
	}	
}
