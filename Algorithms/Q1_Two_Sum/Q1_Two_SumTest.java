package Q1_Two_Sum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Q1_Two_SumTest {

	@Test
	void testTwoSum() {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int [] expectedResult = {0, 1};
		int[] result = Q1_Two_Sum.twoSum(nums, target);
		Assert.assertArrayEquals(result, expectedResult);
	}

}
