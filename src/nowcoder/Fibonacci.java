package nowcoder;

public class Fibonacci {

	/**
	 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
	 * n<=39
	 */
	public int fibonacci(int n){
//		if(n==1 || n==2)
//			return 1;
//		return fibonacci(n-1) + fibonacci(n-2);
		return (int) Math.pow(2, n-1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		int n=5;
		System.out.println(f.fibonacci(n));
	}

}
