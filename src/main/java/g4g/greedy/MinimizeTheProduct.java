package g4g.greedy;

import java.util.*;
        import java.lang.*;
        import java.io.*;

class MinimizeTheProduct {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            long [] A = new long[n];
            long [] B = new long[n];
            for(int j=0;j<n;j++){
                A[j]=sc.nextLong();
            }
            for(int j=0;j<n;j++){
                B[j]=sc.nextLong();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            long product=0;
            for(int k=0;k<n;k++){
                product+=A[k]*B[n-k-1];
            }
            System.out.println(product);
        }
    }
}