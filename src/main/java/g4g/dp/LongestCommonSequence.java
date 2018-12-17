package g4g.dp;

import java.util.Scanner;

public class LongestCommonSequence {
    public static void main(String[] args) {

//        String one="ABCDEF";
//        String two="ACDFGHI";
        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n= Integer.parseInt(nStr);
        for(int i=0;i<n;i++) {
            sc.nextLine();
            String one=sc.nextLine();
            String two = sc.nextLine();
            System.out.println(lcs(one, two, one.length() - 1, two.length() - 1));
        }
    }

    private static int lcs(String one, String two,int n, int m) {

        if(n<0 || m<0){
            return 0;
        }
        if(one.charAt(n)==two.charAt(m)){
            return lcs(one,two,n-1,m-1)+1;
        }

        return Math.max(lcs(one,two,n-1,m),lcs(one,two,n,m-1));


    }
}
