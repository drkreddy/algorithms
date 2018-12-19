package g4g.dp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class knapsackProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String NStr = sc.nextLine();
        int N= Integer.parseInt(NStr);
        for(int i=0;i<N;i++){
            String nStr = sc.nextLine();
            int n= Integer.parseInt(nStr);
            String WStr = sc.nextLine();
            int W= Integer.parseInt(WStr);
            String weigSr = sc.nextLine();
            int weights[] = Arrays.stream(weigSr.split(" ")).mapToInt(x->Integer.parseInt(x)).toArray();
            String valuesStr = sc.nextLine();
            int values[] = Arrays.stream(valuesStr.split(" ")).mapToInt(x->Integer.parseInt(x)).toArray();

            int j=knapsack(n,W,values,weights);
            System.out.println(j);
        }

    }

    private static int knapsack(int n, int W, int[] values, int[] weights) {

        int[][]B =new int[n][W];

        if(W==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            B[i][0]=0;
        }
        for(int i=0;i<W;i++){
            B[0][i]=0;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<W;j++){
                if(weights[i]<=W){
                    int w1=W-weights[i];
                    if(w1>0 && (values[i]+B[i-1][w1])>B[i-1][j]){
                        B[i][j]=values[i]+B[i-1][w1];
                    }else{
                        B[i][j]=B[i-1][j];
                    }
                }else {
                    B[i][j]=B[i-1][j];
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<W;j++){
                System.out.print(B[i][j]+"-");
            }
            System.out.println();
        }
        return B[n-1][W-1];
    }


}
