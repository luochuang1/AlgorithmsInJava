public class Solution {
//1. 简单来讲，就是不断对某个议案投票，如果有人有别的议案，则将前面认为的议案的cnt减1，减到0换一个议案。
//如果存在majority number，那么这个议案一定不会被减到0，最后会胜出。
//2. 投票完成后，要对majority number进行检查，以排除不存在majority number的情况。如 1，2，3，4这样的数列，
//是没有majory number的。很简单，统计一下结果议案的票数，没有过半就是没有majority number.
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count ++;
            } else {
                if (candidate == nums[i]) {
                    count ++;
                } else {
                    count --;
                }
            }
        }
        return candidate;
    }
}
