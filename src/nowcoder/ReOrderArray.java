package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

;

public class ReOrderArray {

	/**
	 * 题目描述 输入一个整数数组，实现一个函数来调整该数组中数字的顺序， 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
	 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
	 */

	public void reOrderArray(int [] array){
		int n = array.length;
		int a[] = new int [n];
		int b[] = new int [n];
		int j=0,k=0;
		for(int i=0 ; i<n ; i++){
			if(array[i]%2==0) a[j++] = array[i];
			else b[k++] = array[i];
		}
		for(int i=0 ; i<n ; i++){
			if(i<k)array[i] = b[i];
			else array[i] = a[i-k];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReOrderArray ROA = new ReOrderArray();
//		int a[] = { 10, 9, 8, 7, 4, 5, 6, 3, 2, 1 };
		int a[] = { 1,2,3,4,5,6,7};
		ROA.reOrderArray(a);
		for(Integer i :a){
			System.out.print(i + ", ");
		}
	}

}
