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
            for(int j=0;j<m;j++){
                M[j]=sc.nextInt();
            }

            int r=0;
            int s=0;
            int one=0;
            int two=0;
            int prev=0;

            while(r<n && s<m){

                if(N[r]<M[s]){
                    one+=N[r];
                    r++;
                }else if(N[r]> M[s]){
                    two+=M[s];
                    s++;
                }else{

                    int max=one<two?two:one;

                    one=max+N[r];
                    two=max+M[s];

                    if(r+1<n && N[r+1]==N[r]){
                        r++;
                    }else if(s+1<m && M[s+1]==M[s]){
                        s++;
                    }else{
                        r++;
                        s++;
                    }
                }
            }

            if(r<n){
                for(int k=r;k<n;k++){
                    one+=N[r];
                }
            }

            if(s<m){
                for(int k=s;k<m;k++){
                    two+=M[s];
                }
            }

           System.out.println( Math.max(one,two));

        }
    }
}



/*
    1 4 5 8 8 8
    2 8 9 9 9

*/