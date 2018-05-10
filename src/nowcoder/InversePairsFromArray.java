package nowcoder;

import java.util.Arrays;

public class InversePairsFromArray {
    /**
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组,求出这个数组中的逆序对的总数P。
     * 并将P对1000000007取模的结果输出。
     * 即输出P%1000000007
     * <p>
     * 输入说明：
     * 题目保证输入的数组中没有的相同的数字
     * 数据范围：
     * 对于%50的数据,size<=10^4
     * 对于%75的数据,size<=10^5
     * 对于%100的数据,size<=2*10^5
     */

    public final static int N = 1000000007;


    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) return 0;
        int[] data = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            data[i] = array[i];
        }

        int result = devideMerge(array, data, 0, data.length - 1);
        return result;
    }

    public int devideMerge(int[] a, int[] b, int start, int end) {
        if (start == end) {
            return 0;
        }
        int mid = (end + start) / 2;
        int left = devideMerge(a, b, start, mid) % N;
        int right = devideMerge(a, b, mid + 1, end) % N;

        int i = mid;
        int j = end;
        int k = end;
        int count = 0;
        while (i >= start && j > mid) {
            if (a[i] > a[j]) {
                b[k--] = a[i--];
                count += j - mid;
                if (count > N) count = count % N;
            } else {
                b[k--] = a[j--];
            }
        }

        while (i >= start) {
            b[k--] = a[i--];
        }

        while (j > mid) {
            b[k--] = a[j--];
        }

        for (int s = start; s <= end; s++) {
            a[s] = b[s];
        }

        return left + right + count;

    }


    public static void main(String[] args) {
        int[] a = {7, 5, 6, 4};
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 0};
        InversePairsFromArray main = new InversePairsFromArray();
        System.out.println(main.InversePairs(a));
    }
}

