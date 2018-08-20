/**
 * 
 * 
 * Note: Assume we are dealing with an environment which could only store 
 * integers within the 32-bit signed integer range: [−231,  231 − 1]. For the 
 * purpose of this problem, assume that your function returns 0 when the 
 * reversed integer overflows.
 * 
 * @author Franco B. Reda
 * 
 */
package Q7_Reverse_Integer;

/**
 * 
 *
 */
public class Q7_Solution {
	public static int reverse(int x) {
		int rev = 0;
		while(x != 0){
			if (rev > Integer.MAX_VALUE/10 ) return 0;
			if (rev < Integer.MIN_VALUE/10 ) return 0;
			rev = rev*10 + x%10;
			x = x/10;
		}
		return rev;
	}
}
