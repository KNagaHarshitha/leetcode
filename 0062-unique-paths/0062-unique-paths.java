class Solution {
    public int solve(int i, int j, int m, int n, int[][] dp) {
        if(i >= m || j >= n) {
            return 0; // This block was missing a closing brace
        }
        if(i == m - 1 && j == n - 1)
            return 1;
        if(dp[i][j] != -1)
            return dp[i][j];
        else
            return dp[i][j] = solve(i + 1, j, m, n, dp) + solve(i, j + 1, m, n, dp);
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        Arrays.stream(dp).forEach(i -> Arrays.fill(i, -1));
        return solve(0, 0, m, n, dp);
    }
}
