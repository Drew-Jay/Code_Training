package com.dj.KuaiShou;

import java.util.*;


public class Main2 {
    public String fun(int n) {
        boolean flag = false;
        int k = n;
        int cnt = 0;

        while(k>0){
            k = k>>1;
            cnt++;
        }
        int[] coin = new int[cnt];
        coin[0] = 1;
        for (int i = 1; i < cnt; i++) {
            coin[i] = coin[i - 1] << 1;
        }

        int[] dp = new int[n+1];

        for (int i = 0; i <= n; i++) {
            dp[i] = i;
        }



        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < coin.length; j++) {
                if (i-coin[j]>=0 && dp[i-coin[j]]+1 < dp[i])
                    dp[i] =dp[i-coin[j]]+1;
            }
        }
        if (dp[n]==1)
            return "lucky";
        else
            return "don't be discouraged";
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int a = sc.nextInt();
            System.out.println(main.fun(a));
            n--;
        }
        System.out.println(main.fun(3));
        System.out.println(main.fun(5));
//        System.out.println(main.fun(6));
//        System.out.println(main.fun(7));
        System.out.println(main.fun(8));


    }
}
