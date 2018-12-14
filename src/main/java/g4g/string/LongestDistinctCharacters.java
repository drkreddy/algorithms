package g4g.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

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
        Map<Character,Integer> indexs = new HashMap<>();
        int max=0;
        int s=0;
        for(int i=0;i<input.length();i++){
            Character c = input.charAt(i);
            Integer indx =indexs.get(c);
            if(indx==null){
                indexs.put(c,i);
            }else {
                if(indx>=s) {
                    s = indx + 1;
                }
                indexs.put(c,i);
            }
            if((i-s+1)>max){
                max=i-s+1;
            }

        }
        return max;
    }
}

//werfvbjisrgvbn
// werfvbjisrgvbn