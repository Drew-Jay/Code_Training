
public class AplusB {

	//不用加号写加法运算
	/*
	 * 思路：运用异或、与 运算
	 * */
	int bitAdd(int a,int b)
	{
		System.out.print("a:\t"+a+"\t");
	    System.out.println(Integer.toBinaryString(a));
		System.out.print("b:\t"+b+"\t");
	    System.out.println(Integer.toBinaryString(b));
		if(b==0)
	        return a;
	    int sum = a^b;
	    System.out.print("sum:\t");
	    System.out.print(sum+"\t");
	    System.out.println(Integer.toBinaryString(sum));
	    
	    int carry =(a&b)<<1;
	    System.out.print("a&b:\t");
	    System.out.print(a&b);
	    System.out.println("\t"+Integer.toBinaryString(a&b));
	    System.out.print("carry:\t");
	    System.out.print(carry);
	    System.out.println("\t"+Integer.toBinaryString(carry));
	    
	    System.out.println("-----------\n");
	    return bitAdd(sum,carry);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AplusB ab = new AplusB();
		int a=8;
		int b=8;
		System.out.println(ab.bitAdd(a, b));
		
	}

}
