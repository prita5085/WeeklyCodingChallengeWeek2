package com.revature;

import java.util.Scanner;

public class AlmostPalindrome {

	public static void main(String[] args) {
		String str = "1234312";
		if (almostPalindrome(str))

			System.out.println("True");
		else
			System.out.println("False");

	}

	static boolean almostPalindrome(String str) {
		int totalLength = str.length();
		int count = 0;

		for (int i = 0; i < totalLength / 2; ++i)

			if (str.charAt(i) != str.charAt(totalLength - i - 1))
				++count;
		return (count<=1);
	}

}
