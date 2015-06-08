public class Solution {
	public static int maxSubArray(int[] nums) {
		int sum = 0, maxsum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (sum < 0)
				sum = 0;
			sum += nums[i];
			maxsum = Math.max(sum, maxsum);
		}
		return maxsum;
	}

	public static void main(String[] args) {
		int[] a = { -1,-2};
		System.out.println(maxSubArray(a));
	}
}
