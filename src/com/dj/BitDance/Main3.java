package com.dj.BitDance;

import java.io.*;
import java.util.*;

public class Main3 {
    public int solution(int b[], String s) {
        int count = 0;
        int l = b[3];
        int r = b[1] - b[3];
        int u = b[2];
        int d = b[0] - b[2];
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if (l == 0) {

                break;
            } else if (u == 0) {

                break;
            } else if (l < 0 || u < 0 || b[1] <= l || b[0] <= u) {
                //System.out.println(l+" "+u);
                count++;
                break;
            } else if (s1[i] == 'u') {
                u--;
                d++;
                count++;
                //System.out.println(l+" 1 "+u);
            } else if (s1[i] == 'd') {
                d--;
                u++;
                count++;
                //System.out.println(l+" 2 "+u);
            } else if (s1[i] == 'r') {
                r--;
                l++;
                count++;
                //System.out.println(l+" 3 "+u);
            } else if (s1[i] == 'l') {
                l--;
                r++;
                count++;
                //System.out.println(l+" 4 "+u);
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        Main3 main = new Main3();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(
                System.in));
        String str;
        String s;

        str = scanner.readLine();
        s = str;
        str = scanner.readLine();

        int N = Integer.parseInt(str);
        int result[] = new int[N];
        for (int i = 0; i < N; i++) {
            str = scanner.readLine();
            String[] a = str.split(" ");
            int[] b = new int[4];
            for (int j = 0; j < 4; j++) {
                b[j] = Integer.parseInt(a[j]);
            }

            result[i] = main.solution(b, s);
        }
        for(int a :result){
            System.out.println(a);
        }
    }
}
