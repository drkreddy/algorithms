package g4g.dp;

import org.omg.CORBA.INTERNAL;

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
     for(int i=1;i<a.length;i++){
         int min= 20000000;
         for(int j=0;j<i;j++){
             if(i-j<=a[j]){
                 if(j>0 && jumps[j]==0)
                     continue;
                 int dist=jumps[j]+1;
                 min=dist<min?dist:min;
             }
         }

         jumps[i]=min==20000000?0:min;
     }
     return jumps[a.length-1]==0?-1:jumps[a.length-1];
    }

}
