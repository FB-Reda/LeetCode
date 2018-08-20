/**
 * 
 * 
 * @author Franco B. Reda
 * 
 */
package Q9_Palindrome_Number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 *
 */
class Q9_Test {

	
	/**
	 * Example 1:
	 * 	Input: 121
	 * 	Output: true
	 */
	@Test
	void test1() {
		int input = 121;
		boolean expected = true;
		
		boolean result = Q9_Solution.isPalindrome(input);
		assertTrue(expected == result);
	}
	
	
	/**
	 * Example 2:
	 * 	Input: -121
	 * 	Output: false
	 * 	Explanation: From left to right, it reads -121. From right to left, it 
	 * 		becomes 121-. Therefore it is not a palindrome.
	 */
	@Test
	void negativeTest() {
		int input = -121;
		boolean expected = false;
		
		boolean result = Q9_Solution.isPalindrome(input);
		assertTrue(expected == result);
		}
	
	
	/**
	 * Example 3:
	 * 	Input: 10
	 * 	Output: false
	 * 	Explanation: Reads 01 from right to left. Therefore it is not a 
	 * 	palindrome.
	 */
	@Test
	void twoDigitTest() {
		int input = 10;
		boolean expected = false;
		
		boolean result = Q9_Solution.isPalindrome(input);
		assertTrue(expected == result);
	}
	

}
