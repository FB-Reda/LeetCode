/**
 * 
 * 
 * @author Franco B. Reda
 * 
 */
package Q5_Longest_Palindromic_Substring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

/**
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 */
class Q5_Test {
	/**
	 * Input: "babad"
	 * Output: "bab"
	 * Note: "aba" is also a valid answer.
	 */
	@SuppressWarnings("deprecation")
	@Test
	void test() {
		String input = "babad";
		String expected = "bab";
		String expected2 = "aba";
		
		String result = Q5_Solution.longestPalindrome(input);
		
		System.out.println(result);
		System.out.println(expected2.compareTo(result));
		assertEquals(result, expected2);
	}
	
	/**
	 * Input: "cbbd"
	 * Output: "bb"
	 */
	
	@Test
	void test2() {
		String input = "cbbd";
		String expected = "bb";
		String result = Q5_Solution.longestPalindrome(input);
		
		assertEquals(result, expected);
	}

}
