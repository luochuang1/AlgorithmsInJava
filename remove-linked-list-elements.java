/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;
		while (head != null) {
			while (head.next != null && head.next.val == val) {
				head.next = head.next.next;
			}
			head = head.next;
		}
		return dummy.next;
    }
}
