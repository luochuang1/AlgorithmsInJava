public class Solution {
    public void sortColors(int[] nums) {
      if(nums == null || nums.length <= 1)
            return;

		int left = 0;
		int right = nums.length - 1;

		int i = 0;
		while (i <= right) {
			if (nums[i] == 0) {
				swap(nums, left, i);
				left++;
				i++;
			} else if (nums[i] == 1) {
				i++;
			} else {
				swap(nums, right, i);
				right--;
			}
		}

	}

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
