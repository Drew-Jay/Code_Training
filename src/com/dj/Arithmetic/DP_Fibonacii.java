package com.dj.Arithmetic;

public class DP_Fibonacii {
    public int f1(int n){
        if(n<0) return 0;
        if(n==0||n==1)return 1;
        return f1(n-1) + f1(n-2);
    }

    public int f2(int n ){
        if(n<0) return 0;
        if(n==0||n==1)return 1;
        int []dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        DP_Fibonacii main = new DP_Fibonacii();
        int n = 30;
        long startTime=System.currentTimeMillis();
        System.out.println(main.f1(n));
        long endTime=System.currentTimeMillis();
        float excTime=(float)(endTime-startTime);
        System.out.println(excTime);

        startTime=System.currentTimeMillis();
        System.out.println(main.f2(n));
        endTime=System.currentTimeMillis();
        excTime=(float)(endTime-startTime);
        System.out.println(excTime);

    }
}
