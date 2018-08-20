package Q4_Median_of_Two_Sorted_Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Q4_Test {

	@SuppressWarnings("deprecation")
	@Test
	void testEvenInput() {
		int[] nums1 = {1, 2}; int[] nums2 = {3, 4};
		double expectedMedian = 2.5;
		
		double actualMedian;
		actualMedian = Q4_Solution.findMedianSortedArrays(nums1, nums2);
		System.out.println(actualMedian);
		Assert.assertEquals(expectedMedian, actualMedian);
	}
	
	@Test
	void testOddInput() {
		int[] nums1 = {1, 3}; int[] nums2 = {2};
		double expectedMedian = 2.0;
		
		double actualMedian;
		actualMedian = Q4_Solution.findMedianSortedArrays(nums1, nums2);
		Assert.assertEquals(expectedMedian, actualMedian);
	}

}
