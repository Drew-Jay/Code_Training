import java.util.ArrayList;

public class UglyNumber2 {

	/*
	 * 设计一个算法，找出只含素因子2，3，5 的第 n 小的数。 符合条件的数如：1, 2, 3, 4, 5, 6, 8, 9, 10, 12...
	 */

	public int nthUglyNumber(int n) {
		int cnt = 0;
		int result = 1;
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);

		for (int i = 1; i < n; i++) {

			int temp1 = arr.get(m1).intValue() * 2;
			int temp2 = arr.get(m2).intValue() * 3;
			int temp3 = arr.get(m3).intValue() * 5;
			int temp = (temp1 > temp2) ? temp2 : temp1;
			temp = (temp > temp3) ? temp3 : temp;
			arr.add(temp);

			if (temp == temp1)
				m1++;
			if (temp == temp2)
				m2++;
			if (temp == temp3)
				m3++;

		}
		
		for(Integer item : arr){
			System.out.println(item);
		}

		return arr.get(n - 1).intValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UglyNumber2 UN = new UglyNumber2();
		int n = 9;
		System.out.println(UN.nthUglyNumber(n));
	}

}
