package nowcoder;

public class UglyNum {
    /***
     * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
     * 例如6、8都是丑数，但14不是，因为它包含因子7。
     * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
     */

    public int GetUglyNumber_Solution(int index) {
        int[] a = new int[index];
        a[0] = 1;
        int m2 = 0;
        int m3 = 0;
        int m5 = 0;
        int nextUgly = 1;
        while (nextUgly < index) {
            int temp = getMin(a[m2] * 2, a[m3] * 3, a[m5] * 5);
            a[nextUgly] = temp;
            System.out.println(a[nextUgly]);
            while (a[m2] * 2 <= a[nextUgly])
                m2++;
            while (a[m3] * 3 <= a[nextUgly])
                m3++;
            while (a[m5] * 5 <= a[nextUgly])
                m5++;
            nextUgly++;
        }
        return a[index - 1];
    }

    public int getMin(int a, int b, int c) {
        int temp = a < b ? a : b;
        int temp2 = temp < c ? temp : c;
        return temp2;
    }

    public static void main(String[] args) {
        UglyNum main = new UglyNum();
        main.GetUglyNumber_Solution(100);
//        System.out.println(main.GetUglyNumber_Solution(11));
    }


}
