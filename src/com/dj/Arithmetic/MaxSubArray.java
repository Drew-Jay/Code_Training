package com.dj.Arithmetic;

/**
 * 给定一个整数数组，数组里可能有正数、负数和零。
 * 数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
 * 求所有子数组的和的最大值。
 * 例如，如果输入的数组为{1,-2,3,10,-4,7,2,-5}，
 * 和最大的子数组为{3,10,-4,7,2}，
 * 那么输出为该子数组的和18。
 */


public class MaxSubArray {
    public int calcMaxArray(int[] a) {
        if(a.length ==0 || a == null ) return 0;

        int result = a[0];
        int temp = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < a.length; i++) {
            if (temp >= 0)
                temp += a[i];
            else {
                    temp = a[i];
                    start = i;
            }

            if (temp >= result) {
                result = temp;
                end = i;
            }
        }

//        for (int i = start; i <= end; i++) {
//            System.out.print(a[i] + " ");
//        }
//
//        System.out.println();

        return result;
    }

    public static void main(String[] args) {
        MaxSubArray main = new MaxSubArray();
//        int[] A = {1, -2, 3, 10, -4, 7, 2, 10, -5, 4};
        int[] A = {-1, -2};

        System.out.println(main.calcMaxArray(A));
    }
}
