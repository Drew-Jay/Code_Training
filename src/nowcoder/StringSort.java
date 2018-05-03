package nowcoder;

import java.util.*;

public class StringSort {
    /**
     * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
     * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
     * 注：输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
     * A-Z 65- 90
     * a-z 97-122
     */
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();

        if (str.length() == 0 || str == null) return null;

        helper(str.toCharArray(), 0, result);

        Collections.sort(result);

        return result;

    }

    public static void helper(char a[], int index, ArrayList<String> result) {
        if (index == a.length - 1) result.add(new String(a));
        for (int i = index; i < a.length; i++) {
            if (i == index || a[i] != a[index]) {
                if (i != index)
                    swap(a, index, i);
//                System.out.println(Arrays.toString(a) + " " + index + " " + i);
                helper(a, index + 1, result);
                if (i != index)
                    swap(a, index, i);
//                System.out.println(Arrays.toString(a) + " " + index + " " + i);
            }
        }

    }

    public static void swap(char a[], int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        String s = "aBDcA";
//        String s = "bca";
        ArrayList<String> result = Permutation(s);
        for (String ss : result) {

            System.out.println(ss);
        }
    }

}
