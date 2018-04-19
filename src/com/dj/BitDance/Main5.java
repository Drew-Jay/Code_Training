package com.dj.BitDance;

import java.io.*;
import java.util.*;

public class Main5 {
    public int solution(int a, int b, int c) {
        int mod = 0;
        int count = 0;
        if (c < (a > b ? b : a)) {
            return 0;
        } else if (c < (a > b ? a : b)) {
            mod = c % (a > b ? b : a);
            count = c / (a > b ? b : a);
            if (mod == 0)
                count++;;
        } else {
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        Main5 main = new Main5();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(
                System.in));
        String str;
        str = scanner.readLine();
        int N = Integer.parseInt(str);
        int[]result = new int[N];
        int a, b, c;
        for (int i = 0; i < N; i++) {
            str = scanner.readLine();
            String[] aa = str.split(" ");
            a = Integer.parseInt(aa[0]);
            b = Integer.parseInt(aa[1]);
            c = Integer.parseInt(aa[2]);
            result[i] = main.solution(a,b,c);
        }

        for (int i = 0; i < N; i++)
            System.out.println(result[i]);

    }
}
