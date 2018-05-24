package nowcoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NumsAppearOnlyOnce {
    /**
     * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。
     */

    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                map.put(array[i],(int)map.get(array[i])+1);
            }else
                map.put(array[i],1);
        }

        Iterator it = map.entrySet().iterator();
        boolean is  = true;
        while(it.hasNext()){
            Map.Entry entry= (Map.Entry)it.next();
            int x = (int)entry.getKey();
            int y = (int)entry.getValue();
            if (y == 1){
                if (is){
                    num1[0] = x;
                    is = false;
                }
                else {
                    num2[0] = x;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        NumsAppearOnlyOnce main = new NumsAppearOnlyOnce();
        int[] a = {1,1,2,2,3,3,4,5,5,6,6,7,7,8};
        int[]res1 = new int[1];
        int[]res2 = new int[1];
        main.FindNumsAppearOnce(a,res1,res2);
        System.out.println(res1[0]);
        System.out.println(res2[0]);
    }
}
