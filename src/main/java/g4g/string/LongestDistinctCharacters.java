package g4g.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongestDistinctCharacters {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String nStr = br.readLine();
        int n = Integer.parseInt(nStr);

        for(int index = 0;index<n;index++) {
            String one = br.readLine();
            System.out.println(find(one));
        }
    }

    private static int find(String input) {

        return 0;
    }
}
