package g4g.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int in=0;in<t;in++){
            int n = sc.nextInt();
            int coins[]=new int[n];
            answerMap=new HashMap<>();
            for(int index=0;index<n;index++){
                coins[index]=sc.nextInt();
            }
            int target=sc.nextInt();
            System.out.println(NoOfways(coins,coins.length,target));
        }
    }

    static Map<Integer,Integer> answerMap;
    private static int NoOfways(int[] coins,int n, int target) {

        if(target==0){
            return 1;
        }
        if(target<0){
            return 0;
        }

        if(n<=0 && target>=1){
            return 0;
        }

        return NoOfways(coins,n-1,target)+NoOfways(coins,n,target-coins[n-1]);
    }
}
