package HackerEarth.com.challenges.expedia.circuits.jan;

import java.util.Scanner;

public class Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int[][] t=new int[n][n];
        int max=0;
        for(int i=0;i<n;i++){
            t[i][i]=a[i];
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                t[i][j]=t[i][j-1]+a[j];
                if(t[i][j]>max){
                    max = t[i][j];
                }
            }
        }
        if(max==0){
            System.out.println("0 0");
        }else {
            System.out.println(max+" 1");
        }

    }
}
