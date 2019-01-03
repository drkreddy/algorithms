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
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double avg=0;
        int current=0;
        for(int i=0;i<ar.length;i++){
            avg+=ar[i];
        }
        avg=avg/ar.length;

        for(int i=0;i<ar.length;i++){
           if(avg>ar[i]){
               current=ar[i]+k;
           }else{
               current=ar[i]-k;
           }
           if(min>current){
               min=current;
           }
           if(max<current){
               max=current;
           }
        }

       return mod(max-min);
    }
    private static int mod(int a){
        return a<0?-1*a:a;
    }
}

