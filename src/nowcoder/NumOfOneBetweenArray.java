package nowcoder;

public class NumOfOneBetweenArray {
    /**
     * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
     * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
     * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
     */

    public int NumberOf1Between1AndN_Solution(int n) {
        /*
        if (n < 1) return 0;
        int sum = 0;

        String str = Integer.toString(n);
        int len = str.length();

        int[] digit = new int[len];
        int m = n;
        int high=n,i=1;

        while(high !=0){
            high = n / i;
            int temp = n % i;
            int cur = (temp * 10) / i;
            int low = (temp * 10) % i;
            System.out.println(" high: " + high);
            System.out.println(" temp: " + temp);
            System.out.println(" cur: " + cur);
            System.out.println(" low: " + low);

            if (cur == 1) {
                sum += high * i/10 + low + 1;
            } else if (cur > 1) {
                sum += high * i/10;
            } else {
                sum +=(high+1)* i / 10;
            }

            System.out.println(" sum: " + sum);
            System.out.println("=============");
            i*=10;
        }

*/
        return 0;

    }


    public static void main(String[] args) {
        NumOfOneBetweenArray main = new NumOfOneBetweenArray();
        int n = 13;
        System.out.println(main.NumberOf1Between1AndN_Solution(n));
    }
}
