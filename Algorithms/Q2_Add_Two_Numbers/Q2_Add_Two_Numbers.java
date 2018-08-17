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

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

public class Q2_Add_Two_Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			
		}
		return dummyHead.next;
	}

}
