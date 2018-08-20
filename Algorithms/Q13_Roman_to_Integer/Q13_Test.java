package Q13_Roman_to_Integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Q12_Integer_to_Roman.Q12_Solution;

class Q13_Test {

	/**
	 * Example 1:
	 * 	Input: "III"
	 * 	Output: 3
	 */
	@Test
	void test1() {
		String input = "III";
		int expected = 3;
		
		int result = Q13_Solution.romanToInt(input);
		assertEquals(expected, result);
	}
	/** 
	 * Example 2:
	 * 	Input: "IV"
	 * 	Output: 4
	 */
	@Test
	void test2() {
		String input = "IV";
		int expected = 4;
		
		int result = Q13_Solution.romanToInt(input);
		assertEquals(expected, result);
	}
	/**
	 * Example 3:
	 * 	Input: "IX"
	 * 	Output: 9
	 */
	@Test
	void test3() {
		String input = "IX";
		int expected = 9;
		
		int result = Q13_Solution.romanToInt(input);
		assertEquals(expected, result);
	}
	/** 
	 * Example 4:
	 * 	Input: "LVIII"
	 * 	Output: 58
	 * 
	 * 	Explanation: C = 100, L = 50, XXX = 30 and III = 3.
	 */
	@Test
	void test4() {
		String input = "LVIII";
		int expected = 58;
		
		int result = Q13_Solution.romanToInt(input);
		assertEquals(expected, result);
	}
	/** 
	 * Example 5:
	 * 	Input: "MCMXCIV"
	 * 	Output: 1994
	 * 
	 * 	Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	 */
	@Test
	void test5() {
		String input = "MCMXCIV";
		int expected = 1994;
		
		int result = Q13_Solution.romanToInt(input);
		assertEquals(expected, result);
	}

}
