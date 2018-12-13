package g4g.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static g4g.string.PalidromifyByInsertions.palidrofy;

public class PalindromDP {
    public static void main(String[] args) throws IOException{
            BufferedReader bar = new BufferedReader(new InputStreamReader(System.in));
            String ntr = bar.readLine();
            int n = Integer.parseInt(ntr);

            for (int index = 0; index < n; index++) {
                String one = bar.readLine();
                System.out.println(palidrofy(one, 0, one.length() - 1));
            }
        }

        static int palidrofy (String input,int first, int last ){
        if(first>last){
            return Integer.MAX_VALUE;
        }
        if(first==last){
            return 0;
        }
        //justintumblera
        if(first==last-1){
            return input.charAt(first)==input.charAt(last)?0:1;
        }
        if(input.charAt(first)==input.charAt(last)){
            return palidrofy(input,first-1,last-1);
        }else{
            return Math.min(palidrofy(input,first+1,last)+1,palidrofy(input,first,last-1)+1);
        }

    }
}
