package com.dj.Arithmetic;

import java.util.Arrays;

public class DP_MaxSubSeq {

    /**
     * 最长公共子序列（longest common sequence）
     * 和最长公共子串（longest common substring）
     * 不是一回事儿
     * 最长子序列不是最长子串
     * 子序列可以不连续
     * 子串必须连续
     */

    public  int[][] lcs(int []s1,int []s2){
        int n = s1.length;
        int m = s2.length;
        int [][] dp = new int[n+1][m+1];


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(s1[i-1] == s2[j-1])
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j],
                            dp[i][j-1]
                    );
            }
        }

        return dp;
    }


    public static void main(String[] args) {
        DP_MaxSubSeq main = new DP_MaxSubSeq();
        int[] s1 = {1, 3, 4, 5, 6, 7, 7, 8};
        int[] s2 = {3, 5, 7, 4, 8, 6, 7, 8, 2};

        int [][]a = main.lcs(s1,s2);
        for (int i = 0; i <= s1.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
