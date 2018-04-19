package com.dj.BitDance;

import java.io.*;
import java.util.*;

public class Main {


    public long solution(long a[]) {
        long a1 = a[0];
        long an = a[a.length - 1];
        long T = an - a1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] - a1 == an - a[i]) {
                if (a[i] - a1 <= T) ;
                T = a[i] - a1;
            }
        }
        return T;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(
                System.in));
        String str;
        long[] result;

        str = scanner.readLine();
        int N = Integer.parseInt(str);
        result = new long[N];

        for (int i = 0; i < N; i++) {
            str = scanner.readLine();
            String[] a = str.split(" ");
            int n = Integer.parseInt(a[0]);
            long[] Array = new long[n];
            Set<Long> set = new HashSet<Long>();

            for (int j = 0; j < n; j++) {
                Array[j] = Long.parseLong(a[j + 1]);
                set.add(Array[j]);
            }

            long a1 = Array[0];
            long an = Array[Array.length - 1];
            long T = an - a1;
            for (int j = 0; j < Array.length; j++) {
                if ((Array[j] - a1) == (an - Array[j])) {
                    if ((Array[j] - a1) <= T && set.contains(Array[j] - a1))
                        T = Array[j] - a1;
                }
            }
            result[i] = T;
        }

        for (int i = 0; i < N; i++)
            System.out.println(result[i]);


    }
}
