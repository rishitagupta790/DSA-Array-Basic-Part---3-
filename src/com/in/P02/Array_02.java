package com.in.P02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_02 {

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue; // Skip duplicates for the first element
			}

			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue; // Skip duplicates for the second element
				}

				int left = j + 1;
				int right = nums.length - 1;

				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

						// Skip duplicates for the third element
						while (left < right && nums[left] == nums[left + 1]) {
							left++;
						}

						// Skip duplicates for the fourth element
						while (left < right && nums[right] == nums[right - 1]) {
							right--;
						}

						left++;
						right--;
					} else if (sum < target) {
						left++; // Sum is smaller, move left pointer to increase sum
					} else {
						right--; // Sum is larger, move right pointer to decrease sum
					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		List<List<Integer>> quadruplets = fourSum(nums, target);
		System.out.println("Unique Quadruplets:");
		for (List<Integer> quad : quadruplets) {
			System.out.println(quad);
		}
	}

}
