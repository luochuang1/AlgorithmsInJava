public class Solution {
    public int uniquePaths(int m, int n) {
       if (m <= 0 || n <= 0) {
            return 0;
        }
        
        int[][] D = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    D[i][j] = 1;
                } else if (i == 0) {
                    D[i][j] = D[i][j - 1];
                } else if (j == 0) {
                    D[i][j] = D[i - 1][j];
                } else {
                    D[i][j] = D[i - 1][j] + D[i][j - 1];
                }
            }
        }
        
        return D[m  - 1][n - 1];
    }
}
