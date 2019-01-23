package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MonkandLuckyMinimum {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
       for(int i=0;i<t;i++){
           int n=sc.nextInt();
           int [] ar =new int[n];
           for(int j=0;j<n;j++){
               ar[j]=sc.nextInt();
           }
           int min=Integer.MAX_VALUE;
           int count=0;
           for(int k=0;k<n;k++){
               if(ar[k]<min){
                   min=ar[k];
                   count=1;
               }else if(ar[k]==min){
                   count++;
               }
           }
           System.out.println(count%2!=0?"Lucky":"Unlucky");
       }

    }
}
