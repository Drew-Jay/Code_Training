package nowcoder;

import java.util.Arrays;

public class T_VerifySeqOfBST {
    public static boolean VerifySquenceOfBST(int[] sequence) {

        if (sequence == null||sequence.length <= 0) return false;


        int n = sequence.length - 1;
        int root = sequence[n];
        int i = 0;
        for (; i < n; i++) {
            if (sequence[i] > root) break;
        }

        int j = i;
        for (; j < n; j++) {
            if (sequence[j] < root)
                return false;
        }

        boolean left = true;
        if (i > 0) {
            int[] newOne = Arrays.copyOfRange(sequence, 0, i);
            left = VerifySquenceOfBST(newOne);
        }

        boolean right = true;
        if (i < n) {
            int[] newOne = Arrays.copyOfRange(sequence, i, j);
            right = VerifySquenceOfBST(newOne);
        }

        return left && right;

    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 7, 6, 4};
        int[] b = {1, 2, 7, 6, 4};
        int[] c = {6, 3, 2, 5, 4};
        System.out.println(VerifySquenceOfBST(a));

        System.out.println(VerifySquenceOfBST(b));

        System.out.println(VerifySquenceOfBST(c));
    }
}
