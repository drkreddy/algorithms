package g4g.dp;

import java.util.Scanner;

public class RodCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test=0;test<t;test++){
            int size=sc.nextInt();
            int[] prices=new int[size];
            for(int index=0;index<size;index++){
                prices[index]=sc.nextInt();
            }
            System.out.println(maxRevenue(size,prices));
        }
    }

    private static int maxRevenue(int size, int[] prices) {

        int [] revenue=new int[size+1];
        int [] cuts=new int[size+1];
        revenue[0]=0;
        revenue[1]=prices[0];

        for(int i=2;i<=size;i++){
            int q=-1;
            for(int j=0;j<i;j++){
                if(prices[i-j-1]+revenue[j]>q){
                    q=prices[i-j-1]+revenue[j];
                    cuts[i]=j;
                }

            }
            revenue[i]=q;
        }
        System.out.println(cuts[size]);
        return revenue[size];
    }

}
