package nowcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateOfArray {
    /**
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
     * 请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     *
     * @param numbers     一组整数
     * @param length      numbers的长度
     * @param duplication 存放重复的数字
     * @return 如果输入有效，且numbers中存在有重复的数字，则返回true，否则返回false
     */

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean res = false;
        Map map = new TreeMap();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(numbers[i]))
                map.put(numbers[i], (int) map.get(numbers[i]) + 1);
            else
                map.put(numbers[i], 1);
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if ((int) entry.getValue() > 1) {
                duplication[0] = (int) entry.getKey();
                res = true;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
