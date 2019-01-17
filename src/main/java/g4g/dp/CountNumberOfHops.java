package g4g.dp;

import java.util.Scanner;

public class CountNumberOfHops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int []r =new int[n+1];
            r[0]=0;
            r[1]=1;
            r[2]=2;
            r[3]=4;
            for(int j=4;j<=n;j++){
                r[j]=r[j-1]+r[j-2]+r[j-3];
            }
            System.out.println(r[n]);
        }
    }
}
