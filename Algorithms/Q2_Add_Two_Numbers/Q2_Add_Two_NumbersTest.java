package Q2_Add_Two_Numbers;

/*
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


/*
 * When one list is longer than the other.
 * When one list is null, which means an empty list.
 * The sum could have an extra carry of one at the end, which is easy to forget.
 */
class Q2_Add_Two_NumbersTest {

	@Test
	void testAdd( ) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4); l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6); l2.next.next = new ListNode(4);
		ListNode expected = new ListNode(7);
		expected.next = new ListNode(0); expected.next.next = new ListNode(8);
		ListNode result;
		
		result = Q2_Add_Two_Numbers.addTwoNumbers(l1, l2);
		
		Assert.assertTrue((result.val == expected.val) && (result.next.val == expected.next.val));
	}
	
	
	@Test
	void testOneLongerList() {
		ListNode l1 = new ListNode(0);
		l1.next = new ListNode(1);
		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(1); l2.next.next = new ListNode(2);
		ListNode result, expected;
		
		result = Q2_Add_Two_Numbers.addTwoNumbers(l1, l2);
		fail("Not yet implemented"); // TODO
	}
	
	@Test
	void testOneNullList() {
		ListNode l1 = null;
		ListNode result;
		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(1);
		
		
		result = Q2_Add_Two_Numbers.addTwoNumbers(l1, l2);
		fail("Not yet implemented"); // TODO
	}
	
	@Test
	void testExtraCarryOfOne() {
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		ListNode l2 = new ListNode(1);
		ListNode result;
		
		result = Q2_Add_Two_Numbers.addTwoNumbers(l1, l2);
		fail("Not yet implemented"); // TODO
	}

}
