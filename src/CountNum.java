
public class CountNum {

	/*
	 *统计数字
	 *计算数字k在0到n中的出现的次数，k可能是0~9的一个值
	 * */
	int digitCounts(int k, int n) {
        // write your code here
		StringBuilder s = new StringBuilder();
		s.append("#");
		for(int i=0 ; i<=n ; i++){
			s.append(i);
		}
		s.append("#");
		
		String str = s.toString();
		String KK = String.valueOf(k);
		String [] ss = str.split(KK);
		
		return ss.length-1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNum CN = new CountNum();
		int k = 1;
		int n = 1;
		System.out.println(CN.digitCounts(k, n));
	}

}
