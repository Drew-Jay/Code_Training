package nowcoder;

public class GetNumFromArrayInOrder {
    /**
     * 统计一个数字在排序数组中出现的次数。
     */

    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) return 0;
        if(array.length==1){
            if (array[0]==k)
                return 1;
            else
                return 0;
        }
        int pos = BinSearch(array, k);
        if(pos == -1) return 0;
        int count = 1;
        int i = pos-1;
        while(i>=0){
            if(array[i] == k)   count++;
            i--;
        }
        i = pos+1;
        while(i<array.length){
            if(array[i] == k)   count++;
            i++;
        }
        return count;
    }

    public int BinSearch(int[] a, int k) {
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] == k)
                return mid;
            else if (a[mid] < k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        GetNumFromArrayInOrder main = new GetNumFromArrayInOrder();

//        int[] a = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10};
        int[] a = {1};
        System.out.println(main.GetNumberOfK(a, 1));
    }
}
