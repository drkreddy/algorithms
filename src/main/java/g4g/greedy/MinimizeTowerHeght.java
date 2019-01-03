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
        int prev=ar[0];
        int max = ar[0]+k;
        int min = ar[0]>=k?ar[0]-k:max;
        int current;

        for (int i = 1; i < ar.length; i++) {
            current=ar[i];
            if(current<k){
                current=current+k;
            }else
            if(min>current){
                current=current+k;
            }else if(max < current){
                current=current-k;
            }else{
                int localmax=current+k;
                int localMin=current-k;

                if((localMin >=min && localMin<=max)
                || (localmax>=min && localmax<=max)){
                    continue;
                }
                int upperdif = max-localmax;
                int lowerdiff = min-localMin;
                upperdif=upperdif<0?upperdif*-1:upperdif;
                lowerdiff=lowerdiff<0?lowerdiff*-1:lowerdiff;

                if(lowerdiff<upperdif) {
                    current = localMin;
                }else {
                    current= localmax;
                }
            }


           if(min>current){
               min=current;
           }
           if(max<current){
               max=current;
           }


        }
        return max-min;
    }
}
