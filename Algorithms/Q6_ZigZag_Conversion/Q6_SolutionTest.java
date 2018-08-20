/**
 * 
 * 
 * @author Franco B. Reda
 * 
 */
package Q6_ZigZag_Conversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 *
 */
class Q6_SolutionTest {

	/**
	 * Input: s = "PAYPALISHIRING", numRows = 3
	 * Output: "PAHNAPLSIIGYIR"
	 * P   A   H   N
	 * A P L S I I G
	 * Y   I   R
	 */
	@Test
	void test1() {
		String input = "PAYPALISHIRING";
		int numRows = 3;
		
		String expected = 	"PAHNAPLSIIGYIR";
		String result = Q6_Solution.convert(input, numRows);
		assertEquals(result, expected);
	}

	/*
	 * Input: s = 	"PAYPALISHIRING", numRows = 4
	 * Output: 		"PINALSIGYAHRPI"
	 * 
	 * P     I    N
	 * A   L S  I G
	 * Y A   H R
	 * P     I
	 */
	@Test
	void test2() {
		String input = "PAYPALISHIRING";
		int numRows = 4;
	
		String expected = "PINALSIGYAHRPI";
		String result = Q6_Solution.convert(input, numRows);
		assertEquals(result, expected);
	}
}
