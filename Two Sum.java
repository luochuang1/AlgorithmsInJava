public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 0)
			return null;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hashMap.put(nums[i], i + 1);
		}

		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(target - nums[i])) {
				int index1 = i + 1;
				int index2 = hashMap.get(target - nums[i]);

				if (index1 == index2)
					continue;

				result[0] = index1;
				result[1] = index2;

				return result;
			}
		}
		return result;
    }
}
