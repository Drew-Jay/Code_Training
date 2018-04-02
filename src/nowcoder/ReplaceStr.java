package nowcoder;

public class ReplaceStr {
	/**
	 * 题目描述
	 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
	 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
	 * */
	public String replaceSpace(StringBuffer str) {
		str.insert(0, "*");
		str.append("*");
		for(int i=0 ; i<str.length() ; i++){
			if(Character.isSpaceChar(str.charAt(i))){
				str.deleteCharAt(i);
				str.insert(i, "%20");
			}
		}
		str.deleteCharAt(0);
		str.deleteCharAt(str.length()-1);
		return str.toString();

	}

	public static void main(String[] args) {
		ReplaceStr rs = new ReplaceStr();
		StringBuffer SB = new StringBuffer();
		SB.append("We Are Happy");
		System.out.println(rs.replaceSpace(SB));
	}
}
