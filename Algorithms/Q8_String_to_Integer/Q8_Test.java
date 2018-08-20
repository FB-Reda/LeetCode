/**
 * 
 * 
 * @author Franco B. Reda
 * 
 */
package Q8_String_to_Integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 *
 */
class Q8_Test {
	/**
	 * Example 1:
	 * 	Input: "42"
	 * 	Output: 42
	 * 
	 */
	@Test
	void test1() {
		String input = "42";
		int expected = 42;
		int result = Q8_Solution.myAtoi(input);
		assertEquals(expected,result);
	}
	
	/**
	 * Example 2:
	 * 	Input: "   -42"
	 * 	Output: -42
	 * 	Explanation: The first non-whitespace character is '-', which is the 
	 * 		minus sign. Then take as many numerical digits as possible, which 
	 * 		gets 42.
	 */
	@Test
	void test2() {
		String input = "   -42";
		int expected = -42;
		int result = Q8_Solution.myAtoi(input);
		assertEquals(expected,result);	}
	/**
	 * Example 3:
	 * 	Input: "4193 with words"
	 * 	Output: 4193
	 * 	Explanation: Conversion stops at digit '3' as the next character is not 
	 * 		a numerical digit.
	 */
	@Test
	void test3() {
		String input = "4193 with words";
		int expected = 4193;
		int result = Q8_Solution.myAtoi(input);
		assertEquals(expected,result);	}
	
	/**
	 * Example 4:
	 * 	Input: "words and 987"
	 * 	Output: 0
	 * 	Explanation: The first non-whitespace character is 'w', which is not a 
	 * 		numerical digit or a +/- sign. Therefore no valid conversion could 
	 * 		be performed.
	 */
	@Test
	void test4() {
		String input = "words and 987";
		int expected = 0;
		int result = Q8_Solution.myAtoi(input);
		assertEquals(expected,result);	}
	
	/**
	 * Example 5:
	 * 	Input: "-91283472332"
	 * 	Output: -2147483648
	 * 	Explanation: The number "-91283472332" is out of the range of a 32-bit 
	 * 		signed integer.Therefore INT_MIN (−231) is returned.
	 */
	@Test
	void test5() {
		String input = "-91283472332";
		int expected = -2147483648;
		int result = Q8_Solution.myAtoi(input);
		assertEquals(expected,result);	}
}
