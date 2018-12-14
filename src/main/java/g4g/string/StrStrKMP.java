package g4g.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrStrKMP {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numberOflines = bufferedReader.readLine();
        int na = Integer.parseInt(numberOflines);
        for(int inx = 0;inx<na;inx++) {
            String inp = bufferedReader.readLine();
            String[] s = inp.split(" ");
            System.out.println(find(s[0],s[0]));
        }
    }

    private static int find(String input,String pat) {


        return 0;
    }
}


