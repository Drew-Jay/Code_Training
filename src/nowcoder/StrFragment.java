package nowcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class StrFragment {

	/**
	 * 一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。
	 * 例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。
	 * 牛牛现在给定一个字符串,请你帮助计算这个字符串的所有碎片的平均长度是多少。
	 */
	public String getFragment(String s) {
		if (s.length() == 0)
			return "0.00";
		float n = s.length();
		ArrayList<Character> temp = new ArrayList<Character>();
		char c = s.charAt(0);
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c) {
				cnt++;
				for (int j = i; j < s.length(); j++)
					temp.add(s.charAt(j));
				break;
			}
		}

		while (temp.size() != 0) {
			c = temp.get(0);
			boolean flag = true;
			for (int i = 0; i < temp.size(); i++) {
				if (temp.get(i) == c) {
					temp.remove(i--);
					if (flag) {
						cnt++;
						flag = false;
					}
				} else
					break;
			}
		}
		
		float ft = n / cnt;
		 DecimalFormat   fnum  =   new  DecimalFormat("##0.00");  
		  String   dd=fnum.format(ft);
		  
		return dd;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StrFragment main = new StrFragment();
		BufferedReader scanner = new BufferedReader(new InputStreamReader(
				System.in));
		String str;
		while ((str = scanner.readLine()) != null) {
			System.out.println(main.getFragment(str));
		}
	}

}
