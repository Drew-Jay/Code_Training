package com.dj.Arithmetic;

import java.util.Arrays;

public class Sort {
    /**
     * 归并排序主程序
     * @param a
     * @param low
     * @param high
     */
    public void mergeSort(int[] a, int low, int high) {
        if (a == null) return;

        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);

            merge(a, low, mid, high);
        }
    }

    /**
     * 归并排序子程序
     * @param a
     * @param low
     * @param high
     */
    public void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[a.length];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if(a[i] < a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }
        while (i <= mid) {

            temp[k++] = a[i++];

        }
        while (j <= high) {

            temp[k++] = a[j++];

        }

        for (int l = 0; l < k; l++) {
            a[low + l] = temp[l];
        }
    }

    public void bubbleSort(int []a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
    }

    public void quickSort(int[]a , int low, int high){
        if(low>high) return;
        int i = low;
        int j = high;
        int key = a[low];
        while(i<j){
            while(i<j && a[j]>key) j--;
            while(i<j && a[i]<key) i++;
            if(i<j){
                int p = a[j];
                a[i] = a[j];
                a[j] = p;
            }
        }
        int p = a[low];
        a[low] = a[i];
        a[i] = a[low];
        quickSort(a,low, i-1);
        quickSort(a,i+1,high);
    }

    public void insertSort(int []a){
        if(a == null) return ;
        int n = a.length;
        int insertNum;
        for (int i = 1; i < n; i++) {
            insertNum = a[i];
            int j = i;
            while(j>0 && a[j-1]>insertNum){
                a[j] = a[j-1];
                j--;
            }
            a[j] = insertNum;
        }
    }


    public void selectSort(int[]a){
        int len=a.length;
        for(int i=0;i<len;i++){//循环次数
            int value=a[i];
            int position=i;
            for(int j=i+1;j<len;j++){//找到最小的值和位置
                if(a[j]<value){
                    value=a[j];
                    position=j;
                }
            }
            a[position]=a[i];//进行交换
            a[i]=value;
        }
    }

    public static void main(String[] args) {

        int[] a = {9, 1, 2, 3, 7, 8, 4, 6, 5, 10};

        Sort MS = new Sort();
//        MS.mergeSort(a, 0, a.length - 1);
//        System.out.println(Arrays.toString(a));

//        MS.bubbleSort(a);
//        System.out.println(Arrays.toString(a));


//        MS.bubbleSort(a);
//        System.out.println(Arrays.toString(a));
//
//        MS.insertSort(a);
//        System.out.println(Arrays.toString(a));

        MS.selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}
