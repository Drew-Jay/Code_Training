package nowcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumPlus {

	/**
	 * 为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,
	 * 然后再加上原先的数得到"相反数"。例如,为了得到1325的"相反数",
	 * 首先我们将该数的数字顺序颠倒,我们得到5231,之后再加上原先的数,
	 * 我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,前缀零将会被忽略。
	 * 例如n = 100, 颠倒之后是1. 
	 */
	public int reverseNumPlus(String str) {
		int origin = Integer.parseInt(str);
		StringBuilder sb = new StringBuilder(str);
		int reverse = Integer.parseInt(sb.reverse().toString());
		
		return origin + reverse;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ReverseNumPlus main = new ReverseNumPlus();
		BufferedReader scanner = new BufferedReader(new InputStreamReader(
				System.in));
		String str ;	

		while ((str = scanner.readLine()) != null) {
		System.out.println(main.reverseNumPlus(str));
		}
	}

}
