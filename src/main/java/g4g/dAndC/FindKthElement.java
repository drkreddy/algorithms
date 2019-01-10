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
        System.out.println(findKth(N,M,0,N.length,0,M.length,kk));


        }

    }

    private static int findKth(int[] n, int[] m, int start1, int end1,int start2,int end2, int k) {
        if(n.length==0){
            return  m[k-1];
        }
        if(m.length==0){
            return n[k-1];
        }

        if(k<0 || n.length+m.length<k){
            return -1;
        }

        int mid1 = (start1+end1-1)/2;
        int mid2 = (start2+end2-1)/2;
        if(mid1+mid2+2>k){
            if(n[mid1]<m[mid2]){
                return findKth(n,m,start1,end1,start2,mid2-1,k);
            }else {
                return findKth(n,m,start1,mid1-1,start2,end2,k);
            }
        }else {
            if(n[mid1]<m[mid2]){
                return findKth(n,m,mid1+1,end1,start2,end2,k-mid1-1);
            }else {
                return findKth(n,m,start1,end1,mid2,end2,k-mid2-1);
            }
        }

    }
}
