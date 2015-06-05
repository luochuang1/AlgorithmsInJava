import java.util.Arrays;

public class Solution {
	// Solution 1
	// 简单来讲，就是不断对某个议案投票，如果有人有别的议案，则将前面认为的议案的count减1，减到0换一个议案。
	//如果存在majority number，那么这个议案一定不会被减到0，最后会胜出。
	public int majorityElement1(int[] nums) {
		int candidate = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				candidate = nums[i];
				count++;
			} else {
				if (nums[i] == candidate) {
					count++;
				} else {
					count--;
				}
			}
		}
		return candidate;
	}

	// Solution 2
	public int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
