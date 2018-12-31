package g4g.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CoinPiles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String Tstr=reader.readLine();
        int T = Integer.parseInt(Tstr);
        for(int i=0;i<T;i++){
            String Nk = reader.readLine();
            String N = Nk.split(" ")[0];
            int k = Integer.parseInt(Nk.split(" ")[1]);
            String data=reader.readLine();
            int[] ar = Arrays.stream(data.split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
            System.out.println(removeCoins(ar,k));
        }
    }

    private static int removeCoins(int[] ar, int k) {
        int result=0;
        Arrays.sort(ar);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            int count=0;
            for(int j=0;j<ar.length;j++){
                if(ar[j]<ar[i]){
                    count+=ar[j];
                }else if(ar[j]>ar[i]+k){
                    count+=ar[j]-ar[i]-k;
                }
            }
            min=min>count?count:min;
        }
        return min;
    }

}

/*

42 468
335 501 170 725 479 359 963 465 706 146 282 828 962 492 996 943 828 437 392 605 903 154 293 383 422 717 719 896 448 727 772 539 870 913 668 300 36 895 704 812 323 334

 */