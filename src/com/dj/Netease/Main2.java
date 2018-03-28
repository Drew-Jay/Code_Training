package com.dj.Netease;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		HashMap<Integer, Integer> DiPi = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			DiPi.put(scanner.nextInt(), scanner.nextInt());
		}
		int[] Ai = new int[M];
		for (int i = 0; i < M; i++) {
			Ai[i] = scanner.nextInt();
		}
		show(Ai, DiPi);
	}

	public static void show(int[] Ai, HashMap<Integer, Integer> DiPi) {
		for (int i = 0; i < Ai.length; i++) {
			int max = 0;
			Iterator iterator = DiPi.keySet().iterator();
			while (iterator.hasNext()) {
				Integer Di = (Integer) iterator.next();
				if (Ai[i] >= Di) {
					if (max < DiPi.get(Di)) {
						max = DiPi.get(Di);
					}
				}
			}
			System.out.println(max);
		}
	}
}