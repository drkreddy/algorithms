package g4g.dp;

import java.util.Scanner;

public class PathInMatrixDP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int [][]a=new int[n][n];
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    a[j][k]=sc.nextInt();
                }
            }
            int [][]result=new int[n][n];
            int max=0;
            for(int j=0;j<n;j++){
                result[0][j]=a[0][j];
                if(result[0][j]>max){
                    max=result[0][j];
                }
            }

            for(int j=1;j<n;j++){
                for(int k=0;k<n;k++){
                    int m=0,l=0,r=0;
                    if(k==0){
                        m=result[j-1][k];
                        r=result[j-1][k+1];

                    }else if(k==n-1){
                        l=result[j-1][k-1];
                        m=result[j-1][k];
                    }else{
                        l=result[j-1][k-1];
                        m=result[j-1][k];
                        r=result[j-1][k+1];
                    }

                    result[j][k]=a[j][k]+Math.max(l,Math.max(m,r));
                    if(result[j][k]>max){
                        max=result[j][k];
                    }
                }
            }
            System.out.println(max);
        }

    }
}
