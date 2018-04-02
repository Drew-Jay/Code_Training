package nowcoder;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ColorfulBricks {

    /**
     * @param args
     * @throws IOException
     */

    static int howMuchSort(String s) {
        if (s.length() == 0)
            return 0;
        ArrayList<Character> temp = new ArrayList<Character>();
        char c = s.charAt(0);
        int cnt = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                temp.add(s.charAt(i));
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
                }
            }
        }
        if (cnt == 1)
            return 1;
        else if (cnt == 2)
            return 2;
        else return 0;
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        ColorfulBricks CB = new ColorfulBricks();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(
                System.in));
        String str;
        while ((str = scanner.readLine()) != null) {
            System.out.println(CB.howMuchSort(str));
        }
    }

}
