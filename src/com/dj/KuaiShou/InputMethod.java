package com.dj.KuaiShou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputMethod {
    public static void main(String[] args) throws IOException {
        /**
         * BufferedReader 方法
         */
        BufferedReader scanner = new BufferedReader(new InputStreamReader(
                System.in));
        String str;

        str = scanner.readLine();
        int N = Integer.parseInt(str);
        while ((str = scanner.readLine()) != null) {
            String[] a = str.split(" ");
//            System.out.println(main.solution(Integer.parseInt(a[0]),                    Integer.parseInt(a[1])));
        }


        /**
         * 常见的Scanner System.in
         */
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int n = sc.nextInt();
        while(n!=0){
            String s = sc.nextLine();
            String[] b = str.split(" ");
            n--;
        }

        while(sc.hasNext()){

        }


    }
}
