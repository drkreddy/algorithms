package g4g.dAndC;

import java.util.Scanner;

public class FindKthElement {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int T = sc.nextInt();
        for(int k=0;k<T;k++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int kk = sc.nextInt();
            int[] N= new int[n1];
            int[] M=new int[n2];
            for(int i=0;i<n1;i++){
                N[i]=sc.nextInt();
            }
            for(int i=0;i<n2;i++ ){
                M[i]=sc.nextInt();
            }
        System.out.println(findKth(N,M,k));


        }

    }

    private static int findKth(int[] n, int[] m, int k) {

        return 0;
    }
}
