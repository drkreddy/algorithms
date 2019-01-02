package g4g.greedy;

import java.util.Scanner;

public class MinNumberCoins {
    static int coins[]={2000,500,200,100,50,20,10,5,2,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            findChange(N);
        }
    }

    private static void findChange(int n) {
        int i=0;
        while(n>0){
            if(n>=coins[i]){
                System.out.print(coins[i]+" ");
                n-=coins[i];
            }else{
                i++;
            }
        }

    }
}
