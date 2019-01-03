package g4g.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTowerHeght {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++){
            int k =sc.nextInt();
            int n=sc.nextInt();
            int[] ar=new int[n];
            for(int j=0;j<n;j++){
                ar[j]=sc.nextInt();
            }
            System.out.println(minimize(ar,k));

        }
    }

    private static int minimize(int[] ar, int k) {

        int [] upper = new int[ar.length];
        int [] lower = new int[ar.length];
        int [] upperMindist = new int[ar.length];
        int [] lowerMindist = new int[ar.length];

        for(int i=0;i<ar.length;i++){
            upper[i]=ar[i]+k;
            if(ar[i]>k){
                lower[i]=ar[i]-k;
            }else {
                lower[i]=upper[i];
            }
        }
        upperMindist[0]=0;
        lowerMindist[0]=0;
        for(int i=1;i<ar.length;i++){
            upperMindist[i]=Math.min(mod(upper[i]-upper[i-1])+upperMindist[i-1],mod(upper[i]-lower[i-1])+lowerMindist[i-1]);
            lowerMindist[i]=Math.min(mod(lower[i]-upper[i-1])+upperMindist[i-1],mod(lower[i]-lower[i-1])+lowerMindist[i-1]);
        }
        return Math.min(upperMindist[ar.length-1],lowerMindist[ar.length-1]);
    }
    private static int mod(int a){
        return a<0?-1*a:a;
    }
}

