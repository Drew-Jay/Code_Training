package nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FindKthNum {
    /**
     * 输入n个整数，找出其中最小的K个数。
     * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
     */

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> firstKth = new ArrayList<>();
        if (input.length == 0 || input == null || k>input.length) return firstKth;

        int low = 0;
        int high = input.length - 1;
        int temp = partition(input, low, high);

        while (temp != k - 1) {
            if (temp > k - 1) {
                high = temp - 1;
                temp = partition(input, low, high);
            } else {
                low = temp + 1;
                temp = partition(input, low, high);
            }
        }


        for (int i = 0; i < k; i++) {
            firstKth.add(input[i]);
        }

        Collections.sort(firstKth);
        return firstKth;
    }

    public int partition(int[] a, int low, int high) {
        int key = a[low];
        while (low < high) {
            while (low != high && key <= a[high])
                high--;
            a[low] = a[high];
            while (low != high && key >= a[low])
                low++;
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 1, 6, 2, 7, 3, 8};
        FindKthNum main = new FindKthNum();
        ArrayList al = main.GetLeastNumbers_Solution(a, 4);
        Iterator iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
