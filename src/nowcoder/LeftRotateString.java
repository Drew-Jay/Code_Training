package nowcoder;

public class LeftRotateString {
    /**
     * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
     * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
     * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
     */
    public String leftRotateString(String str, int n) {
        String s2 = "" ;
        if (str == null || str.length() == 0) return s2;
        if (n >= str.length()) n %= str.length();
        String s1 = str.substring(0,n);
        s2 = str.substring(n,str.length());
        s2+=s1;
        return s2;
    }

    public static void main(String[] args) {
        LeftRotateString main = new LeftRotateString();
        String s = "abcdefg";
        System.out.println(main.leftRotateString(s, 2));
        System.out.println(main.leftRotateString(s, 3));
        System.out.println(main.leftRotateString(s, 4));
        System.out.println(main.leftRotateString(s, 5));

    }
}
