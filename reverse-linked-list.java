public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			// save head.next
			ListNode temp = head.next;
			// clear head.next
			head.next = pre;
			// point head to current
			pre = head;
			// point to next
			head = temp;
		}
		return pre;
	}
}
