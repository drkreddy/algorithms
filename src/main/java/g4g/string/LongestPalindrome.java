package g4g.string;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n = Integer.parseInt(nStr);
        for(int i=0;i<n;i++){
            String in = sc.nextLine();
            longestPalindrome(in);
        }
    }

    private static void longestPalindrome(String input) {
        boolean[][] table = new boolean[input.length()][input.length()];
        int n=table.length;
        for(int i=0;i<n;i++){
            table[i][i]=true;
        }
        int start =0;
        int maxLength=1;
        for(int i=0;i<n-1;i++){
             if(input.charAt(i)==input.charAt(i+1)){
                 table[i][i+1]=true;
                 start=i;
                 maxLength=2;
             }
        }

        for(int k=3;k<=n;k++){

            for(int i=0;i<n-k+1;i++){
                int j = i+k-1;
                if(table[i+1][j-1] && input.charAt(i)==input.charAt(j)){
                    table[i][j]=true;
                    if(maxLength<k){
                        start=i;
                        maxLength=k;
                    }
                }
            }

        }

        System.out.println(start);
        System.out.println(maxLength);
        for(int i=start;i<start+maxLength;i++){
            System.out.print(input.charAt(i));
        }
        System.out.println();

    }
}
