/**
 * 3. Longest Substring Without Repeating Characters
 * 
 * Given a string, find the length of the longest substring without repeating 
 * characters.
 * Examples:
 * 	Given "abcabcbb", the answer is "abc", which the length is 3.
 * 	Given "bbbbb", the answer is "b", with the length of 1.
 * 	Given "pwwkew", the answer is "wke", with the length of 3. Note that the 
 * 	answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * @author Franco B. Reda
 * 
 */
package Q3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class Q3_Solution {
	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		//while references i and j is still in set
		while (i < n && j < n) {
			// try to extend the range [i, j]
			if (!set.contains(s.charAt(j))){	//if the set doesn't contain the character add it
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			}
			else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}
}
