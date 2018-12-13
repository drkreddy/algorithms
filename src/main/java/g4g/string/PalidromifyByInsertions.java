package g4g.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println(palidrofy(one,0,one.length()-1, one.length()));
    }
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start, finish).toMillis();
//        System.out.println(timeElapsed);
    }

     static int palidrofy(String input,int first,int last,int count) {

         if(first==last){
             return count-1;
         }
         if(first>last){
             return count;
         }
        if(input.charAt(first)==input.charAt(last)){
            return Math.min(count-2,palidrofy(input,first+1,last-1,count-2));
        }else {
            return Math.min(count,Math.min(palidrofy(input,first+1,last,count),palidrofy(input,first,last-1,count)));
        }
    }


}


//justintumblera