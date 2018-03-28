package nowcoder;

import java.util.ArrayList;

public class Matrix {

	/**
	 * 题目描述 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字， 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11
	 * 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
	 */
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		int rows = matrix.length;
		int clns = matrix[0].length;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<rows && j<clns){
			int k = i;
			int l = j;
			//第一行向右
			for(;l<clns;l++){
				result.add(matrix[k][l]);
			}
			l--;
			//最后一列向下
			for(k++;k<rows;k++){
				result.add(matrix[k][l]);
			}
			k--;
			//最后一行向左
			//k和i若相等，说明到最后一个了；
			for(l--;l>=j && k!=i;l--){
				result.add(matrix[k][l]);
			}
			l++;
			//第一列向上
			//l和j若相等，说明到最后一个了；
			for(k--;k>i && l!=clns-1;k--){
				result.add(matrix[k][l]);
			}
			
			i++;
			j++;
			rows--;
			clns--;
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix M = new Matrix();
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		/*
				int[][] a = { { 1, 2, 3, 4 ,5}, 
					  { 6, 7, 8 ,9,10}, 
					  { 11, 12, 13, 14, 15},
					  { 16, 17, 18, 19, 20},
					  { 21, 22, 23, 24, 25} };
					 */
		ArrayList<Integer> aa = M.printMatrix(a);
		for (Integer i : aa)
			System.out.println(i);
	}

}
