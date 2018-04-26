package com.dj.Arithmetic;

import java.util.Arrays;

public class MaxMthNum {
    public void getMaxMthNum(int[] a, int low, int high, int m) {
        if (a == null) return;
        int temp = partition(a, low, high);
        while (temp != m - 1) {
            if (temp > m - 1) {
                //
                high = temp - 1;
                temp = partition(a, low, high);
            } else {
                //
                low = temp + 1;
                temp = partition(a, low, high);
            }
        }
    }

    /**
     * 和快排一样，获得的是某次排序的参考基准
     *
     * @param a
     * @param low
     * @param high
     * @return
     */
    public int partition(int[] a, int low, int high) {
        int temp = a[low];
        while (low < high) {
            while (low < high && temp >= a[high])
                high--;
            a[low] = a[high];
            while (low < high && temp <= a[low])
                low++;
            a[high] = a[low];
        }
        a[high] = temp;
        return high;
    }

    public static void main(String[] args) {
        MaxMthNum main = new MaxMthNum();
        int[] a = {9, 7, 5, 3, 1, 6, 8, 4, 2, 10};
        int n = a.length - 1;
        int m = 5;
        System.out.println(Arrays.toString(a));
        main.getMaxMthNum(a, 0, n, m);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
