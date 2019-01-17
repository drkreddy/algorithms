package g4g.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ShortestCommonSupersequence {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for(int i=0;i<t;i++){
            String s=bf.readLine();
            String[] sarr=s.split(" ");
            System.out.println(sarr[0].length()+sarr[1].length()-lcs(sarr[0],sarr[1],sarr[0].length()-1,sarr[1].length()-1));
        }
    }

//    private static int lcs(String one, String two,int n,int m) {
//
//        if(n<0 || m<0){
//            return 0;
//        }
//        if(one.charAt(n)==two.charAt(m)){
//            return lcs(one,two,n-1,m-1)+1;
//        }
//
//        return Math.max(lcs(one,two,n-1,m),lcs(one,two,n,m-1));
//
//
//    }

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

        return max-1;
    }
}
