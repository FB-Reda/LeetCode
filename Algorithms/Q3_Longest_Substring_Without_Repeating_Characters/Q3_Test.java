package Q3_Longest_Substring_Without_Repeating_Characters;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

/**
 * Examples:
 * 	Given "abcabcbb", the answer is "abc", which the length is 3.
 * 	Given "bbbbb", the answer is "b", with the length of 1.
 * 	Given "pwwkew", the answer is "wke", with the length of 3. Note that the 
 * 	answer must be a substring, "pwke" is a subsequence and not a substring.
 */
class Q3_Test {

	@Test
	void testLengthOfLongestSubstring() {
		String input = "abcabcbb";
		String result = "abc";
		int length = 3;
		
		Assert.assertTrue( length  == Q3_Solution.lengthOfLongestSubstring(input));
	}
	
	@Test
	void testTwo() {
		String input = "bbbbb";
		String result = "b";
		int length = 1;
		
		Assert.assertTrue( length  == Q3_Solution.lengthOfLongestSubstring(input));
	}
	
	@Test
	void testThree() {
		String input = "pwwkew";
		String result = "wke";
		int length = 3;
		
		Assert.assertTrue( length  == Q3_Solution.lengthOfLongestSubstring(input));
	}
	
	@Test
	void testFour() {
		String input = "pwwkew";
		String result = "pwke";
		int length = 4;
		
		Assert.assertFalse( length  == Q3_Solution.lengthOfLongestSubstring(input));
	}

}
