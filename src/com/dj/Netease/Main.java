package com.dj.Netease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public long solution(long n, long k) {
		long cnt = 0;
		long x, y;
		for (x = k; x<n; x++) {
			cnt += n - x;
		}
		
//		for (x = n, y = 1; x != y ; y++) {
//			if (y > n) {
//				y = 1;
//				x--;
//			}
//			if (x % y >= k)
//				cnt++;
//		}

		return cnt;
	}

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		BufferedReader scanner = new BufferedReader(new InputStreamReader(
				System.in));
		String str;
		while ((str = scanner.readLine()) != null) {
			String[] a = str.split(" ");
			System.out.println(main.solution(Long.parseLong(a[0]),
					Long.parseLong(a[1])));
		}
	}
}
