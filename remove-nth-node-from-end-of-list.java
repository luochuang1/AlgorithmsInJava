public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || n <= 0)
			return null;

		// dummy node in case pointer out of list bound
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode preDelete = dummy;

		// find n node this is the fast pointer
		for (int i = 0; i < n; i++) {
			head = head.next;
		}

		// move fast and slow pointer at the same time
		while (head != null) {
			head = head.next;
			preDelete = preDelete.next;
		}

		preDelete.next = preDelete.next.next;

		return dummy.next;
	}
}
