public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = m + n - 1, i = m - 1, j = n - 1;
		while (j >= 0)
		        //error:indexoutofbound
			if (i < 0 || nums1[i] < nums2[j])
				nums1[index--] = nums2[j--];
			else
				nums1[index--] = nums1[i--];
	}
}
