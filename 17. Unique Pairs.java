class Solution {
    public int uniquePaths(int m, int n) {
        //Dynamic Programming Approach
        // int [][] dp = new int[m][n];
        // for(int[] row: dp) {
        //     Arrays.fill(row, -1);
        // }
        // int paths = getPaths(0, 0, m-1, n-1, dp);
        // return paths;


        // Optimal Approach (Combinatorics)
        int N = m+n-2;
        int r= m-1;
        double res = 1;

        for(int i=1; i<=r; i++) {
            res = res *(N-r+i)/i;
        }
        return (int)res;
    }
    public int getPaths(int r, int c, int m, int n, int[][] dp) {
        if(r == m && c == n) return 1;
        if(r > m || c>n) return 0;

        if(dp[r][c] != -1) return dp[r][c];
        else return dp[r][r] = getPaths(r+1, c, m, n, dp) + getPaths(r, c+1, m, n, dp);
    }   
    
}
