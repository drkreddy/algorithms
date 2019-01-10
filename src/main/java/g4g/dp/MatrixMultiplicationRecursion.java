package g4g.dp;

import java.util.Scanner;

public class MatrixMultiplicationRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for(int i=0;i<tests;i++){
            size=sc.nextInt();
            int [] matrix_sizes=new int[size];
            for(int k=0;k<size;k++){
                matrix_sizes[k]=sc.nextInt();
            }
            System.out.println(minimumMultiplication(matrix_sizes,size));
        }
    }
    static int [][] cost;
    static  int size;

    private static int minimumMultiplication(int[] matrix_sizes,int size) {

        cost=new int[size][size];

       return cal(matrix_sizes,0,size-1);

    }

    private static int cal(int[] matrix_sizes, int i, int j) {

        if(i==j || i+1==j){
            return 0;
        }

        if(cost[i][j]>0){
            return cost[i][j];
        }

        int min=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int temp=matrix_sizes[i]*matrix_sizes[k]*matrix_sizes[j]+cal(matrix_sizes,i,k)+cal(matrix_sizes,k,j);
            min=temp<min?temp:min;
        }
        cost[i][j]=min;
        return min;
    }

}
