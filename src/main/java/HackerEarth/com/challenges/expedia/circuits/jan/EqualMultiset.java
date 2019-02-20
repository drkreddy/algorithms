package HackerEarth.com.challenges.expedia.circuits.jan;

import java.util.*;

public class EqualMultiset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[]a = new long[n];
        long[]b = new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
//            a.add(sc.nextLong());
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextLong();
//            b.add(sc.nextLong());


        }
//        Collections.sort(a);
//        Collections.sort(b);
        Arrays.sort(a);
        Arrays.sort(b);
        long count=0;
        long l=1000000007;
//        long big=9223372036854775807l;
//        long one=big-1;
//        long two =big-2;
//        long three =big-3;
//        long onel=one%l;
//        long twol=two%l;
//        long threel=three%l;
//        long sum=onel+twol+threel;
//        long suml=sum%l;
//
//        System.out.println("one is "+one);
//        System.out.println("two is "+two);
//        System.out.println("three is "+three);
//        System.out.println("one % l "+onel);
//        System.out.println("two % l "+twol);
//        System.out.println("three % l "+threel);
//
//        System.out.println("sum is "+sum);
//        System.out.println("suml is "+suml);

        for(int i=0;i<a.length;i++){
            long a1=a[i];
            long b1=b[i];
            count=(count+(Math.abs(a1-b1)%l));
        }
        long result =count%l;
        System.out.println(result);
    }
}
