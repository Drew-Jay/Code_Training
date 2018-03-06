package Lintcode;

public class kthLargestElement {

	/*
	 * 在数组中找到第k大的元素
	 */
	
	public int kth_largest(int k, int[] nums){
		return k;
		
	}
	
	public void Quicksort(int[] nums, int left , int right) {
		int i=left+1,j=right;
		int mid = nums[left];
		if(left<right){
		while(i!=j){
			while(nums[j]>mid && j>i)j--;
			while(nums[i]<mid && i<j)i++;
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
		}
		nums[left] = nums[j];
		nums[j] = mid;
			
		Quicksort(nums, left, j-1);
		Quicksort(nums, j+1, right);
		}
	}
	
	public void Quicksort2(int[] nums, int left , int right) {
		int i=0,j=0;
		while(left < right){}	
	}
	
	public int partition(int[]a,int left,int right){
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kthLargestElement kle = new kthLargestElement();
		int [] a= {6,  1,  2, 7,  9,  3,  4,  5, 10,  8};
		int k = 2;
		for(int i:a) System.out.print(i+" ");
		System.out.println();
		
		kle.Quicksort(a, 0, a.length-1);
		for(int i:a) System.out.print(i+" ");
		System.out.println();
	}

}
