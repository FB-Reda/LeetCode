/**
 * 9. Palindrome Number
 * 
 * Determine whether an integer is a palindrome. An integer is a palindrome 
 * when it reads the same backward as forward.
 * 
 * @author Franco B. Reda
 * 
 */
package Q9_Palindrome_Number;

public class Q9_Solution {
	public static boolean isPalindrome(int x) {
		// Can't be Palindrome if it's negative
		if (x < 0 || (x % 10 == 0 && x != 0))
			return false;
		
		int revertedNumber = 0;
		while(x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}
		
		/** 
		 * When the length is an odd number, we can get rid of the middle digit 
		 * by revertedNumber/10.
		 */
		return x == revertedNumber || x == revertedNumber/10;
	}
}
