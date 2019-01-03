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
        Arrays.sort(ar);
        int dif=mod(ar[ar.length-1]-ar[0]);
        int min,max;
        if(ar[0]+k>ar[ar.length-1]-k){
            max=ar[0]+k;
            min=ar[ar.length-1]-k;
        }else{
            max=ar[ar.length]-k;
            min=ar[0]+k;
        }
        for(int i=1;i<ar.length-1;i++){
            int add=ar[i]+k;
            int sub=ar[i]-k;

            if(sub>=min || add <=max){
                continue;
            }

            if(add-min < max-sub){
                max=add;
            }else {
                min=sub;
            }

        }



       return Math.min(dif,max-min);
    }
    private static int mod(int a){
        return a<0?-1*a:a;
    }
}

