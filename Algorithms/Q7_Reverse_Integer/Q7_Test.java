/**
 * 
 * 
 * @author Franco B. Reda
 * 
 */
package Q7_Reverse_Integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
 *
 */
class Q7_Test {

	/**
	 * Example 1
	 * 
	 * Input: 123
	 * Output: 321
	 */
	@Test
	void test1() {
		int input = 123;
		int expected = 321;
		int result = Q7_Solution.reverse(input);
		System.out.println(result);

		assertEquals(expected, result);
	}
	
	/**
	 * Example 2
	 * 
	 * Input: -123
	 * Output: -321
	 */
	@Test
	void test2() {
		int input = -123;
		int expected = -321;
		int result = Q7_Solution.reverse(input);
		System.out.println(result);

		assertEquals(expected, result);
	}
	
	/**
	 * Example 3
	 * 
	 * Input: 120
	 * Output: 21
	 */
	@Test
	void test3() {
		int input = 120;
		int expected = 21;
		int result = Q7_Solution.reverse(input);
		System.out.println(result);
		assertEquals(expected, result);
	}
	
	/**
	 * Input: 1534236469
	 * Expected: 0 
	 */
	@Test
	void boundsTest() {
		int input = 1534236469;
		int expected = 0;
		int result = Q7_Solution.reverse(input);
		System.out.println("BoundsTest Result: " + result);
		assertEquals(expected, result);
	}
}
