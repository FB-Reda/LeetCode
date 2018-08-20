/**
 * 13. Roman to Integer
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * 
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * For example, 
 * Two is written as II in Roman numeral, just two one's added together. 
 * Twelve is written as, XII, which is simply X + II. 
 * The number twenty seven is written as XXVII, which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right. 
 * However, the numeral for four is not IIII. Instead, the number four is 
 * written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There 
 * are six instances where subtraction is used:
 * 	I can be placed before V (5) and X (10) to make 4 and 9. 
 * 	X can be placed before L (50) and C (100) to make 40 and 90. 
 * 	C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * 
 * @author Franco B. Reda
 * 
 */
package Q13_Roman_to_Integer;

/**
 * 
 *
 */
public class Q13_Solution {
	public static int romanToInt(String s) {
		int sum=0;
		
		if(s.indexOf("IV")!=-1){sum-=2;}
		if(s.indexOf("IX")!=-1){sum-=2;}
		if(s.indexOf("XL")!=-1){sum-=20;}
		if(s.indexOf("XC")!=-1){sum-=20;}
		if(s.indexOf("CD")!=-1){sum-=200;}
		if(s.indexOf("CM")!=-1){sum-=200;}
		
		// Had some issue with s.length()-1 which passes tests here, but failed online
		for(int count = 0; count <s.length();count++) {
			if(s.charAt(count) == 'M')	sum += 1000;
			if(s.charAt(count) == 'D')	sum += 500;
			if(s.charAt(count) == 'C')	sum += 100;
			if(s.charAt(count) == 'L')	sum += 50;
			if(s.charAt(count) == 'X')	sum += 10;
			if(s.charAt(count) == 'V')	sum += 5;
			if(s.charAt(count) == 'I')	sum += 1;
		}
		
		return sum;
	}
}
