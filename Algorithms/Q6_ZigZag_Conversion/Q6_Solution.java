/**
 * 6. The string "PAYPALISHIRING" is written in a zigzag pattern on a given 
 * number of rows like this: (you may want to display this pattern in a fixed 
 * font for better legibility)
 * 
 * Input: s = "PAYPALISHIRING", numRows = 3;  len 14
 * Output: "PAHNAPLSIIGYIR"
 * 
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 
 * @author Franco B. Reda
 * 
 */
package Q6_ZigZag_Conversion;


public class Q6_Solution {	
	
	public static String convert(String s, int numRows) {
		int len = s.length();
		
		StringBuffer[] sb = new StringBuffer[numRows];
		for (int i = 0; i < sb.length; i++)
			sb[i] = new StringBuffer();
		
		int count = 0;
		while (count < len) {
			for (int i = 0; i < numRows && count < len; i++) // vertically down
				sb[i].append(s.charAt(count++));
			for (int j = numRows-2; j >= 1 && count < len; j--) // obliquely up
				sb[j].append(s.charAt(count++));
		}
		for (int k = 1; k < sb.length; k++)
			sb[0].append(sb[k]);
		return sb[0].toString();
	}

}
