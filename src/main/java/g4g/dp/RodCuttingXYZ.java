package g4g.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RodCuttingXYZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            a=new HashMap<>();
            System.out.println(maxcuts(n,x,y,z));
        }
    }
static Map<Integer,Integer> a;

    private static int maxcuts(int n, int x, int y, int z) {

        if(n==0){
            return 0;
        }

        if(a.get(n)!=null){
            return a.get(n);
        }

        if(n<x && n<y && n<z){
            return  -1000;
        }
       int result=1+ Math.max(maxcuts(n-x,x,y,z),Math.max(maxcuts(n-y,x,y,z),maxcuts(n-z,x,y,z)));
        a.put(n,result);
      return result;
    }
}
