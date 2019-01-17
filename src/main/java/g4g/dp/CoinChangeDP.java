package g4g.dp;

import java.util.Scanner;

public class CoinChangeDP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int in=0;in<t;in++){
            int n = sc.nextInt();
            int coins[]=new int[n];
            for(int index=0;index<n;index++){
                coins[index]=sc.nextInt();
            }
            int target=sc.nextInt();
            System.out.println(NoOfways(coins,coins.length,target));
        }
    }

    private static int NoOfways(int[] coins, int length, int target) {

        int[] result=new int[target+1];
        result[0]=1;

        for(int i=0;i<length;i++){
            for(int j=coins[i];j<=target;j++){
                result[j]=result[j]+result[j-coins[i]];
            }
        }

        return result[target];

    }
}

/*
memotizzation of coinchange in recursion
 */

