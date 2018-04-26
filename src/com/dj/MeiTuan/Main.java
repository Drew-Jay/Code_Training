package com.dj.MeiTuan;

import java.io.*;
import java.util.*;

public class Main {

    public int gcd(int a, int b) {
        if (a == b) return a;
        int temp, t = 0;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) return 0;
        while (a != b) {
            if ((a & 1) == 1) {
                if ((b & 1) == 1) {
                    temp = a;
                    a = (a + b) >> 1;
                    b = (temp - b) >> 1;
                } else {
                    b = b >> 1;
                }
            } else {
                if ((b & 1) == 1) {
                    a = a >> 1;
                    if (a < b) {
                        temp = a;
                        a = b;
                        b = temp;
                    }
                } else {
                    a = a >> 1;
                    b = a >> 1;
                    t++;
                }
            }
        }
        a = a << t;
        return a;
    }

    public int solution(int N, int n, int m, int p) {
        int a[] = new int[N];
        a[0] = p;
        for (int i = 1; i < N; i++) {
            a[i] = (a[i - 1] + 153) % p;
        }
        int sum = 0;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < m; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i < j) {
                    dp[i][j] = gcd(i, j);
                } else if (i == j) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = dp[j][i];
                }

                sum += a[dp[i][j] - 1];

            }
        }

        //System.out.println(Arrays.toString(a));
        return sum;
    }

    public int solution2(int N, int n, int m, int p) {
        int a[] = new int[N];
        a[0] = p;
        for (int i = 1; i < N; i++) {
            a[i] = (a[i - 1] + 153) % p;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                    sum += a[gcd(i, j) - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        BufferedReader scanner = new BufferedReader(new InputStreamReader(
//                System.in));
//        String str;
//        while ((str = scanner.readLine()) != null) {
//            String[] a = str.split(" ");
//            int N = Integer.parseInt(a[0]);
//            int n = Integer.parseInt(a[1]);
//            int m = Integer.parseInt(a[2]);
//            int p = Integer.parseInt(a[3]);
//            System.out.println(main.solution(N, n, m, p));
//        }

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            int n = in.nextInt();
            int m = in.nextInt();
            int p = in.nextInt();
            System.out.println(main.solution(N, n, m, p));

            System.out.println(main.solution2(N, n, m, p));
        }
    }
}
