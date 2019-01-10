package g4g.dp;

import java.util.Scanner;

public class MinJumps {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            int[]a =new int[k];
            for(int j=0;j<k;j++){
                a[j]=sc.nextInt();
            }
            System.out.println(miJumps(a));
        }


    }

    private static int miJumps(int[] a) {
     int[] jumps=new int[a.length];
     jumps[0]=0;

     for(int i=0;i<a.length;i++){
         for(int j=i+1;j<=i+a[i];j++){
             if(j==a.length){
                 break;
             }
             if(jumps[j]==0){
                 jumps[j]=jumps[i]+1;
             }else{
                 jumps[j]=Math.min(jumps[i]+1,jumps[j]);
             }
         }
     }

    return jumps[a.length-1]>0?jumps[a.length-1]:-1;
    }

}
