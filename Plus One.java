public class Solution {
	public static int[] plusOne(int[] digits) {
		int carry = 1;
		for (int i = digits.length - 1; i >= 0 && carry > 0; i--) {
			int sum = digits[i] + carry;
			digits[i] = sum % 10;
			carry = sum / 10;
		}

		if (carry == 0)
			return digits;

		int n = digits.length + 1;
		int result[] = new int[n];
		result[0] = 1;
		for (int i = 1; i < result.length; i++) {
			result[i] = digits[i - 1];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 9, 9, 9 };
		int[] n = plusOne(a);
		for (int i : n) {
			System.out.println(i);
		}
	}
}
