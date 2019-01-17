package g4g.dp;

import java.util.Scanner;

public class SubSetSumRecrsve {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int []set =new int[n];
            for(int j=0;j<n;j++){
                    set[j]=sc.nextInt();
            }
            System.out.println(isPartitioned(set,n));
        }

    }

    private static String isPartitioned(int[] set, int n) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=set[i];
        }
        if(sum%2>0){
            return "NO";
        }

        int partitionSum=sum/2;

        return isSumExists(set, n, partitionSum) == true ? "YES" : "NO";
    }

    private static boolean isSumExists(int[] set, int n, int sum) {
        if(n==0 && sum!=0){
            return false;
        }

        if(sum==0){
            return true;
        }
        if(set[n-1]>sum){
            return isSumExists(set,n-1,sum);
        }

        return isSumExists(set,n-1,sum)|| isSumExists(set,n-1,sum-set[n-1]);
    }


    /*
    here we are passing n-1 in both because we dont have infinite supply of coins.
     */

}

