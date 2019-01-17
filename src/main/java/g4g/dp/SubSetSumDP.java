package g4g.dp;

import java.util.Scanner;

public class SubSetSumDP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int []set =new int[n];
            for(int j=0;j<n;j++){
                set[j]=sc.nextInt();
            }
            System.out.println(isPartitioned(set,n));
        }

    }

    private static String isPartitioned(int[] set, int n) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=set[i];
        }
        if(sum%2>0){
            return "NO";
        }

        int partitionSum=sum/2;

        boolean[] result=new boolean[partitionSum+1];
        result[0]=true;

        for(int i=0;i<n;i++) {
            for (int j = set[i]; j < partitionSum; j++) {
                result[j] = result[j] || result[j - set[i]];
            }
        }

        return result[partitionSum]?"YES":"NO";

    }
}

