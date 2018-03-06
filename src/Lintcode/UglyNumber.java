package Lintcode;
import java.util.ArrayList;

public class UglyNumber {

	/*
	 * 设计一个算法，找出只含素因子2，3，5 的第 n 小的数。 符合条件的数如：1, 2, 3, 4, 5, 6, 8, 9, 10, 12...
	 */

	public int nthUglyNumber(int n) {
		int cnt = 0;
		int result = 1;

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < 3; j++) {
				int temp = arr.get(i);
				switch (j) {
				case 0:
					temp *= 2;
					break;
				case 1:
					temp *= 3;
					break;
				case 2:
					temp *= 5;
					break;
				}
				if (arr.contains(temp))
					continue;
				else {
					int l = arr.size() - 1;
					if (temp > arr.get(l).intValue())
						arr.add(temp);
					else
						while (true) {
							if (temp > arr.get(l).intValue()) {
								arr.add(l+1, temp);
								break;
							}
							l--;
						}
				}
			}
		}
		return arr.get(n-1).intValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UglyNumber UN = new UglyNumber();
		int n = 9;
		System.out.println(UN.nthUglyNumber(n));
	}

}
