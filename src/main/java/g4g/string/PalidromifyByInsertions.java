package g4g.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalidromifyByInsertions {
    public static void main(String[] args) throws IOException {
//        Instant start = Instant.now();
// CODE HERE       
//        Scanner sc = new Scanner(System.in);
//        String nStr = sc.nextLine();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String nStr = br.readLine();
//        String nStr = sc.nextLine();
    int n = Integer.parseInt(nStr);

    for(int index = 0;index<n;index++) {
        String one = br.readLine();
//        String one = sc.nextLine();
        System.out.println(palidrofy(one,one.length()));
    }
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start, finish).toMillis();
//        System.out.println(timeElapsed);
    }

     static int palidrofy(String input,int count) {

        int[][] table = new int[count][count];

        for(int gap=1;gap<count;gap++){
            for(int l=0,h=gap;h<count;l++,h++){
                table[l][h] = input.charAt(l)==input.charAt(h)?table[l+1][h-1]:Math.min(table[l+1][h],table[l][h-1])+1;
            }
        }
return table[0][count-1];
    }


}


//justintumblera