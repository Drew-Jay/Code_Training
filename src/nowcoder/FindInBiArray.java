package nowcoder;

public class FindInBiArray {
	/**
	 * 题目描述
	 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
	 * 每一列都按照从上到下递增的顺序排序。
	 * 请完成一个函数，输入这样的一个二维数组和一个整数，
	 * 判断数组中是否含有该整数。
	 */
	public boolean Find(int target, int [][] array) {
		int row = array.length;
//		System.out.println(row);
		int column = array[0].length;
//		System.out.println(column);
		if(column==0) return false;
		
		boolean flag = false;
		outer:
		for(int i=0 ; i<row ; i++){
			if(target>=array[i][0] && target<array[i][column-1])
				for(int j=0 ; j<column ; j++)
					if(array[i][j] == target){
						flag = true;
						break outer;
					}
		}

		return flag;
		 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindInBiArray FIBA = new FindInBiArray();
//		int[][]a = {{1,2,3,4,5},
//					{10,12,15,17,19},
//					{20,22,25,26,28},
//					{31,34,35,38,39},
//					{40,44,46,47,48},
//					{50,51,52,53,54}				
//					};
//		int[][]a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int[][]a={{}};
		int n = 7;
		System.out.println(FIBA.Find(n, a));
	}

}
