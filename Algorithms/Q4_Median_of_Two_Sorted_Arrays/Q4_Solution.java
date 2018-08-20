package Q4_Median_of_Two_Sorted_Arrays;

/**
 * 4. Median of Two Sorted Arrays
 * 
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity 
 * should be O(log (m+n)).
 * You may assume nums1 and nums2 cannot be both empty.
 *
 */

public class Q4_Solution {
	
	/**
	 * @param int[] nums1 of size m
	 * @param int[] nums2 of size n
	 * 
	 * @return double median
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		
		int i = 0, j = 0, k = 0;
		int[] combined = new int[m+n];
		while (i<m && j <n)
		{
			/** Check if current element of first array is smaller than current 
			 * element of second array. If yes, store first array element and 
			 * increment first array index. Otherwise do same with second array
			 */
			if (nums1[i] < nums2[j])
				combined[k++] = nums1[i++];
			else
				combined[k++] = nums2[j++];
		}
		// Store remaining elements of first array
		while (i < m)
			combined[k++] = nums1[i++];
		
		// Store remaining elements of second array
		while (j < n)
			combined[k++] = nums2[j++];
		
		if (combined.length % 2 == 0) 
			return (combined[((combined.length-1) / 2)] + combined[((combined.length) / 2)]) /2.0;
		else
			return combined[((combined.length-1) / 2)];
	}
}
