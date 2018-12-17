package g4g.dp;

import java.util.Scanner;

public class LongesCommonSubSequenceDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n= Integer.parseInt(nStr);
        for(int i=0;i<n;i++) {
            sc.nextLine();
            String one=sc.nextLine();
            String two = sc.nextLine();
            System.out.println(lcs(one, two, one.length(), two.length()));
        }
    }

    private static int lcs(String one, String two, int n, int m) {
        int max=0;
        int[][] dp= new int[n][m];
        if(one.charAt(0)==two.charAt(0)){
            dp[0][0]=1;
            max=1;
        }
        for(int i=1;i<m;i++){
            if(one.charAt(0)==two.charAt(i)){
                dp[0][i]=1;
                max=1;
            }else {
                dp[0][i]=dp[0][i-1];
            }
        }
        for(int i=1;i<n;i++){
            if(one.charAt(i)==two.charAt(0)){
                dp[i][0]=1;
                max=1;
            }else{
                dp[i][0]=dp[i-1][0];
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(one.charAt(i)==two.charAt(j)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }

        return max;
    }
}

/*
LCS(n,m) = 1+lcs(n-1,m-1) if n==m
          max(lcs(n-1,m),lcs(m-1,n) n!=m

     A E D F H R
   A 1 0 0 0 0 0
   B 0
   C 0
   D 0
   G 0
   H 0

   ABCDGH
AEDFHR
 */