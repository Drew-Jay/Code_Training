package com.dj.Arithmetic;

public class RecursionToKnow {
    public static int i = 1;
    public static int sum = 0;

    public static void knowRecursion(int a) {
        if (a > 0) {
            a--;
            System.out.println("第" + i + "层");
            System.out.println("a-1 = " + a);
            i++;
        } else {
            System.out.println("——————————————");
            return;
        }

        knowRecursion(a);
        i--;
        System.out.println("第" + i + "层");
        System.out.println("a = " + a);
    }

    public static int knowFibonacci(int a) {
        if (a <= 0) return 0;
        if (a == 1) {
            System.out.println("a=1，初始值为1");
            System.out.println("————————————");
            return 1;
        }
        if (a == 2) {
            System.out.println("a=2，初始值为1");
            System.out.println("————————————");
            return 1;
        }

        System.out.println("第" + i + "层");
        i++;
        System.out.println("为了求的第" + a + "个数");

        int temp1 = knowFibonacci(a - 1);

        i--;
        System.out.println("第" + i + "层");
        System.out.println("为了求的第" + a + "个数");
        System.out.println("前第一个数:" + temp1);

        i++;
        System.out.println("第" + i + "层");
        System.out.println("为了求的第" + a + "个数");
        int temp2 = knowFibonacci(a - 2);

        i--;
        System.out.println("第" + i + "层");
        System.out.println("为了求的第" + a + "个数");
        System.out.println("前第二个数:" + temp2);
        System.out.println("要求的是第" + a + "个数:" + (temp1 + temp2));
        System.out.println("===============");

        return temp1 + temp2;
    }

    public static void main(String[] args) {
        int a = 6;
//        knowRecursion(10);
        System.out.println(knowFibonacci(a));
    }
}
