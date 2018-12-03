package g4g.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n = Integer.parseInt(nStr);
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String sizes = sc.nextLine();
            String one = sc.nextLine();
            String two = sc.nextLine();
            arrayList.add(one+"-"+two);
        }
        for (int i = 0; i < n; i++) {
            String[] in = arrayList.get(i).split("-");
            findCommonSubStr(in[0], in[1]);
        }
    }

    /* abcd acde
     * d!=e > abcd,acd                       &                                   abc,acde
     *        d==d> 1+ abc,ac                             c!=e 0 + abc,acd                     & ab acde
     *        c==c 1+1+ab a                            c!=d ab acd  & abc ac                  b!=e a,acde ab,acd
     *        a!=b 0,   a,a  *ab "
     */


    public static int findCommonSubStr(String one, String two) {
        int n = one.length();
        int m = two.length();
        int[][] counts = new int[n][m];
        int max = 0;
        int startIndex = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (one.charAt(i) == two.charAt(m - 1)) {
                counts[i][m - 1] = 1;
                max = 1;
                startIndex = i;
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            if (one.charAt(n - 1) == two.charAt(i)) {
                counts[n - 1][i] = 1;
                max = 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                if (one.charAt(i) == two.charAt(j)) {
                    counts[i][j] = counts[i + 1][j + 1] + 1;
                    if (counts[i][j] > max) {
                        max = counts[i][j];
                        startIndex = i;
                    }
                }
            }
        }
        System.out.println(max);
        return 0;

    }
}
