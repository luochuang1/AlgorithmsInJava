import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	// Solution1 Time complexity: O(N^2), memory: O(1)
	public boolean containsDuplicate1(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					return true;
			}
		}
		return false;
	}

	// Solution2 Time complexity: O(N log N), memory: O(1)
	public boolean containsDuplicate2(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				return true;
			}
		}
		return false;
	}

	//Time complexity: O(N), memory: O(N)
	public boolean containsDuplicate3(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (!set.add(i)) {
				return true;
			}
		}
		return false;
	}
}
