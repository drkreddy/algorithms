package g4g.greedy;

import java.util.Scanner;

public class GeekCollectBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] N =new int[n];
            int[] M = new int[m];
            for(int j=0;j<n;j++){
                N[j]=sc.nextInt();
            }
            for(int j=0;j<n;j++){
                M[j]=sc.nextInt();
            }

            int r=0;
            int s=0;
            int one=0;
            int two=0;

            while(r<n && s<m){
                if(N[r]==M[s]){
                    int max=Math.max(one,two);
                    max+=N[r];
                    one=two=max;
                    if(r==n-1){
                        one=two=max+N[r];
                        r++;
                        break;
                    }
                    if(s==n-1){
                        one=two=max+N[r];
                        s++;
                        break;
                    }
                    if((r+1)<n && N[r]==N[r+1]){
                        r++;
                    }else if((s+1)<m && M[s]==M[s+1]){
                        s++;
                    }else {
                        r++;
                        s++;
                    }
                    continue;
                }

                if(N[r]<M[s]){
                    one+=N[r];
                    r++;
                }else{
                    two+=M[s];
                    s++;
                }
            }

            if(r==n){
                for(int k=s;k<m;k++){
                    two+=M[s];
                }
            }

            if(s==m){
                for(int k=r;k<n;k++){
                    one+=M[r];
                }
            }

           System.out.println( Math.max(one,two));

        }
    }
}
