package HackerEarth.com.challenges.expedia.circuits.jan;

import java.util.*;

public class EqualMultiset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        List<Long> b = new ArrayList<>();
//        long[]a = new long[n];
//        long[]b = new long[n];
        for(int i=0;i<n;i++){
//            a[i]=sc.nextLong();
            a.add(sc.nextLong());
        }
        for(int i=0;i<n;i++){
//            b[i]=sc.nextLong();
            b.add(sc.nextLong());


        }
        for(int i=0;i<n;i++){
            if(b.remove(a.get(i))){
                a.remove(i);
            }
        }
        Collections.sort(a);
        Collections.sort(b);

//        Arrays.sort(b);
        double count=0;

        for(int i=0;i<a.size();i++){
//            long a1=a[i];
//            long b1=b[i];
            long a1=a.get(i);
            long b1=b.get(i);
            count+=Math.abs(a1-b1);
        }
        double result =count%(Math.pow(10,9)+7);
        String s= ""+result;
        System.out.println(s.split("\\.")[0]);
    }
}
