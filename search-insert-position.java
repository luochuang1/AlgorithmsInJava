public class Solution {
    public int searchInsert(int[] A, int target) {
     if (A == null || A.length == 0)
			return 0;
		int start = 0;
		int end = A.length - 1;

		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (target == A[mid])
				return mid;
			else if (A[mid] > target)
				end = mid;
			else {
				start = mid;
			}
		}

		if (A[start] >= target)
			return start;
		else if (A[end] >= target)
			return end;
		else {
			return end + 1;
		}
    }
}
