package com.in.P05;

import java.util.Arrays;

public class Array_05 {
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		int carry = 1;

		for (int i = n - 1; i >= 0; i--) {
			digits[i] += carry;

			if (digits[i] == 10) {
				digits[i] = 0;
				carry = 1;
			} else {
				carry = 0;
				break;
			}
		}

		if (carry == 1) {
			int[] result = new int[n + 1];
			result[0] = 1;
			return result;
		}

		return digits;
	}

	public static void main(String[] args) {

		int[] digits = { 1, 2, 3 };
		int[] result = plusOne(digits);
		System.out.println(Arrays.toString(result));
	}

}
