/**
 * 8. String to Integer (atoi)
 * 
 * Implement atoi which converts a string to an integer.  The function first 
 * discards as many whitespace characters as necessary until the first 
 * non-whitespace character is found. Then, starting from this character, takes 
 * an optional initial plus or minus sign followed by as many numerical digits 
 * as possible, and interprets them as a numerical value.
 * 
 * The string can contain additional characters after those that form the 
 * integral number, which are ignored and have no effect on the behavior of 
 * this function.
 * 
 * If the first sequence of non-whitespace characters in str is not a valid 
 * integral number, or if no such sequence exists because either str is empty 
 * or it contains only whitespace characters, no conversion is performed.
 * 
 * If no valid conversion could be performed, a zero value is returned.
 * 
 * Note:
 * 	Only the space character ' ' is considered as whitespace character.  
 * 
 * 	Assume we are dealing with an environment which could only store integers 
 * within the 32-bit signed integer range: [−2^31, 2^31 − 1]. If the numerical 
 * value is out of the range of representable values, 
 * INT_MAX (2^31 − 1) or INT_MIN (−2^31) is returned.
 * 
 * @author Franco B. Reda
 * 
 */
package Q8_String_to_Integer;

/**
 * 
 *
 */
public class Q8_Solution {
	public static int myAtoi(String str) {
		int index = 0, sign = 1, total = 0;
		//1. Empty string
		if(str.length() == 0) return 0;

		//2. Remove Spaces
		while(str.charAt(index) == ' ' && index < str.length())
			index ++;

		//3. Handle signs
		if(str.charAt(index) == '+' || str.charAt(index) == '-'){
			sign = str.charAt(index) == '+' ? 1 : -1;
			index ++;
		}
		
		//4. Convert number and avoid overflow
		while(index < str.length()){
			int digit = str.charAt(index) - '0';
			if(digit < 0 || digit > 9) break;

			//check if total will be overflow after 10 times and add digit
			if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

			total = 10 * total + digit;
			index ++;
		}
		return total * sign;
	}
}