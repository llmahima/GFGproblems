//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.maxSquare(n, m, mat));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxSquare(int n, int m, int mat[][]) {
        int[][] dp = new int[n][m];
        int ans = 0; 
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 || j == m - 1) {
                    dp[i][j] = mat[i][j];
                } else {
                    if (mat[i][j] == 1) {
                        int min = Math.min(dp[i + 1][j + 1], Math.min(dp[i][j + 1], dp[i + 1][j]));
                        dp[i][j] = min + 1;
                    } else {
                        dp[i][j] = 0;
                    }
                }
                if (dp[i][j] > ans) {
                    ans = dp[i][j];
                }
            }
        }
        return ans;// code here
    }
}