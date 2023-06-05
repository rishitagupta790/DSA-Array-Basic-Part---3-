package com.in.P07;

import java.util.ArrayList;
import java.util.List;

public class Array_07 {
	public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
		List<String> result = new ArrayList<>();

		int next = lower;

		for (int num : nums) {
			if (num > next) {
				result.add(formatRange(next, num - 1));
			}
			next = num + 1;
		}

		if (next <= upper) {
			result.add(formatRange(next, upper));
		}

		return result;
	}

	private static String formatRange(int start, int end) {
		if (start == end) {
			return String.valueOf(start);
		} else {
			return start + "->" + end;
		}
	}

	public static void main(String[] args) {
		int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> result = findMissingRanges(nums, lower, upper);
        System.out.println(result);
	}

}
