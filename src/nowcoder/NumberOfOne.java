package nowcoder;
import java.*;

public class NumberOfOne {

	/**
	 * 题目描述
	 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
	 */
	
	public int NumberOf1(int n) {
		String str = Integer.toBinaryString(n);
		System.out.println(str);
		int cnt=0;
		for(int i=0 ; i<str.length() ; i++){
			if(str.charAt(i) == '1')
				cnt++;
		}
		return cnt;
	}
	
	public double Power(double base, int exponent) {
		
		return Math.pow(base, exponent);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfOne NOO = new NumberOfOne();
		int a = 6;
		System.out.println(NOO.NumberOf1(a));
	}

}
