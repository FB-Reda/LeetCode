package Q12_Integer_to_Roman;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q12_Test {
	
	/**
	 * Example 1:
	 * 	Input: 3
	 * 	Output: "III"
	 */
	@Test
	void test1() {
		int input = 3;
		
		String expected = "III";
		String result = Q12_Solution.intToRoman(input);
		
		assertEquals(expected, result);
	}
	/** 
	 * Example 2:
	 * 	Input: 4
	 * 	Output: "IV"
	 */
	@Test
	void test2() {
		int input = 4;
		
		String expected = "IV";
		String result = Q12_Solution.intToRoman(input);
		
		assertEquals(expected, result);
	}
	/**
	 * Example 3:
	 * 	Input: 9
	 * 	Output: "IX"
	 */
	@Test
	void test3() {
		int input = 9;
		
		String expected = "IX";
		String result = Q12_Solution.intToRoman(input);
		
		System.out.println(expected);
		System.out.println(result);
		assertEquals(expected, result);
	}
	/** 
	 * Example 4:
	 * 	Input: 58
	 * 	Output: "LVIII"
	 * 
	 * 	Explanation: C = 100, L = 50, XXX = 30 and III = 3.
	 */
	@Test
	void test4() {
		int input = 58;

		String expected = "LVIII";
		String result = Q12_Solution.intToRoman(input);
		
		assertEquals(expected, result);
	}
	/** 
	 * Example 5:
	 * 	Input: 1994
	 * 	Output: "MCMXCIV"
	 * 
	 * 	Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	 */
	@Test
	void test5() {
		int input = 1994;

		String expected = "MCMXCIV";
		String result = Q12_Solution.intToRoman(input);
		
		assertEquals(expected, result);
	}
	
	@Test
	void rightByYourSide() {
		int input = 3005;

		String expected = "MMMV";
		String result = Q12_Solution.intToRoman(input);
		
		assertEquals(expected, result);
	}
	
	@Test
	void deltron() {
		int input = 3030;

		String expected = "MMMXXX";
		String result = Q12_Solution.intToRoman(input);
		
		assertEquals(expected, result);
	}
	
}
