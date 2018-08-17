package Q1_Two_Sum;

import java.util.Arrays;

/**
 * 1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.  You may assume that each input would have 
 * exactly one solution, and you may not use the same element twice.
 * 
 * 
 * @author Franco Reda
 *
 */

public class Q1_Two_Sum {
	
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target - nums[i] == nums[j])
					return new int[] {i, j};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	/*
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] ans = twoSum(nums, target);
		System.out.println("Hello");
		System.out.println(Arrays.toString(ans));
	}*/

}
