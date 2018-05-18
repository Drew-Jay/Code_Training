package com.dj.Arithmetic;

public class DP_Packet {
    /**
     * https://blog.csdn.net/tinyguyyy/article/details/51203935
     */




    /**
     * 01背包问题，每个物品只有一件，只能选择用或者不用，不能使用多次
     */
    public int ZeroOnePacket(int[] value, int[] weight, int c) {
        int[] dp = new int[c + 1];

        for (int i = 0; i < weight.length; i++) {
            for (int j = c; j >= weight[i]; j--) {  //01背包从大往小缩减空间
                dp[j] = Math.max(dp[j],
                        dp[j - weight[i]] + value[i]
                );
            }
        }
        return dp[c];
    }

    /**
     * 完全背包问题，每个物品无限多，无数量限制，可以使用多次
     */
    public int CompletePacket(int[] value, int[] weight, int c) {
        int[] dp = new int[c + 1];
        for (int i = 0; i < weight.length; i++) {
            for (int j = weight[i]; j <= c; j++) {
                if (j >= weight[i])
                    dp[j] = Math.max(dp[j],
                            dp[j - weight[i]] + value[i]
                    );
            }
        }
        return dp[c];
    }


    /**
     * 多重背包问题，每个物品有限多，数量存在限制num[]，可以使用多次但不能超过上限
     */
    public int MultiPacket(int[] value, int[] weight, int c, int[] num) {
        int[] dp = new int[c + 1];
        for (int i = 0; i < weight[i]; i++) {
            for (int j = 0; j < num[i]; j++) {
                for (int k = c; k >= weight[i]; k++) {
                    dp[i] = Math.max(dp[i],
                            dp[k - weight[i]] + value[i]
                    );
                }
            }
        }
        return dp[c];
    }


    public static void main(String[] args) {
        DP_Packet main = new DP_Packet();
        int[] value = {6, 3, 5, 4, 6};
        int[] weight = {2, 2, 6, 5, 4};
        int c = 10;

//        System.out.println(main.ZeroOnePacket(value, weight, c));
        System.out.println(main.CompletePacket(value, weight, c));
    }
}
