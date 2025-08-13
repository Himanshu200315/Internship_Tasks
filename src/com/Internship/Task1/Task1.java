package com.Internship.Task1;

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter the number for Checking Even or Odd: ");
		a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}

		sc.close();

	}

}
