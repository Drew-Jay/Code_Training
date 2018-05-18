package com.dj.Arithmetic;

public class DP_packets {
    public int ZeroOnePacket(int[] value, int[] weight, int c){
        int [] dp = new int[c+1];
        for (int i = 0; i < weight.length; i++) {
            for (int j = c; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j],
                        dp[j-weight[i]]+ value[i] );
            }
        }
        return dp[c];
    }

    public int CompletePacket(int[] value, int[] weight, int c){
        int[] dp = new int[c+1];
        for (int i = 0; i < weight.length; i++) {
            for (int j = 1; j <= c; j++) {
                if(j>=weight[i])
                dp[j] = Math.max(dp[j],
                        dp[j-weight[i]]+value[i]);
            }
        }

        return dp[c];
    }

    public int MultiPacket(int[] value, int[] weight, int c, int[] num){
        int[] dp = new int[c+1];

        for (int i = 0; i < weight.length; i++) {
            for (int k = 0; k < num[i]; k++) {
                for (int j = c; j >= weight[i]; j--) {
                    dp[j] = Math.max(dp[j],
                            dp[j - weight[i]] + value[j]);
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        DP_packets main = new DP_packets();
        int[] value = {6, 3, 5, 4, 6};
        int[] weight = {2, 2, 6, 5, 4};
        int c = 10;

//        System.out.println(main.ZeroOnePacket(value, weight, c));
        System.out.println(main.CompletePacket(value, weight, c));
    }
}
