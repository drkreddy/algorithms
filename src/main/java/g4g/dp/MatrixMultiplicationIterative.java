package g4g.dp;

import java.util.Scanner;
import java.util.Timer;

public class MatrixMultiplicationIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int index=0;index<t;index++){
            int n=sc.nextInt();
            int[] dimensions=new int[n];
            for(int k=0;k<n;k++){
                dimensions[k]=sc.nextInt();
            }
            System.out.println(matmul(dimensions));
        }
    }

    private static int matmul(int[] dimensions) {
        int size=dimensions.length;
        int [][] cost=new int[size][size];
        for(int i=0;i<size-1;i++){
            cost[i][i+1]=0;
        }

        for(int s=2;s<size;s++){
            for(int i=0;i<size-s;i++) {
                int j=i+s;
                int min=Integer.MAX_VALUE;
                for (int k = i + 1; k<j ; k++){
                    int temp = dimensions[i] * dimensions[k] * dimensions[j] + cost[i][k] + cost[k][j];
                    min = temp < min ? temp : min;
                }
                cost[i][j] =min;
            }
        }
        return cost[0][size-1];

    }
}
