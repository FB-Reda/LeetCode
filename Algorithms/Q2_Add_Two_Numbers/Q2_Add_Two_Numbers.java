/**
 * 2. Add Two Numbers
 * 
 * You are given two non-empty linked lists representing two non-negative 
 * integers. The digits are stored in reverse order and each of their nodes 
 * contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except
 * the number 0 itself.
 * 
 * @author Franco B. Reda
 */
package Q2_Add_Two_Numbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Q2_Add_Two_Numbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Initialize current node to dummy head of the returning list.
		ListNode dummyHead = new ListNode(0);
		// Initialize p and q to head of l1 and l2 respectively.
		ListNode p = l1, q = l2, curr = dummyHead;
		// Initialize carry to  0
		int carry = 0;
		// Loop through lists l1 and l2 until you reach both ends.
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;//set x to node p's val. If p reaches the end of l1, set to 0
			int y = (q != null) ? q.val : 0;//set y to node q's val. If q reaches the end of l2, set to 0
			// Set sum = x + y + carry.
			int sum = x + y + carry;
			//Update carry = sum/10
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			//Advance both p and q
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		// Check if carry = 1, if so append a new node with digit 1 to the returning list.
		if (carry > 0)
			curr.next = new ListNode(carry);
		//Return dummy head's next node.
		return dummyHead.next;
	}
}
