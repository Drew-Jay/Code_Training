public class trailingZeros {

	public long cnt_Zeros(long n) {
		// write your code here, try to do it without arithmetic operators.
		long cnt = 0;
		while (true) {
			n = n / 5;
			if (n == 0)
				return cnt;
			cnt += n;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trailingZeros tz = new trailingZeros();
		int n = 11;
		System.out.println(tz.cnt_Zeros(11));
	}

}
