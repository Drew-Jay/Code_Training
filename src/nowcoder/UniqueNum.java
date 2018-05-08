package nowcoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueNum {
    /***
     * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置。
     */

    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0|| str ==null)
            return 0;
        LinkedHashMap map = new LinkedHashMap();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int num = (int) map.get(str.charAt(i));
                map.put(str.charAt(i), num + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        char aim = '1';
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            if((int)entry.getValue() == 1){
                aim = (char)entry.getKey();
                break;
            }
        }
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == aim)
            {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        UniqueNum main = new UniqueNum();
        String s = "google";
        System.out.println(main.FirstNotRepeatingChar(s));
    }
}
