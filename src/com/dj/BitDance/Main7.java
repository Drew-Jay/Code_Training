package com.dj.BitDance;


import java.util.*;
import java.net.*;

public class Main7 {

    public int fun(String[] prefix, String element, int m, int n) {
        int result = -1;
        for (int j = 0; j < m; j++) {
            if (element.charAt(0) == prefix[j].charAt(0)) {
                int len = prefix[j].length();
                String temp = element.substring(0, len);
                if (prefix[j].equals(temp)) {
                    result = 1;
                    break;
                }
            }
        }

        return result;
    }

    public int fun2(byte[][] prefix, byte[] element, int m, int n) {
        int result = -1;
        for (int i = 0; i < m; i++) {
            if (element[0] < prefix[i][0])
                break;
            else if (element[0] == prefix[i][0] && element.length >= prefix[i].length) {
                int temp = 0;
                for (int j = 0; j < prefix[i].length; j++) {
                    if (prefix[i][j] == element[j])
                        temp++;
                }
                if (temp == prefix[i].length) {
                    result = 1;
                    break;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) throws Exception {
        Main7 main = new Main7();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        byte[][] pre = new byte[m][];
        for (int i = 0; i < m; i++) {
            String temp = sc.nextLine();
            pre[i] = new byte[temp.length()];
            pre[i] = temp.getBytes("utf-8");
        }

        sc.nextLine();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            String element = sc.nextLine();
            byte[] ele = element.getBytes("utf-8");

            result[i] = main.fun2(pre, ele, m, n);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }


//        int m = 6;
//        int n = 2;
//        String[] prefix = {"a", "bc", "d", "eba", "ebc", "f"};
//        String[] element = {"ebcc","ebd"};
//        for (int i = 0; i < n; i++) {
//            System.out.println(main.fun(prefix,element[i],m,n));
//        }


//        System.out.println(Arrays.toString(prefix));
    }
}
