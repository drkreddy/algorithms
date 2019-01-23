package HackerEarth.com.challenges.expedia.circuits.jan;

import java.util.Scanner;

public class Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum=0;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(k>0){
                sum+=k;
            }
        }

        if(sum>0){
            System.out.println(sum+" 1");
        }else{
            System.out.println("0 0");
        }
    }
}
