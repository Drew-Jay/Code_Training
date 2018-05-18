package com.dj.ALibaba;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static int getSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int []a = new int[m*2];
        for (int i = 1; i <= m; i++) {
            String str = sc.nextLine();
            String[] s = str.split(",");
            a[2*i-1]= Integer.parseInt(s[0]);
            a[2*i] = Integer.parseInt(s[1]);
        }
//        int n = 4;
//        int m = 3;
////        int [][] a = {{1,4},{2,3},{7,3}};
//        int[] a = {1, 4, 2, 3, 7, 3};
//
        int[] flag = new int[2 * n];
        int j = 1;

        for (int i = 0; i < 2 * m; i++) {
            int temp = a[i];
            flag[temp]--;
        }

        for (int i = 0; i < n; i++) {


            if (getSum(a) == n)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        System.out.println(Arrays.toString(flag));
        System.out.println(Arrays.toString(a));

    }

}
