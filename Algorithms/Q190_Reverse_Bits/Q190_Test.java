package Q190_Reverse_Bits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q190_Test {

	/**
	 * Input: 43261596
	 * Output: 964176192
	 * Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
	 * 		return 964176192 represented in binary as 00111001011110000010100101000000.
	 */
	@Test
	void test() {
		int input = 43261596;
		int expected = 964176192;
		int result = Q190_Solution.reverseBits(input);
		
		System.out.println(result);
		assertEquals(expected, result);
	}

}
