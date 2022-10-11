package org.phone;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("phonenumber=");
		String phonenumber = s.next();

		int check = phonenumber.length();

		if (check <= 10) {
			System.out.println("valid number");

		} else {
			System.out.println("invalid number");
		}

	}
}
