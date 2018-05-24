package nowcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindNumbersWithSum {
    /**
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
     * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     */

    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        ArrayList al = new ArrayList();
        if (array == null || array.length == 0) return al;
        int low = 0;
        int high = array.length - 1;

        Map map = new HashMap();
        while (low < high) {
            if(array[low] + array[high] == sum) {
                map.put(array[low], array[high]);
                high--;
                low++;
            }
            else if(array[low] + array[high] > sum){
                high--;
            }else
                low++;
        }
        if(map.isEmpty()) return al;
        Iterator it = map.entrySet().iterator();
        int s = 65536, a = 0, b = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if ((int) entry.getKey() * (int) entry.getValue() < s) {
                a = (int) entry.getKey();
                b = (int) entry.getValue();
                s = a * b;
            }
        }

        al.add(a);
        al.add(b);
        return al;
    }

    public static void main(String[] args) {
        FindNumbersWithSum main = new FindNumbersWithSum();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList al = main.findNumbersWithSum(a, 6);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
