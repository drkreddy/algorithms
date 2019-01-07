package g4g.dAndC;

import java.util.Scanner;

public class FindElementNotRepatingInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int size=sc.nextInt();
            int[] ar=new int[size];
            for(int j=0;j<size;j++){
                ar[j]=sc.nextInt();
            }

            System.out.println(search(ar,0,size-1));
        }

    }

    private static int search(int[] ar, int s, int e) {
        if(s==e){
            return ar[s];
        }

        int mid=(s+e)/2;

        if(mid%2==1) {

            if (ar[mid] == ar[mid - 1]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }else{
            if (ar[mid] == ar[mid +1]) {
                s = mid ;
            } else {
                e = mid;
            }
        }


        return search(ar,s,e);


    }
}
