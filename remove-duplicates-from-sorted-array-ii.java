public class Solution {
	public int removeDuplicates1(int[] nums) {
		int index = 0;
		int n = nums.length;
		for (int i = 0; i < n; ++i) {
			if (i > 0 && i < n - 1 && nums[i] == nums[i - 1]
					&& nums[i] == nums[i + 1])
				continue;
			nums[index++] = nums[i];
		}
		return index;
	}

	//拓展性更好index可以是３，４等
	public int removeDuplicates2(int[] nums) {
		int n = nums.length;
		if (n <= 2)
			return n;
		int index = 2;
		for (int i = 2; i < n; i++) {
			if (nums[i] != nums[index - 2])
				nums[index++] = nums[i];
		}
		return index;
	}
}
