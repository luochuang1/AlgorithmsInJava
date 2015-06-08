public class Solution {
	public int[][] generateMatrix(int n) {
		int[][] ret = new int[n][n];
		if (n == 0) {
			return ret;
		}

		int top = 0, bottom = n - 1, left = 0, right = n - 1;
		int num = 1;
		while (top <= bottom) {
			if (top == bottom) {
				ret[top][top] = num++;
				break;
			}

			// first line.
			for (int i = left; i < right; i++) {
				ret[top][i] = num++;
			}

			// right line;
			for (int i = top; i < bottom; i++) {
				ret[i][right] = num++;
			}

			// bottom line;
			for (int i = right; i > left; i--) {
				ret[bottom][i] = num++;
			}

			// left line;
			for (int i = bottom; i > top; i--) {
				ret[i][left] = num++;
			}

			top++;
			bottom--;
			left++;
			right--;
		}

		return ret;
	}
}
