package nowcoder;

import java.beans.IntrospectionException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IsRightPopOrder {
    /*
     * 题目描述
     * 输入两个整数序列，第一个序列表示栈的压入顺序，
     * 请判断第二个序列是否为该栈的弹出顺序。
     * 假设压入栈的所有数字均不相等。
     * 例如序列1,2,3,4,5是某栈的压入顺序，
     * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
     * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
     * （注意：这两个序列的长度是相等的）
     * */
    public boolean isPopOrder(int[] a, int[] b) {
        boolean result = false;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(a[0]);
        int j=0;
        for (int i = 1; i < a.length; ) {
            if (stack.peek().intValue() != b[j]) {
                stack.push(a[i++]);
            } else {
                j++;
                stack.pop();
            }
        }

        for(;j<b.length;j++){
            if(stack.peek().intValue() == b[j])
                stack.pop();
        }

        if (stack.size() == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws IOException {
        IsRightPopOrder main = new IsRightPopOrder();

        int[] aaa = {1, 2, 3, 4, 5};
        int[] bbb = {4, 5, 3, 2, 1};
//        int[] bbb = {4, 3, 5, 1, 2};
        System.out.println(main.isPopOrder(aaa, bbb));

//
//        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
//        String str;
//        while ((str = scanner.readLine()) != null) {
//            String a = str;
//            str = scanner.readLine();
//            String [] aa = a.split(" ");
//            String [] bb = str.split(" ");
//            int [] aaa = new int[aa.length];
//            int [] bbb = new int[bb.length];
//            for (int i = 0; i <aa.length ; i++) {
//
//            }
//            main.isPopOrder(aaa,bbb);
//        }

    }
}
