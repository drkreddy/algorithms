package g4g.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonSubStringRecursion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String nStr = sc.nextLine();
            int n = Integer.parseInt(nStr);
            List<String> arrayList = new ArrayList<>();
            for (int index = 0; index < n; index++) {
                String one = sc.nextLine();
                String two = sc.nextLine();
                arrayList.add(one+"--"+two);
            }
            for (int i = 0; i < n; i++) {
                String[] in = arrayList.get(i).split("--");
                System.out.println("started");
                System.out.println(findCommonSubStr(in[0], in[1], in[0].length()-1, in[1].length()-1,0));
            }
        }



    private static int findCommonSubStr(String s, String s1,int n, int m, int count) {
        if(n<0 || m<0){
            return count;
        }

        if(s.charAt(n)==s1.charAt(m)){
            count=count+1;
            return max(count,findCommonSubStr(s,s1,n-1,m-1,count),0);
        }

        return max(count,findCommonSubStr(s,s1,n-1,m,0),findCommonSubStr(s,s1,n,m-1,0));

    }

    private static int max(int a,int b,int c){
        return a>b?c>a?c:a:c>b?c:b;
    }
}
